package practise;

public class Book {
    private int isbnid;
    private String bookName;
    private String authorName;

    public void setisbnid(int n){
        this.isbnid=n;
    }
    public void setBookName(String n){
        this.bookName=n;
    }
    public void setAuthorName(String n){
        this.authorName = n;
    }
    
    public int getIsbnid(){
        return isbnid;
    }
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthorName(){
        return this.authorName;
    }

    @Override
    public String toString(){
        return "These is Jong book store with following book "+this.getIsbnid()+" with Book name "+this.getBookName()+"" +
                "with Author Name "+this.getAuthorName();
    }
}
