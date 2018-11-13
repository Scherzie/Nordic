import java.util.Scanner;
public class Penjumlahan {
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            int Total = 0;
            while(true){
                int input = sc.nextInt();
                // Total = total+input
                Total += input;
                if(input == 0){
                    break;
                }
            }
            System.out.println("Total = " + Total);
        }
    }

