import java.util.Scanner;
public class Input {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String namaSaya = sc.next(); //input
        System.out.print("Umur : ");
        int umurSaya = sc.nextInt(); //input

        System.out.print("Nama Teman : ");
        String namaTeman = sc.next(); //input
        System.out.print("Tinggi Teman : ");
        double tinggiTeman = sc.nextDouble(); //input

//        System.out.println("Nama Saya " + namaSaya + ".Umur Saya " + umurSaya + "tahun.");
//        System.out.println("Nama Teman Saya " + namaTeman + ".Tingginya " + tinggiTeman + "cm.");
        System.out.printf("Nama Saya %s. Umur Saya %d tahun. Nama Teman Saya %s. Tinggi Teman Saya %.1f cm.",
                namaSaya, umurSaya, namaTeman, tinggiTeman);
    }
}
