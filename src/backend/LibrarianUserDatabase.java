package backend;
public class LibrarianUserDatabase extends DataBase{
    public LibrarianUserDatabase(String fileName){
       super(fileName);
    }
    public Data CreateRecordFrom(String line){
        String[] recordSeperated = line.split(",");
        Data user = new LibrarianData(recordSeperated[0],recordSeperated[1],recordSeperated[2],recordSeperated[3],recordSeperated[4]);
        return user;
    }

}
