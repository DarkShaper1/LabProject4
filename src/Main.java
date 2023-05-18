import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Book book1 = new Book(29, 3, "Java 8. Полное руководство", "Г. Шилдт", LocalDate.of(2022, 4, 1));
        Book book2 = new Book(29, 3, "Крейцерова соната", "Л. Толстой", LocalDate.of(2022, 3, 27));

        Reader customer1 = new Reader("Петров", book1);
        Reader customer2 = new Reader("Васчекин", book2);
        System.out.println(customer1.getStatus());
        System.out.println(customer2.getStatus());
    }
}