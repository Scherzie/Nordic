import java.util.Scanner;
public class ganjiGenap {
    public static void main (String[]args){
        for (int i=0; i<= 15; i++){
            int sisaPembagian = i%2;
            if (sisaPembagian ==0){
                System.out.println(i + " = genap");
            }
            else{
                System.out.println(i + " = ganjil");
            }
        }
    }
}

//contoh lain