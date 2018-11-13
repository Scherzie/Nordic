public class Kamar extends Rumah {
    public static void main (String [] args)
    {
        Kamar objRumah = new Kamar();
        System.out.println(objRumah.lebar/10);
        System.out.println(objRumah.panjang/10);
        System.out.println(objRumah.luas(1000,1000));
    }
    public static String Ornament (String or)
    {
     or = "Hijau";
     return or;
    }
}
