import java.util.Arrays;
import java.util.Scanner;

class Teater{
    private boolean kursi [][] = new boolean[15][7];
    public boolean bookingKursi (int x, int y) {
        if (x > 0) {
            System.out.println("Kursi Melebihi Baris Kanan X");
            return false;
        }
        if (x < 0) {
            System.out.println("Kursi Melebihi Baris Kiri X");
            return false;
        }if (y > 0) {
            System.out.println("Kursi Melebihi Baris Atas Y");
            return false;
        }if (y < 0) {
            System.out.println("Kursi Melebihi Baris Bawah Y");
            return false;
        }
        if (kursi[x][y]) {//kalau sudah terisi
            return false;
        } else { //kalau belum terisi
            kursi[x][y] = true;//set kursi menjadi terisi
            return true;//booking berhasil
        }
    }

    public void gambarDenah (){
        //iterasi vertikal
        System.out.printf("  ");
        for (int x = 0; x<kursi[0].length; x++) {
            System.out.printf("%d ", x);
        }
        System.out.println();
            for (int y = 0; y<kursi.length; y++){
                //iterasi horizontal
                System.out.printf("%c ", (y + 'x'));
                for (int x=0; x<kursi.length; x++){
                if(kursi[x][y] == true) {
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
                    System.out.println("Booking gagal. Kursi sudah terisi! / Melebihi kapasitas studio");
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
