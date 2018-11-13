class Ortu {

    int Uang = 999999;
    String Perusahaan = "Ternak Lele";
}

public class Anak extends Ortu{
    public static void main (String [] args)
    {
        int UangAku = 1;
        Anak objekAnak = new Anak();
        String PerusahaanAku = "Ternak Ayam ";
        System.out.println("Perusahaan jadi punyaku : " + objekAnak.Perusahaan);
        System.out.println(UangAku + objekAnak.Uang);
        System.out.println("Perusahaanku sekarang : " + PerusahaanAku + objekAnak.Perusahaan);
    }

}
