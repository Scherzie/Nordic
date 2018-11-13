abstract class geometri2Dimensi {
    abstract double luas ();
    abstract double keliling();
}

// buat kelas persegi, persegiPanjang, lingkaran yang mengimplementasi kelas geometri2Dimensi

class persegi extends geometri2Dimensi{
    double sisi;
    double luas(){
        return sisi*sisi;
    }
    double keliling(){
        return 4*sisi;
    }
}

class persegiPanjang extends geometri2Dimensi{
    double panjang;
    double lebar;
    double luas(){
        return panjang*lebar;
    }
    double keliling() {
        return 2*(panjang+lebar);
    }
}

class lingkaran extends geometri2Dimensi{
    double pi = 3.14;
    double jarijari;
    double luas(){
        return pi*jarijari*jarijari;
    }
    double keliling() {
        return 2*pi*jarijari;
    }
}

public class Geometri2 {
    public static void main (String [] args){
      persegi pl = new persegi();
      pl.sisi = 1.5;
      System.out.println("Luas persegi pl adalah: " + pl.luas());
      System.out.println("Keliling persegi pl adalah: " + pl.keliling());
      System.out.println();

      persegiPanjang ppl = new persegiPanjang();
      ppl.panjang = 1.2;
      ppl.lebar = 5;
      System.out.println("Luas persegi panjang ppl adalah: " + ppl.luas());
      System.out.println("Keliling persegi panjang ppl adalah: " + ppl.keliling());
      System.out.println();

      lingkaran lkr = new lingkaran();
      lkr.pi = 3.14;
      lkr.jarijari = 5.6;
      System.out.println("Luas lingkaran lkr adalah: " + lkr.luas());
      System.out.println("Keliling lingkaran lkr adalah: " + lkr.keliling());
      System.out.println();

    }
}
