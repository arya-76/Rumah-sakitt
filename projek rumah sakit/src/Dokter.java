public class Dokter {

    //---
    String[][] mainArray;

    // kode dokter
    final static String kode1 = "DK001";
    final static String kode2 = "DK002";
    final static String kode3 = "DK003";
    final static String kode4 = "DK004";
    final static String kode5 = "DK005";

    // nama dokter
    final static String nama1 = "DR.Andi";
    final static String nama2 = "DR.Joko";
    final static String nama3 = "DR.Karni";
    final static String nama4 = "DR.Amin";
    final static String nama5 = "DR.Udin";

    // biaya pemeriksaan
    final static String biaya1 = "500000";
    final static String biaya2 = "400000";
    final static String biaya3 = "300000";
    final static String biaya4 = "200000";
    final static String biaya5 = "100000";

    // constructor
    Dokter(String[][] mainArray){
        this.mainArray = mainArray;
    }

    // getter

    public String getKode1() {
        return kode1;
    }
    public String getKode2() {
        return kode2;
    }
    public String getKode3() {
        return kode3;
    }
    public String getKode4() {
        return kode4;
    }
    public String getKode5() {
        return kode5;
    }
    public String getNama1() {
        return nama1;
    }
    public String getNama2() {
        return nama2;
    }
    public String getNama3() {
        return nama3;
    }
    public String getNama4() {
        return nama4;
    }
    public String getNama5() {
        return nama5;
    }
    public String getBiaya1() {
        return biaya1;
    }
    public String getBiaya2() {
        return biaya2;
    }
    public String getBiaya3() {
        return biaya3;
    }
    public String getBiaya4() {
        return biaya4;
    }
    public String getBiaya5() {
        return biaya5;
    }

    // array
    public static String[][] mainArray(Dokter dokter) {
        dokter.mainArray[0][0] = kode1;
        dokter.mainArray[0][1] = nama1;
        dokter.mainArray[0][2] = biaya1;
        dokter.mainArray[1][0] = kode2;
        dokter.mainArray[1][1] = nama2;
        dokter.mainArray[1][2] = biaya2;
        dokter.mainArray[2][0] = kode3;
        dokter.mainArray[2][1] = nama3;
        dokter.mainArray[2][2] = biaya3;
        dokter.mainArray[3][0] = kode4;
        dokter.mainArray[3][1] = nama4;
        dokter.mainArray[3][2] = biaya4;
        dokter.mainArray[4][0] = kode5;
        dokter.mainArray[4][1] = nama5;
        dokter.mainArray[4][2] = biaya5;

        return dokter.mainArray;
    }

    public static void displayData(Dokter dokter){
        //----
        String kodeDokter = "Kode Dokter";String namaDokter = "Nama Dokter";String biaya = "Biaya Pemeriksaandokter";
        //----

        // main program
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("|\t%-15s |\t%-15s |\t%-15s |\n", kodeDokter,namaDokter,biaya);
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("|\t%-15s |\t%-15s |\t%-23s |\n", dokter.mainArray[i][0],dokter.mainArray[i][1],dokter.mainArray[i][2]);
        }
        System.out.println("---------------------------------------------------------------------");

    }
}