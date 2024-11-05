import java.util.ArrayList;
import java.util.Scanner;

public class InitialsList {

    public static void main(String[] args) {
        char chars[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        System.out.println(characters);
        Character enter_char;

        System.out.println("Enter character: ");
        Scanner scanner = new Scanner(System.in);
        enter_char = scanner.next().charAt(0);
        characters.add(enter_char);

        System.out.println(characters);

        ///////////////////////////////////////

        Character remove_char;
        System.out.println("Remove character: ");
        if (characters.contains(enter_char)) {
            characters.remove(enter_char);
        }else{
            System.out.println("No character found");
        }
        System.out.println(characters);

        ///////////////////////////////
        Character search_char;
        System.out.println("Search character: ");
        if (characters.contains(enter_char)){
            System.out.println("Search character found");
        }else{
            System.out.println("No character found");
        }
        /////////////////////////////////
    }

}
