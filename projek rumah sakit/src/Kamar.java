public class Kamar {

    //---
    String[][] mainArray;

    // kode kamar
    final static String kodeKamar1 = "111";
    final static String kodeKamar2 = "222";
    final static String kodeKamar3 = "333";
    final static String kodeKamar4 = "444";
    final static String kodeKamar5 = "555";

    // nama kamar
    final static String namaKamar1 = "Kamar Melati";
    final static String namaKamar2 = "Kamar Mawar";
    final static String namaKamar3 = "Kamar Dahlia";
    final static String namaKamar4 = "Kamar Anggrek";
    final static String namaKamar5 = "Kamar Tulip";

    // biaya kamar
    final static String biaya1 = "1000000";
    final static String biaya2 = "2000000";
    final static String biaya3 = "3000000";
    final static String biaya4 = "4000000";
    final static String biaya5 = "5000000";

    // constructor
    Kamar(String[][] mainArray){
        this.mainArray = mainArray;
    }

    // getter
    public String getKodeKamar1() {
        return kodeKamar1;
    }
    public String getKodeKamar2() {
        return kodeKamar2;
    }
    public String getKodeKamar3() {
        return kodeKamar3;
    }
    public String getKodeKamar4() {
        return kodeKamar4;
    }
    public String getKodeKamar5() {
        return kodeKamar5;
    }
    public String getNamaKamar1() {
        return namaKamar1;
    }
    public String getNamaKamar2() {
        return namaKamar2;
    }
    public String getNamaKamar3() {
        return namaKamar3;
    }
    public String getNamaKamar4() {
        return namaKamar4;
    }
    public String getNamaKamar5() {
        return namaKamar5;
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
    public static String[][] mainArray(Kamar kamar){
        kamar.mainArray[0][0] = kodeKamar1;
        kamar.mainArray[0][1] = namaKamar1;
        kamar.mainArray[0][2] = biaya1;
        kamar.mainArray[1][0] = kodeKamar2;
        kamar.mainArray[1][1] = namaKamar2;
        kamar.mainArray[1][2] = biaya2;
        kamar.mainArray[2][0] = kodeKamar3;
        kamar.mainArray[2][1] = namaKamar3;
        kamar.mainArray[2][2] = biaya3;
        kamar.mainArray[3][0] = kodeKamar4;
        kamar.mainArray[3][1] = namaKamar4;
        kamar.mainArray[3][2] = biaya4;
        kamar.mainArray[4][0] = kodeKamar5;
        kamar.mainArray[4][1] = namaKamar5;
        kamar.mainArray[4][2] = biaya5;

        return kamar.mainArray;
    }

    public static void displayData(Kamar kamar){
        //----
        String kodeKamar = "Kode Kamar";String namaKamar = "Nama Dokter";String biaya = "Biaya Kamar";
        //----

        // main program
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("|\t%-15s |\t%-15s |\t%-23s |\n", kodeKamar,namaKamar,biaya);
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("|\t%-15s |\t%-15s |\t%-23s |\n", kamar.mainArray[i][0],kamar.mainArray[i][1],kamar.mainArray[i][2]);
        }
        System.out.println("---------------------------------------------------------------------");
    }
}