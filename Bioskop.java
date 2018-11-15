import java.util.Arrays;
import java.util.Scanner;

class Teater{
    private boolean kursi [][] = new boolean[15][7];
    public boolean bookingKursi (int x, int y) {
        if (kursi[x][y]) {//kalau sudah terisi
            return false;
        } else { //kalau belum terisi
            kursi[x][y] = true;//set kursi menjadi terisi
            return true;//booking berhasil
        }
    }

    public void gambarDenah (){
        //iterasi vertikal
        for (int y = 0; y<kursi[0].length; y++){
            //iterasi horizontal
            for (int x = 0; x<kursi.length; x++){
                if(kursi[x][y]){
                    System.out.print("☃ ");
                }
                else{
                    System.out.print("❏ ");
                }
            }
            System.out.println();
        }
    }
}

public class Bioskop {
    public static void main (String[]args) {
        Teater teaterSatu = new Teater();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                //Gambar Denah
                teaterSatu.gambarDenah();

                //Inputan User
                System.out.print("Posisi X: ");
                int posX = sc.nextInt();
                System.out.print("Posisi Y: ");
                int posY = sc.nextInt();

                //Booking Tiket
                boolean berhasilBooking = teaterSatu.bookingKursi(posX, posY);
                if (berhasilBooking) {
                    System.out.println("Kursi berhasil dibooking");
                } else {
                    System.out.println("Booking gagal. Kursi sudah terisi!");
                }

                System.out.println();
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ada error, inputan anda salah");
                sc.next();
            }
            System.out.println();
            System.out.println();
        }
    }
}
