class Orang {
    public void ngelus(Hewan a){
        System.out.print("mengelus..");
        a.suara();
    }
}

class Hewan {
    public void suara() {
        System.out.println("....");
    }

}
class Kucing extends Hewan{
    public void suara () {
        System.out.println("Meow~");
    }
}
class Anjing extends Hewan{
    public void suara () {
        System.out.println("Guk..Guk..");
    }
}
public class Polymorph {
    public static void main (String [] args){
        Hewan Neko = new Kucing();
        Hewan Inu = new Anjing();
        Orang Dian = new Orang();

        Neko.suara();
        Inu.suara();

        Dian.ngelus(Neko);
        Dian.ngelus(Inu);
    }
}