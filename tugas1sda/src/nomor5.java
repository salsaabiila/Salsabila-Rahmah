import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
        //String[] nama={"h","m","a","h"};

        //nomor 5
        //perintah remove(0), remove(3), remove(2)
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("h");
        nama.add("m");
        nama.add("a");
        nama.add("h");

        System.out.println("elemen nama sebelum remove : ");
        for(String var: nama){
            System.out.println(var);
        }
        nama.remove(0);
        //nama.remove(3);
        //nama.remove(2);

        System.out.println("elemen nama setelah remove : ");
        for(String var2:nama){
            System.out.println(var2);
        }
    }
}
