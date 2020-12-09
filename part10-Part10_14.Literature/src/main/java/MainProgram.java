
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   String read = "";
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }
            String name = read;
            System.out.println("Input age recommendation:");          
            int age = Integer.valueOf(scanner.nextLine());
          //  Book book = new Book(name, age);
            books.add(new Book(name, age));
        }
        if (books.size()!=1) {
            System.out.println(books.size()+" books in total.");
        }   else {
            System.out.println(books.size()+" book in total.");
        }
        System.out.println("");
        System.out.println("Books:");
        System.out.println("");
//        for (Book b:books) {
//            System.out.println(b.getName()+"(recommended for "+b.getAge()+" year-olds or older)");
//        }
//        
//        ArrayList<Book> sortBooks = new ArrayList<>();
//        books.stream()
//                .sorted((b1, b2) -> {
//                    return b1.getAge()-b2.getAge();
//                })
//                .forEach(b -> sortBooks.add(b));
//        for (Book b:sortBooks) {
//            System.out.println(b.getName()+"(recommended for "+b.getAge()+" year-olds or older)");
//        }      
//        
        Comparator<Book> compare = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName)
                ;
        Collections.sort(books, compare);
        
        for (Book b:books) {
            System.out.println(b.getName()+"(recommended for "+b.getAge()+" year-olds or older)");
        }          
    }

}
