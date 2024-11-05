import java.util.ArrayList;
import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        int arr[] = {25, 30, 18, 21, 22, 35, 40, 17, 28, 19};
        for(int i = 0; i < arr.length; i++) {
            ages.add(arr[i]);
        }

        System.out.println(ages);
        int age1,age2;
        System.out.println("Enter an age: ");
        Scanner sc = new Scanner(System.in);
        age1 = sc.nextInt();
        System.out.println("Enter an age: ");
        age2 = sc.nextInt();

        ages.set(5,age1);
        ages.set(7,age2);
        System.out.println(ages);
        ////////////////////////////////////////////////
        double avg;
        double sum = 0;
        for(int i = 0; i < ages.size(); i++) {
            sum += ages.get(i);
        }
        avg = sum/ages.size();
        System.out.println("The average ages is "+avg);
        ////////////////////////////////////////////////
        int counter = 0;
        for(int i = 0; i < ages.size(); i++) {
            if(ages.get(i)>22) {
                counter++;
            }
        }
        System.out.println("Number of ages greater than 22 is "+counter);

        /////////////////////////////////////////////

    }
}
