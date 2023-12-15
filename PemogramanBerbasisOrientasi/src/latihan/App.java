package latihan;
import latihan.AppDua;
import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
       System.out.println("Masukan Nama:");
       String nama = input.nextLine();
       System.out.println("Masukkan Nim: ");
       String nim = input.nextLine();
       AppDua mhs = new AppDua(nama, nim);
       System.out.println("Data Mahasiswa: ");
       System.out.println("Nama: "+mhs.getNama());
       System.out.println("Nim: "+mhs.getNim());

       System.out.println("Ubah data: ");
       char masuk = input.nextLine().charAt(0);

       if(masuk == 'y')
       {
            System.out.println("Nama: ");
            nama = input.nextLine();
            mhs.setNama(nama);
            System.out.println("Nim: ");
            nim = input.nextLine();
            mhs.setNim(nim);

            System.out.println("Data Diubah:");
            System.out.println("Nama: "+mhs.getNama());
            System.out.println("Nim: "+mhs.getNama());
       }
       input.close();
    }

}