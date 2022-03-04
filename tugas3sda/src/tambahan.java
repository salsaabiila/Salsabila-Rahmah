import java.util.LinkedList;

public class tambahan {
   public static void main(String[] args) {
       LinkedList<String> nobp = new LinkedList<>();
       LinkedList<String> nama = new LinkedList<>();
       LinkedList<String> alamat = new LinkedList<>();

       nobp.add("2111521010");
       nama.add("Salsabila Rahmah");
       alamat.add("Batusangkar");
       
       System.out.println("DATA AWAL");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //menambahkan data awal
       nobp.addFirst("2111521008");
       nama.addFirst("Septia Amanda");
       alamat.addFirst("Pariaman");

       System.out.println("MENAMBAHKAN DATA DI AWAL");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //menambah data akhir
       nobp.addLast("2111521020");
       nama.addLast("Fina Aulia Nazari");
       alamat.addLast("Batam");

       System.out.println("MENAMBAHKAN DATA DI AKHIR");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //menambahkan data
       nobp.add(0, "2111523003");
       nobp.add(1, "2111521005");
       nobp.add(2, "2111521004");
       nobp.add(4, "2111521011");
       
       nama.add(0, "Vania Zerlina");
       nama.add(1, "Shabrina Elfani Gucy");
       nama.add(2, "Lutfia Aulia");
       nama.add(4, "Syadza Intan Benya");

       alamat.add(0, "Padang");
       alamat.add(1, "Padang");
       alamat.add(2, "Agam");
       alamat.add(4, "Padang");

       System.out.println("MENAMBAHKAN DATA PADA INDEKS KE 0, 1, 2, DAN 4");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //sisip
       nobp.set(1, "2111521006");
       nama.set(1, "Mutiara Maharani");
       alamat.set(1, "Padang Pariaman");

       System.out.println("MENYISIP DATA INDEKS 1");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //delete data awal
       nobp.removeFirst();
       nama.removeFirst();
       alamat.removeFirst();

       System.out.println("MENGHAPUS DATA PERTAMA");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //delete data akhir
       nobp.removeLast();
       nama.removeLast();
       alamat.removeLast();

       System.out.println("MENGHAPUS DATA TERAKHIR");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //delete
       nobp.remove(3);
       nama.remove(3);
       alamat.remove(3);

       System.out.println("MENGHAPUS DATA INDEKS KE-3");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");

       //fungsi get
       System.out.println("MENDAPATKAN DATA INDEKS KE-3");
       System.out.println("No BP \t\t: "+nobp.get(3));
       System.out.println("Nama Mahasiswa \t: "+nama.get(3));
       System.out.println("Alamat \t\t: "+alamat.get(3));
       System.out.println("");

       //fungsi pop
       System.out.println("MENGAMBIL DATA PERTAMA");
       System.out.println("No BP: "+nobp.pop());
       System.out.println("Nama: "+nama.pop());
       System.out.println("Alamat: "+alamat.pop());
       System.out.println("");

       //fungsi push
       nobp.push("2111521002");
       nama.push("Winda Adelia");
       alamat.push("Pekanbaru");

       System.out.println("MENAMBAHKAN DATA PERTAMA");
       System.out.println("No BP: "+nobp);
       System.out.println("Nama: "+nama);
       System.out.println("Alamat: "+alamat);
       System.out.println("");
   }
}
