public class Encapsulations {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void main (String [] args){
        Encapsulations Dian = new Encapsulations();
        Dian.setName("Dian");
        System.out.println(Dian.getName());
    }
}
