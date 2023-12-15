
public class Tugas3Ganjil4 {
    public static void main(String[] args)
    {
        //Ganjil Break loop 1-100 baris baru jika ada 0 dibelakangnya
        for(int i = 1; i <= 110; i++)
        {
            String noString = String.valueOf(i);
            if(noString.contains("0")){
                noString = noString.replace("0", " ");
            }
            System.out.print(noString+ " ");

            if (i% 10 == 0){
                System.out.println();
            }
            if(i == 100)
            {
                System.out.println("Selesai");
                break;
            }
        }     
    }  
}
