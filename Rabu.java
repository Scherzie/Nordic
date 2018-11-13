public class Rabu {
    //Ini main method, untuk jalanin program kode
    public static void main (String args [])
    {
        int a = 10;
        int b = 20;
        float c = 10.5f;
        double d = 10.75d;
        double e = a+b*c+d;
        System.out.println(e);
        System.out.println(orangketiga("s1"));
    }

    //Ini common method, boleh ada >1 di Java
    public static String orangketiga(String a)
    {
        return "Karena gitu "+a;
        //Buat munculin di console, common method perlu ditulis di main method
        //Yang akan muncul di console adalah hasil return
    }
}
