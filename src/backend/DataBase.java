package backend;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public abstract class DataBase {
    private ArrayList<Data> records ;
    private String fileName;

    public DataBase(String fileName){
        this.fileName = fileName;
        records = new ArrayList<>();
    }
    public  void readFromFile() throws IOException{
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        while(input.hasNextLine()){
            String record = input.nextLine();
            records.add(CreateRecordFrom(record)); //as its implemented as abstract it will call the one in the subclass object that called it
        }
        input.close();
    }
    public abstract Data CreateRecordFrom(String line); // implementing as abstract as each database its own data
    public ArrayList<Data> ArrayList(){
        return  records;
    }
    public boolean contains(String key){
        for (int i = 0; i<records.size();i++){
            if(records.get(i).getSearchKey().equals(key))
                return true;
        }
        return false;
    }
    public Data getRecord(String key){
        for (int i = 0; i<records.size();i++){
            if(records.get(i).getSearchKey().equals(key))
                return records.get(i);
        }
        return null;
    }
    public void insertRecord(Data record){
        if(!contains(record.getSearchKey()))
            records.add(record);
    }
    public boolean deleteRecord(String key){
        Data record = getRecord(key);
        if(record == null)
            return false;
        records.remove(record);
        return true;
    }
    public void saveToFile() throws IOException {
        File file = new File(fileName);
        if(!file.delete()) //there's one then delete it
            JOptionPane.showMessageDialog(null,"faild to delete  file: " + fileName);
        File newFile = new File(fileName);
        newFile.createNewFile();//then making new one in both cases

        FileWriter writeInFile = new FileWriter(fileName);
        for (int i=0;i<records.size();i++){
            writeInFile.write(records.get(i).lineRepresentation());
            writeInFile.write((i!=records.size()-1)?"\n":""); //to put each record in a new line without making one at the end
        }
        writeInFile.close();
    }
}
