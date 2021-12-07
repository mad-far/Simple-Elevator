import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int pilih;
        Scanner scan = new Scanner(System.in);
        //memanggil class 
        singletonElevator lift = singletonElevator.getInstance(a);
        singletonElevator lift2 = singletonElevator.getInstance(b);

        do {
        System.out.println("Lift Sederhana");
        System.out.println("Menu");
        System.out.println("1. Naik");
        System.out.println("2. Turun");
        System.out.println("3. Cek Lantai");
        System.out.println("4. Exit");
        System.out.print("Masukan input: ");
        pilih = scan.nextInt();

        switch (pilih) {
            case 1:
            a = a+1;
            lift.setNumber(a);
            lift2.setNumber(a);
            break;

            case 2:
            a = a-1;
            lift.setNumber(a);
            lift2.setNumber(a);
            break;
            
            case 3:
            System.out.println("===========");
            System.out.println("Lift 1: "+lift.getNumber());
            System.out.println("Lift 2: "+lift2.getNumber());
            System.out.println("===========");
            break;

            case 4:
            System.out.println("End Process");
            System.exit(4);
            break;
            //Kelompok IPL
            //DSE-C
            default: System.err.println("Error");
        }   

        } while (pilih != 4);

        scan.close();
    }
}
