package backend;
import java.time.LocalDate;

public class StudentBookData implements Data{
    private String studentId;
    private String bookId;
    private LocalDate borrowDate;

    public StudentBookData(String studentId,String bookId,LocalDate borrowDate){
        this.bookId = bookId;
        this.studentId = studentId;
        this.borrowDate = borrowDate;
    }

    public String getBookId() {
        return bookId;
    }

    public String getStudentId() {
        return studentId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public String lineRepresentation(){
        return String.format("%s,%s,%s",studentId,bookId,borrowDate.toString());
    }

    public String getSearchKey(){
        return String.format("%s,%s",studentId,bookId);
    }
}
