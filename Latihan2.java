import java.util.Scanner;
public class Latihan2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input >= 85 && input <= 100){
            System.out.println("A");
        }
        else if (input >= 70 && input <= 84){
            System.out.println("B");
        }
        else if (input >= 60 && input <= 69){
            System.out.println("C");
        }
        else if (input >= 0 && input <= 59){
            System.out.println("D");
        }
        else {
            System.out.println("Unidintified");
        }
    }
}
