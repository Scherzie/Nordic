public class If_Else {
    public static void main (String args []){
        int x = 20;
        if ((x > 19 || x - 2 == 18) && (x * 2 == 40))
        {
            System.out.println("Kondisi if Terpenuhi");
        }
        if (x % 2 == 0)
        {
            System.out.println("Kondisi age tidak habis dibagi 2");
        }
        else if (x +1 == 21)
        {
            System.out.println("Kondisi age ditambah 1");
        }
        else
        {
            System.out.println("Semua kondisi tidak terpenuhi");
        }
    }
}
