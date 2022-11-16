package backend;
import contents.FileNames;
import java.io.IOException;

public class AdminRole implements FileNames{
    private final LibrarianUserDatabase database = new LibrarianUserDatabase(LIBRARIAN_FILENAME);
    public AdminRole()throws IOException {
            database.readFromFile();
    }
    public void addLibrarian(String LibrarianId,String name,String email,String address,String phoneNumber) throws IOException {
        LibrarianData librarian = new LibrarianData(LibrarianId,name,email,address,phoneNumber);
            database.insertRecord(librarian);
    }
    public LibrarianData[] getListOfLibrarians(){
       /// LibrarianData[] librarianData = Arrays.copyOf(database.ArrayList(),database.ArrayList().length,LibrarianData[].class);
        ///  (LibrarianData[])database.ArrayList(); //not allowed
        /// return librarianData;
        return database.ArrayList().toArray(new LibrarianData[0]);
    }
    public boolean removeLibrarian(String key)throws IOException{
           return database.deleteRecord(key);         
    }
    public void logout()throws IOException{
       database.saveToFile();
    }
}
