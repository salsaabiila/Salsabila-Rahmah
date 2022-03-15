import java.util.LinkedList;
import java.util.Queue;

public class latihanqueue {
    public static void main(String[] args) {
        Queue<String> nomorantrian = new LinkedList<String>();

        nomorantrian.add("45A");
        nomorantrian.add("46A");
        
        System.out.println("Pukul : 06.00 WIB");
        System.out.println("ANTRIAN PEMERIKSAAN GIGI : "+nomorantrian);
        System.out.println("");

        //Perintah Enqueue --> menggunakan fungsi add
        nomorantrian.add("47A");
        System.out.println("Pukul : 08.30 WIB");
        System.out.println("ANTRIAN PEMERIKSAAN GIGI : "+nomorantrian);
        System.out.println("");

        //Perintah Dequeue --> menggunakan fungsi poll
        System.out.println("Selanjutnya Pasien dengan Nomor Antrian : "+nomorantrian.poll());
        System.out.println("");

        //Perintah Pengecekan elemen teratas --> menggunakan fungsi peek
        System.out.println("Bersiap-siap Pasien dengan Nomor Antrian : "+nomorantrian.peek());
        System.out.println("");

        //Pengecekan ukuran Queue
        System.out.println("Jumlah Pasien : "+nomorantrian.size());
        System.out.println("");

        //Perintah Dequeue --> menggunakan fungsi poll
        System.out.println("Selanjutnya Pasien dengan Nomor Antrian : "+nomorantrian.poll());
        System.out.println("ANTRIAN PEMERIKSAAN GIGI : "+nomorantrian);
        System.out.println("");

        //Perintah Pengecekan elemen teratas --> menggunakan fungsi peek
        System.out.println("Bersiap-siap Pasien dengan Nomor Antrian : "+nomorantrian.peek());
        System.out.println("ANTRIAN PEMERIKSAAN GIGI : "+nomorantrian);
        System.out.println("");

        //pengecekan apakah antrian kosong --> menggunakan fungsi isEmpty()
        System.out.println("Apakah masih ada pasien yang tersisa?");
        if (nomorantrian.isEmpty()) {
            System.out.println("Tidak ada Pasien yang tersisa");            
        } else {
            System.out.println("Tersisa "+nomorantrian.size()+" pasien lagi");
        }
        System.out.println("");

        //Perintah Dequeue --> menggunakan fungsi poll
        System.out.println("Selanjutnya Pasien dengan Nomor Antrian : "+nomorantrian.poll());
        System.out.println("ANTRIAN PEMERIKSAAN GIGI : "+nomorantrian);
        System.out.println("");

        //pengecekan apakah antrian kosong --> menggunakan fungsi isEmpty()
        System.out.println("Apakah masih ada pasien yang tersisa?");
        if (nomorantrian.isEmpty()) {
            System.out.println("Tidak ada Pasien yang tersisa");            
        } else {
            System.out.println("Tersisa "+nomorantrian.size()+" pasien lagi");
        }
    }
}
