
import java.util.ArrayList;
import java.util.Scanner;
public class Tugas3Tba{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftar = new ArrayList<>();
        boolean ulang = true;
        int  isi = 0;
        while(ulang)
        {
            System.out.print("\nMasukan Bahasa: ");
            String masuk = input.nextLine();
            if((masuk.equals("saya") && isi == 0) || ((masuk.equals("makan") || masuk.equals("memasak")) && isi == 1) || (masuk.equals("nasi") && isi == 2))
            {
                System.out.println("Bahasa tersedia");
                daftar.add(masuk);
                isi++;
            } 
           
            else{
                System.out.print("Bahasa tidak tersedia\n");
                ulang = true;
            }
            if(isi == 3)
            {
                System.out.println("Program terpenuhi, selesai");
                break;
            }
        }
        input.close();
        System.out.println("\nOutput: "+String.join(" ", daftar)+ "\n");

    }
}

 // else if ((masuk.equals("saya makan nasi")) || (masuk.equals("saya memasak nasi"))){
            //     if(!daftar.contains(masuk)){
            //         System.out.println("Bahasa Tersedia");
            //         daftar.add(masuk);
            //     }
            //     if((masuk.contains("saya makan nasi")) || (masuk.contains("saya memasak nasi"))){
            //         System.out.println("Program terpenuhi, selesai");
            //         ulang = false;
            //     }
            // }