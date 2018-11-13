class PersegiPanjang {
    private int panjang;
    private int lebar;
    private int luas;
    private int keliling;

    public int getPanjang(){
        return this.panjang;
    }
    public int getLebar(){
        return this.lebar;
    }
    public void setPanjang(int p){
        panjang = p;
    }
    public void setLebar(int l){
        lebar = l;
    }
    public void hitungLuas(){
        luas = panjang*lebar;
    }
    public void hitungKeliling(){
        keliling = 2*panjang + 2*lebar;
    }
    public int getLuas(){
        return this.luas;
    }
    public int getKeliling(){
        return this.keliling;
    }
}

public class Geometri {
    public static void main (String [] args) {
        PersegiPanjang Nilai = new PersegiPanjang();
        Nilai.setPanjang(5);
        Nilai.setLebar(4);
        Nilai.hitungLuas();
        Nilai.hitungKeliling();

        System.out.println("Luas = " + Nilai.getLuas());
        System.out.println("Keliling = " + Nilai.getKeliling());
    }
}
