import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        User alice = new User("Alice", 25, "Smith", "2022-01-15", "1234567890",
                "alice@example.com", "USA");
        users.add(alice);

        User bob = new User("Bob", 30, "Johnson", "2022-02-20", "0987654321",
                "bob@example.com", "Canada");
        users.add(bob);

        User charlie = new User("Charlie", 22, "Williams", "2022-03-10", "4561237890",
                "charlie@example.com", "UK");
        users.add(charlie);

        User david = new User("David", 28, "Jones", "2022-04-05", "3216549870",
                "david@example.com", "Australia");

        users.add(david);
        User eve = new User("Eve", 35, "Brown", "2022-05-12", "6549873210", "eve@example.com",
                "Germany");

        users.add(eve);


        User new_user = new User();

    }
}