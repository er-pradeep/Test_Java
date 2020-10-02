package oct2;


public class DefangIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
       // System.out.println("pradeep[]");
        return address.replace(".","[.]");
    }
}
