import java.util.Scanner;

public class TesVehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih salah satu");
        System.out.println("1.Mobil");
        System.out.println("2.Sepeda");
        System.out.println("3.Keluar");
        System.out.print("Masukkan Angka Pilihan Anda : ");
        System.out.println("");
        System.out.println("-----------------------------------");
        int pilihan = input.nextInt();
        System.out.println("-----------------------------------");

        if (pilihan == 1) {

            System.out.println("Convertivble (1. ya / 2. tidak )");
            int Pilih = input.nextInt();

            if (Pilih == 1 ){
                
                System.out.println("Masukkan Merk Kendaraan : ");
                String merk = input.next();
                System.out.print("Jumlah Roda : ");
                int jumlahRoda = input.nextInt();
                System.out.print("Harga : ");
                double harga = input.nextDouble();
                System.out.print("Jumlah Pintu : ");
                int jumlahPintu = input.nextInt();
                System.out.print("Ini Listrik? (true/false): ");
                boolean iniListrik = input.nextBoolean();
                System.out.print("Tipe Atap :");
                String tipeAtap = input.next();

                convertible c2 = new convertible(tipeAtap, jumlahRoda, harga, jumlahPintu, iniListrik);
                car c1 = new car(jumlahRoda, harga, jumlahPintu, iniListrik);
                System.out.println("----------------------------");
                System.out.println("         DATA MOBIL");
                System.out.println("----------------------------");
                c1.print();
                c2.print();

                System.out.println("Mau Diskon Apa (1. iya / 2. Tidak)");
                int diskon = input.nextInt();
                if (diskon == 1) {
                    System.out.print("Masukkan Persentase Diskon Untuk Mobil : ");
                    double diskonMobil = input.nextDouble();
                    double hasilHargaMobil = c1.pakaidiskon(diskonMobil);
                    System.out.println("Harga Setelah Diskon Adalah : " + hasilHargaMobil);

                } else if (diskon == 2) {
                    System.out.println("Terima Kasih Sudah Belanja");
                }
                
            }else if (Pilih == 2){
                
                System.out.println("Masukkan Merk Kendaraan : ");
                String merk = input.next();
            System.out.print("Jumlah Roda : ");
            int jumlahRoda = input.nextInt();
            System.out.print("Harga : ");
            double harga = input.nextDouble();
            System.out.print("Jumlah Pintu : ");
            int jumlahPintu = input.nextInt();
            System.out.print("Ini Listrik? (true/false): ");
            boolean iniListrik = input.nextBoolean();
            
            car c1 = new car(jumlahRoda, harga, jumlahPintu, iniListrik);
            System.out.println("----------------------------");
            System.out.println("         DATA MOBIL");
            System.out.println("----------------------------");
            c1.print();
            
            System.out.println("Mau Diskon Apa (1. iya / 2. Tidak)");
            int diskon = input.nextInt();
            if (diskon == 1){
                System.out.print("Masukkan Persentase Diskon Untuk Mobil : ");
                double diskonMobil = input.nextDouble();
                double hasilHargaMobil = c1.pakaidiskon(diskonMobil);
                System.out.println("Harga Setelah Diskon Adalah : " + hasilHargaMobil);
                
            }else if (diskon == 2) {
                System.out.println("Terima Kasih Sudah Belanja");
            }
        }


        } else if (pilihan == 2) {
            System.out.println("Masukkan Merk Sepeda:");
            String merk = input.next();
            System.out.print("Jumlah Roda: ");
            int jumlahRoda = input.nextInt();
            System.out.print("harga: ");
            double harga = input.nextDouble();
            System.out.print("Tipe Sepeda: ");
            String tipeSepeda = input.next();
            System.out.println("----------------------------");
            System.out.println("         DATA SEPEDA");
            System.out.println("----------------------------");
            bicycle b1 = new bicycle(jumlahRoda, harga, tipeSepeda);
            b1.print();

            System.out.println("Mau Diskon Apa (1. True / 2. Tidak)");
            int diskon = input.nextInt();
            if (diskon == 1) {
                System.out.print("Masukkan Persentase Diskon Untuk Sepeda : ");
                double diskonSepeda = input.nextDouble();
                double hasilHargaSepeda = b1.pakaidiskon(diskonSepeda);
                System.out.println("Harga Setelah Diskon Adalah : " + hasilHargaSepeda);

            } else if (diskon == 2) {
                System.out.println("Terima Kasih Sudah Belanja");
            }

            

        }else {
            System.out.println("Anda Keluar Dari Program");
        }
        
        input.close();
    }
}
