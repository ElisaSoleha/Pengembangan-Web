import java.util.Scanner;
import javax.sound.midi.SysexMessage;
public class Tugas3Ganjil2{
    public static void main(String[] args)
    {//Ganjil while loop sensor suhu 0°-35,5° dingin, 35,6°-45,9° stabil >46,0° tinggi
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        while(ulang)
        {
            System.out.print("Masukan suhu: ");
            double masukanSuhu = input.nextDouble()*100;
            if(masukanSuhu >= 0 && masukanSuhu <= 35.5)
            {
                System.out.println("Suhu: Dingin " + masukanSuhu + "° C");
            }
            else if(masukanSuhu >= 35.6 && masukanSuhu <= 45.9){
                System.out.println("Suhu: Stabil " + masukanSuhu + "° C");
            }
            else if(masukanSuhu > 46.0)
            {
                System.out.println("Suhu: Tinggi " + masukanSuhu + "° C");
            }
            else{
                System.out.println("Masukan tidak valid");
            }
            System.out.print("Lanjut (y/n): ");
            String lanjut = input.next();
            if(lanjut.equalsIgnoreCase("n"))
            {
                System.out.println("Selesai");
                ulang = false;
            }
        }
        input.close();
    }
}