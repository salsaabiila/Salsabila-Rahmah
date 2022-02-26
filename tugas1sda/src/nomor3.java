import java.util.ArrayList;

public class nomor3 {
    public static void main(String[] args) {
        //String[] nama={"H","M","A","H"};

        //nomor 3
        //perintah get(0), get(2), get(6), get(-3)
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("h");
        nama.add("m");
        nama.add("a");
        nama.add("h");

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3)); 
    }
}
