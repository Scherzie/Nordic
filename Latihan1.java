import java.util.Scanner;
class hitung{
    //variabel
    int a;
    int b;
    //method
    void hasil(){
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" : "+b+" = "+((float)a/b)); //int to float casting
    }
}
public class Latihan1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        hitung sum = new hitung();
        sum.a = sc.nextInt();
        sum.b = sc.nextInt();
        sum.hasil();
    }
}
