package backend;
import java.time.LocalDate;
 public class StudentBookDatabase extends DataBase{
     public StudentBookDatabase(String fileName){
        super(fileName);
    }
    public Data CreateRecordFrom(String line){
        String[] recordSeperated = line.split(",");
        Data user = new StudentBookData(recordSeperated[0],recordSeperated[1],LocalDate.parse(recordSeperated[2]));
        return user;
    }
}
