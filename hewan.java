abstract class burung{
    abstract void makan();
    abstract void bergerak();
}

interface bisaTerbang{
    public void terbang();
}

interface bisaTerbangTinggi extends bisaTerbang{
    public void terbangTinggi();
}

interface bisaTerbangRendah extends bisaTerbang{
    public void terbangRendah();
}

class merpati extends burung implements bisaTerbangTinggi{
    void makan(){
    }
    void bergerak(){
    }
    public void terbang(){
    }
    public void terbangTinggi() {
    }
}

class pinguin extends burung{
    void makan(){
    }
    void bergerak() {
    }
}

public class hewan {
    public static void main (String [] args){

    }
}
