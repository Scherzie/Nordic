public class EncapsTest {
    public static void main(String args[]){
        Encapsulation obj = new Encapsulation();
        obj.setEmpName("Reiner");
        obj.setEmpAge(22);
        obj.setEmpSSN(12345);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}

