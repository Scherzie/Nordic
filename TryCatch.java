import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int hasil = a / b;
            System.out.println("hasil = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi 0");
            System.out.println("Error : " + e);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error di input.");
            System.out.println("Error : " + e);
        } catch (Exception e) {
            System.out.println("Error lainnya");
            System.out.println("Error : " + e);

        }
    }
}

