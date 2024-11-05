import java.util.ArrayList;
import java.util.Scanner;

public class NamesAndSurnames {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");
        names.add("Hannah");
        names.add("Ivy");
        names.add("Jake");

        //Surnames "Johnson", "Smith", "Brown", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin"
        surnames.add("Johnson");
        surnames.add("Smith");
        surnames.add("Brown");
        surnames.add("Taylor");
        surnames.add("Anderson");
        surnames.add("Thomas");
        surnames.add("Jackson");
        surnames.add("White");
        surnames.add("Haris");
        surnames.add("Martin");

        /////////////////////////////////////////////////

        String input_name;
        String input_surname;
        //Display names and surnames

        System.out.println(names);
        System.out.println(surnames);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        input_name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        input_surname = scanner.nextLine();

        names.add(input_name);
        surnames.add(input_surname);


        System.out.println(names);
        System.out.println(surnames);

        ///////////////////////////////////////////
        String name_for_delete;
        String surname_for_delete;

        System.out.println("Enter name for delete: ");
        name_for_delete = scanner.nextLine();
        System.out.println("Enter surname for delete: ");
        surname_for_delete = scanner.nextLine();
        if(names.contains(name_for_delete) && names.contains(surname_for_delete)) {
            names.remove(name_for_delete);
            surnames.remove(surname_for_delete);
        }else{
            System.out.println("Name not found");

        }

        System.out.println(names);
        System.out.println(surnames);

        ////////////////////////////////////////////

        String search_name;

        System.out.println("Enter your search name: ");
        search_name = scanner.nextLine();



        if (names.contains(search_name)) {
            int index = names.indexOf(search_name);
            String search_surname = surnames.get(index);
            System.out.println("Name:" + search_name);
            System.out.println("Surname: " + search_surname);
        }else {
            System.out.println(" User is not in the list");
        }


        System.out.println(names);
        System.out.println(surnames);

    }

}
