package backend;
public class LibrarianData implements Data{
    private String LibrarianId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    public LibrarianData(String LibrarianId,String name,String email,String address,String phoneNumber){
        this.LibrarianId = LibrarianId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String lineRepresentation(){
        return String.format("%s,%s,%s,%s,%s",LibrarianId,name,email,address,phoneNumber);
    }
  
    public String getSearchKey(){
        return this.LibrarianId;
    }
}
