public class Gue {
    public static void main (String args []){
        System.out.println(Temen(5));
        System.out.println(Temen(1, "2"));
        Sahabat("a","c");
        System.out.println(Sahabat("sahabat","10","orang"));
    }
    public static int Temen(int a) {
        return a;
    }
    public static String Temen (int a, String b){
        b = " Teman";
        return a + b;
    }
    public static void Sahabat (String a, String b){
        a = "2";
        b = " Orang";
        System.out.println(a+b);
    }
    public static String Sahabat (String a, String b, String c){
        String d = a;
        a = b;
        b = c;
        c = d;
        return a + " " + b + " " + c;
    }
}
