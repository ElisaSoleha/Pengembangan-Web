import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusStyle;

import java.util.ArrayList;
public class Tugas3Ganjil3{
    public static void main(String[] args)
    {
        //Data Mahasiswa 7 cowok 3 cewek output dipisahkan do while loop
        Scanner input = new Scanner (System.in);
        ArrayList<String> daftarMahasiswaLakiLaki = new ArrayList<>();
        ArrayList<String> daftarMahasiswaPerempuan = new ArrayList<>();
        int jumlahLakilaki = 7;
        int jumlahPerempuan = 3;

       
        do{
            System.out.print("Masukan Nama Mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukan Nim Mahasiswa: ");
            int NIM = input.nextInt();
            input.nextLine();
            System.out.print("Laki-Laki atau Perempuan (L/P)?: ");
            String pilih = input.nextLine();
            String dataMahasiswa = nama + " (NIM: " + NIM + ")";
            if (pilih.equals("L") )
            {
                daftarMahasiswaLakiLaki.add(dataMahasiswa);
                jumlahLakilaki--;
            }
            else if(pilih.equals("P"))
            {
                daftarMahasiswaPerempuan.add(dataMahasiswa);
                jumlahPerempuan--;
            }else{

            }
        }while(jumlahLakilaki > 0 || jumlahPerempuan > 0);

         System.out.println("Data Mahasiswa Laki-Laki:");
         for(String nama : daftarMahasiswaLakiLaki)
         {
            System.out.println(nama);
         }
         System.out.println("Data Mahasiswa perempuan:");
         for(String nama : daftarMahasiswaPerempuan)
         {
            System.out.println(nama);
         }
        // String dataMahasiswaL = String.join(" ", daftarMahasiswaLakiLaki);
        // System.out.println(dataMahasiswaL);
        // System.out.println("Data Mahasiswa Laki-Laki:");
        // String dataMahasiswaP = String.join(" ", daftarMahasiswaPerempuan);
        // System.out.println(dataMahasiswaP);

        input.close();
    }
}