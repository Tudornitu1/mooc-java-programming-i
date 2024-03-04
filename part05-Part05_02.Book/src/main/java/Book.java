public class Book {
    private int pages;
    private String author;
    private String name;
    public Book(String author, String name, int pages){
        this.pages=pages;
        this.name=name;
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
    return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public String toString(){
        return this.author+", "+this.name+", "+this.pages+" pages";
    }

}
