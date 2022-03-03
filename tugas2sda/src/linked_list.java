import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String>saya=new LinkedList<>();
        LinkedList<String>saya1=new LinkedList<>();
        saya.add("S");
        saya.add("A");
        saya.add("L");
        saya.add("S");
        saya.add("A");
        saya.add("B");
        saya.add("I");
        saya.add("L");
        saya.add("A");
        saya.add("");
        saya.add("R");
        saya.add("A");
        saya.add("H");
        saya.add("M");
        saya.add("A");
        saya.add("H");
        System.out.println("saya = "+saya+", Ukuran : "+saya.size());
        System.out.println("");

        //add karakter
        saya1.add(",");
        saya1.add("M");
        saya1.add(".");
        saya1.add("K");
        saya1.add("o");
        saya1.add("m");
        saya.addAll(saya1);
        System.out.println("PERINTAH ADD KARAKTER");
        System.out.println("saya = "+saya+", Ukuran : "+saya.size());
        System.out.println("");

        saya.addFirst("P");
        saya.addLast("m");
        System.out.println("PERINTAH ADDFIRST DAN ADDLAST");
        System.out.println("saya = "+saya+", Ukuran : "+saya.size());
        System.out.println("");
        
        //sisip 
        saya.set(0,"A");
        saya.set(4,"S");
        saya.set(10,".");
        System.out.println("PERINTAH SISIP");
        System.out.println("saya sisip = "+saya+", Ukuran : "+saya.size());
        System.out.println("");

        //delete
        saya.removeFirst();
        saya.removeLast();
        saya.remove(15);
        saya.remove(14);
        saya.remove(13);
        saya.remove(12);
        saya.remove(11);
        saya.remove(10);
        System.out.println("PERINTAH DELETE");
        System.out.println("saya delete = "+saya+", Ukuran : "+saya.size());
        System.out.println("");

        //pop
        System.out.println("PERINTAH POP");
        System.out.println("saya pop = "+saya.pop());
        System.out.println("saya pop = "+saya.pop());
        System.out.println("saya pop = "+saya.pop());
        System.out.println("saya pop = "+saya.pop());
        System.out.println("saya pop = "+saya.pop());
        System.out.println("");

        //push
        saya.push("A");
        saya.push("S");
        saya.push("A");
        System.out.println("PERINTAH PUSH");
        System.out.println("perintah push = "+saya);
    }
}
