import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Calculator{
    public static void main(String[] args) {
       Scanner isi= new Scanner (System.in);

       int pilihop,a,b;
       String pil ="";
       System.out.println();
       System.out.println("==---Calculator---==");
       
       System.out.println();
       System.out.println("--Operasi--");
       System.out.println("1.Perkalian \n2.Pembagian \n3.Pertambahan \n4.Pengurangan");
       System.out.print("Masukan Pilihan Anda :");
       pilihop=isi.nextInt();
       System.out.println("Pilihan Anda Adalah : "+pilihop);
       
       do {
        switch(pilihop){
            case 1:
            System.out.println("Perkalian");
            System.out.println("Masukan Angka Pertama :");
            a=isi.nextInt();
            System.out.println("Masukan Angka Kedua : ");
            b=isi.nextInt();
            System.out.println("Total Perkalian : "+(a*b));
            break;
            case 2:
            System.out.println("Pembagian");
            System.out.println("Masukan Angka Pertama :");
            a=isi.nextInt();
            System.out.println("Masukan Angka Kedua : ");
            b=isi.nextInt();
            System.out.println("Total Peembagian : "+(a/b));
            break;
            case 3:
            System.out.println("Penjumlahan");
            System.out.println("Masukan Angka Pertama :");
            a=isi.nextInt();
            System.out.println("Masukan Angka Kedua : ");
            b=isi.nextInt();
            System.out.println("Total Penjumlahan : "+(a+b));
            break;
            case 4:
            System.out.println("Pengurangan");
            System.out.println("Masukan Angka Pertama :");
            a=isi.nextInt();
            System.out.println("Masukan Angka Kedua : ");
            b=isi.nextInt();
            System.out.println("Total Pengurangan : "+(a-b));
            break;

        }
        System.out.println("Apakah Anda Ingin Melanjutkan ?(Yes/No)");
        pil=isi.nextLine();
       } while (pil.equals("No"));


    }
    
   
}