package Project_5;

class NewBooks extends Book {
    public NewBooks(String title, String author) {
        super(title, author);
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new NewBooks("Dune", "Frank Herbert");
        Book book2 = new NewBooks("Jane Ayer", "Charlotte Bronte");
        library.addBook(book1);
        library.addBook(book2);

        book1.checkOut();
        book2.checkOut();
       
        Book byTitle1 = library.findBookByTitle("Dune");
        Book byTitle2 = library.findBookByTitle("Jane Ayer");
        Book byAuthor1 = library.findBookByAuthor("Frank Herbert");
        

        System.out.println("Book found by title: " + byTitle1.getTitle() + " by " + byTitle1.getAuthor());
        System.out.println("Book found by author: " + byAuthor1.getTitle() + " by " + byAuthor1.getAuthor());
        System.out.println("Book found by title: " + byTitle2.getTitle() + " by " + byTitle2.getAuthor());
        
        System.out.println("");
        System.out.println("Is book1 checked out? " + book1.isCheckedOut());
        System.out.println("Is book2 checked out? " + book2.isCheckedOut());
        
        
        book1.checkIn();
        System.out.println("Is book1 checked in? " + book1.isCheckedOut());
    

    }
}

