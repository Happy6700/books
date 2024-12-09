import java.util.ArrayList;

/** Madison Covey
 * Mr. Gross class
 * bookwrapper
 */
public class bookwrapper {
    public static void main(String[] args) {
        ArrayList <books> bookShelf= new ArrayList <books>();
        books books1=new books("pride and prejudice" , "Jane Austin");
        books1.reading ();
        bookShelf.add(books1);
        books1=new books("To kill a Mockingbird" , "Harper Lee");
        bookShelf.add(books1);
        books1=new books("The Hunger Games" , "Susan Collins");
        bookShelf.add(books1);
        books1=new books ("Intterupted a Life Beyond Words" , "Rachel Coker");
        bookShelf.add(books1);
        books1.reading ();
        poems poems1=new poems ("Madison's Favorite Poems", "Madison");
        bookShelf.add (poems1);
        bookShelf.get (1). reading();
        audioBook audioBook1=new audioBook ("cat","Max","Tablet");
        bookShelf.add (audioBook1);
        for(int x = 0; x < bookShelf . size (); x++){
            System.out.println(bookShelf.get (x ) . toString());
          }
        }
}
