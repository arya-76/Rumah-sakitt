import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------
        Scanner input = new Scanner(System.in);
        boolean looping = true;
        //--------

        //--- pasien
        String[][] arrayPasien  = new String[4][3];
        Pasien pasien = new Pasien(arrayPasien);
        Pasien.mainArray(pasien);
        //-----------

        //-- dokter
        String[][] arrayDokter = new String[5][3];
        Dokter dokter = new Dokter(arrayDokter);
        Dokter.mainArray(dokter);
        //----------

        //--- kamar
        String[][] arrayKamar = new String[5][3];
        Kamar kamar = new Kamar(arrayKamar);
        Kamar.mainArray(kamar);

        //--- inap
        String[][] arrayInap = new String[5][2];
        Inap inap = new Inap(arrayInap);
        Inap.mainArray(inap);

        while (looping){
            //-----
            int pilihan;
            String yORn;
            //-----
            System.out.println("            Administrasi Rumah Sakit Budi Utomo            \n");
            System.out.println("1. Lihat Seluruh Data");
            System.out.println("2. Administrasi\n");
            System.out.print("Masukan pilihan anda: ");pilihan = input.nextInt();
            System.out.println();

            switch (pilihan){
                case 1:
                    System.out.println("========================");
                    System.out.println("| Lihat Seluruh Data |");
                    System.out.println("========================");

                    System.out.println("DATA PASIEN");
                    Pasien.displayData(pasien);
                    System.out.println();

                    System.out.println("DATA DOKTER");
                    Dokter.displayData(dokter);
                    System.out.println();

                    System.out.println("DATA KAMAR");
                    Kamar.displayData(kamar);
                    System.out.println();

                    System.out.println("DATA MENGINAP");
                    Inap.displayData(inap);
                    System.out.println();


                    System.out.print("\nKembali ke main menu y/n?");yORn = input.next();
                    if (yORn.equalsIgnoreCase("y")){
                        looping = true;
                    }else {
                        looping = false;
                    }
                    break;
                case 2:

                    //---
                    String kodePasien;
                    String kodeKamar;
                    String lamaMenginap;
                    String kodeDokter;
                    //---

                    System.out.println("================");
                    System.out.println("| Administrasi |");
                    System.out.println("================");

                    System.out.print("Masukan kode pasien: ");kodePasien = input.next();
                    System.out.print("Masukan kode kamar: ");kodeKamar = input.next();
                    System.out.print("Masukan lama menginap: ");lamaMenginap = input.next();
                    System.out.print("Masukan kode dokter: ");kodeDokter = input.next();

                    Perhitungan perhitungan = new Perhitungan(pasien,dokter,inap,kamar,kodePasien,kodeKamar,lamaMenginap,kodeDokter);
                    perhitungan.display();

                    System.out.print("\nKembali ke main menu y/n?");yORn = input.next();
                    if (yORn.equalsIgnoreCase("y")){
                        looping = true;
                    }else {
                        looping = false;
                    }
            }
        }
    }
}
