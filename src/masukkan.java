import java.util.Scanner;

public class masukkan {
    public static void main(String[]args)
    {
        // Deklarasi variabel
        String tampungMasukkan="";
        Scanner masukkan= new Scanner(System.in);

        // input
        System.out.print("Masukkan teks: ");
        tampungMasukkan=masukkan.nextLine();

        // output
        System.out.println("Masukkan tadi adalah "+tampungMasukkan);
    }
}