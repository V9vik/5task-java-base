
public class Main {
    public static void main(String[] args) {
            Book book = new Book("Алиса в стране чудес",1900,"Льюис Кэролл", 300);
            testWorkBook(book);
        }
        public static void testWorkBook(Book book){
        System.out.println("Название книги: "+ book.title);
        System.out.println("Год написания книги: "+ book.releaseYear);
        System.out.println("Автор книги: "+ book.author);
        System.out.println("Страниц в книге: "+ book.pages);
        System.out.println("Эта книга про Алису?: " + book.matches("Алиса"));
        System.out.println("Эта книга большая?(больше 500 страниц): " + book.isBig());
        System.out.println("Цена книги?: " + book.estimatePrice(book.pages));
        }
    }