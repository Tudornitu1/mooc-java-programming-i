import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter
        // book information and to examine them
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        if (info.equals("everything")) {
            for (Book b : books) {
                System.out.println(b.toString());
            }
        } else {
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}