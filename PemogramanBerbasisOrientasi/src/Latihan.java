import java.util.Scanner;
// public class Latihan {
    
//     public static void main(String[] args){
//         int hasil = 90-45;
//         int pengurangan = 7;
//         do{
//             hasil-=pengurangan;
//             if(hasil !=  24)
//             {
//                 System.out.println("Hasil: "+ hasil);
//             }
//         }while(hasil > 24);
//         if  (hasil == 24){
//             System.out.println("Program selesai");
//         }
//     }
// }
// public class Latihan {
    
//     public static void main(String[] args) {
//         int hasil = 90 - 45;
//         int pengurangan = 7;
//         do {
//             hasil -= pengurangan;
//             if (hasil == 24) {
//                 continue; // Mengabaikan hasil jika hasil adalah 24
//             }
//             System.out.println("Hasil: " + hasil);
//         } while (hasil > 24);
//         System.out.println("Program selesai");
//     }
// }

public class Latihan {
    
    public static void main(String[] args) {
        int hasil = 90 - 45;
        int pengurangan = 7;
        do {
            hasil -= pengurangan;
            if (hasil == 24) {
                continue; // Mengabaikan hasil jika hasil adalah 24
            }
            System.out.println("Hasil: " + hasil);
        } while (hasil >= 0);
        System.out.println("Program selesai");
    }
}
