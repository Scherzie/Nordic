import java.util.Scanner;
public class Perkalian {
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            int Total = 1;
            while(true){
                int input = sc.nextInt();
                // Total = total*input
                Total *= input;
                if(input == 1){
                    break;
                }
            }
            System.out.println("Total = " + Total);
        }
    }


