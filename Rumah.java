public class Rumah {

    int lebar = 1000;
    int panjang = 1000;


    public static int luas (int lebar, int panjang)
    {
        int luas = panjang*lebar;
        return luas;
    }
    public static String Tingkat (String a)
    {
        return a;
    }

    public static void main (String [] args)
    {
        System.out.println(Tingkat("Tingkat 2"));
    }


}
