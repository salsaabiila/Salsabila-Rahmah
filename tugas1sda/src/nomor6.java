import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
        //String[] nama= {"h","m","a","h"};
        
        //nomor 6
        //perintah add
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("h");
        nama.add("m");
        nama.add("a");
        nama.add("h");

        nama.add(0,"e");
        System.out.println(nama);

        nama.add(2,"f");
        System.out.println(nama);

        nama.add(3,"g");
        System.out.println(nama);

        nama.add(4,"h");
        System.out.println(nama);

        nama.add(6,"h");
        System.out.println(nama);

        nama.add(-3,"j");
        System.out.println(nama);
    }
}
