public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;
    public static int minValue = 250;

    public boolean isBig(){
        boolean flag = false;
        if(pages > 500){
            flag = true;
        }
        return flag;
    }

    public boolean matches(String word){
        boolean flag = false;
        if(title.contains(word) || author.contains(word)){
            flag = true;
        }
        return flag;
    }
    public Book(String title, int releaseYear, String author, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }
    public int estimatePrice(int pages){
        int value = pages * 3;
        if(value < minValue){
            value = minValue;
        }
        return value;
    }
}
