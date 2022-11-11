package backend;
public class BookData implements Data{
    private String bookId;
    private String title;
    private String authorName;
    private String publisherName;
    private int quantity;
    public BookData(String bookId,String title,String authorName,String publisherName,int quatity){
        this.bookId = bookId;
        this.authorName = authorName;
        this.title = title;
        this.publisherName = publisherName;
        this.quantity = quatity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String lineRepresentation(){
        return String.format("%s,%s,%s,%s,%d",bookId,title,authorName,publisherName,quantity);
    }

    public String getSearchKey(){
        return this.bookId;
    }
}
