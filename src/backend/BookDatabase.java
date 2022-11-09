package backend;
public class BookDatabase extends DataBase{
    public BookDatabase(String fileName){
        super(fileName);
    }
    public Data CreateRecordFrom(String line){
        String[] recordSeperated = line.split(",");
        Data user = new BookData(recordSeperated[0],recordSeperated[1],recordSeperated[2],recordSeperated[3],Integer.parseInt(recordSeperated[4]));
        return user;
    }
}
