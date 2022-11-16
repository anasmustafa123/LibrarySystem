package backend;
import contents.FileNames;
//import java.awt.print.Book;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;


public class LibrarianRole implements FileNames{
    BookDatabase bookDatabase=new BookDatabase(BOOKS_FILENAME);
    StudentBookDatabase studentBookDatabase = new StudentBookDatabase(STUDENTBOOKS_FILENAME);
    public LibrarianRole()throws IOException{
        bookDatabase.readFromFile();
        studentBookDatabase.readFromFile();}
    public boolean addBook(String bookId,String title,String authorName,String publisherName,int quantity) throws IOException {
        if(bookDatabase.contains(bookId))
            return false;
        else {
            BookData newBook = new BookData(bookId,title,authorName,publisherName,quantity);
        bookDatabase.insertRecord(newBook);
        return true;
        }
            
        
    }
    public BookData[] getListOfBooks(){
        return  bookDatabase.ArrayList().toArray(new BookData[0]);
        //  return Arrays.copyOf(bookDatabase.ArrayList(),bookDatabase.ArrayList().length,BookData[].class);
    }
    public StudentBookData[] getListOfBorrowingOperations(){
        return studentBookDatabase.ArrayList().toArray(new StudentBookData[0]);
        //return Arrays.copyOf(studentBookDatabase.ArrayList(),studentBookDatabase.ArrayList().length,StudentBookData[].class);
    }
    public int borrowBook(String studentId, String bookId, LocalDate borrowDate) throws IOException{
        BookData record = ((BookData)bookDatabase.getRecord(bookId));
        if(record==null)
            return 3;
        String key = String.format("%s,%s",studentId,bookId);
        if(studentBookDatabase.contains(key))
            return 1;
        if(record.getQuantity() == 0)
            return 0;
        else{
            record.setQuantity(record.getQuantity()-1);
            Data borrower = new StudentBookData(studentId,bookId,borrowDate);
            studentBookDatabase.insertRecord(borrower);
            return 2;
        }
    }
    public double returnBook(String studentId, String bookId, LocalDate returnDate)throws IOException {
        String key = String.format("%s,%s",studentId,bookId); // to use it to search
        StudentBookData studentBook = ((StudentBookData) studentBookDatabase.getRecord(key)); //getting the line of borrowing data & casting it forward to Student
        if(studentBookDatabase.contains(key)){
            BookData thisbook = ((BookData) bookDatabase.getRecord(bookId));
            thisbook.setQuantity(thisbook.getQuantity()+1);
        }   
        studentBookDatabase.deleteRecord(key); //deleting the record of borrowing
        try{
        Period period = Period.between(studentBook.getBorrowDate(),returnDate); //return the difference in day-year-month
        int days = period.getDays() + period.getMonths()*30 + period.getYears()*365;
        if(days <= 7.0)
            return 0.0;
        else
            return (days - 7.0)*0.5;
        }catch(NullPointerException n){
            System.err.println("thers wasnt any borrowed book with the id "+bookId+" in the library !!");
            return 0;
        }   
    }
    public void logout()throws IOException{
        bookDatabase.saveToFile();
        studentBookDatabase.saveToFile();
    }

}
