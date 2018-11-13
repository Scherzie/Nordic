//input:
//integer

//output :
//"ini ganjil" jika inputannya ganjil
//"ini genap" jika inputannya genap

import java.util.Scanner;

public class inputanGanjilGenap {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        //=====inputan=====
        int i = sc.nextInt();

        //=====outputan=====

        //cek apakah inputan ganjil atau genap disini
        //coba pakai modulus (%), cek hasil perhitungannya di dalam if()
        int sisaPembagian = i % 2;
        if(sisaPembagian == 1) {
            System.out.println("ini ganjil");
        }
        else{
            System.out.println("ini genap");
        }
    }
}
