public class Pasien {

    //---
    public static String[][] mainArray;

    // kode pasien
    final static String kodePasien1 = "PS0001";
    final static String kodePasien2 = "PS0002";
    final static String kodePasien3 = "PS0003";
    final static String kodePasien4 = "PS0004";

    // status pasien
    final static String status1 = "Pasien Baru";
    final static String status2 = "Pasien lama";
    final static String status3 = "Pasien BPJS";
    final static String status4 = "Pasien Akses";

    // biaya daftar pasien
    final static String biaya1 = "500000";
    final static String biaya2 = "400000";
    final static String biaya3 = "300000";
    final static String biaya4 = "200000";

    // constructor
    Pasien(String[][] mainArray){
        this.mainArray = mainArray;
    }

    // getter
    public String getKodePasien1() {
        return kodePasien1;
    }
    public String getKodePasien2() {
        return kodePasien2;
    }
    public String getKodePasien3() {
        return kodePasien3;
    }
    public String getKodePasien4() {
        return kodePasien4;
    }
    public String getStatus1() {
        return status1;
    }
    public String getStatus2() {
        return status2;
    }
    public String getStatus3() {
        return status3;
    }
    public String getStatus4() {
        return status4;
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

    // array
    public static String[][] mainArray(Pasien pasien){
        pasien.mainArray[0][0] = pasien.getKodePasien1();
        pasien.mainArray[0][1] = pasien.getStatus1();
        pasien.mainArray[0][2] = pasien.getBiaya1();
        pasien.mainArray[1][0] = pasien.getKodePasien2();
        pasien.mainArray[1][1] = pasien.getStatus2();
        pasien.mainArray[1][2] = pasien.getBiaya2();
        pasien.mainArray[2][0] = pasien.getKodePasien3();
        pasien.mainArray[2][1] = pasien.getStatus3();
        pasien.mainArray[2][2] = pasien.getBiaya3();
        pasien.mainArray[3][0] = pasien.getKodePasien4();
        pasien.mainArray[3][1] = pasien.getStatus4();
        pasien.mainArray[3][2] = pasien.getBiaya4();

        return pasien.mainArray;

    }

    public static void displayData(Pasien pasien){
        //----
        String kodePasien = "Kode Pasien";String statusPasien = "Status Pasien";String biaya = "Biaya Daftar Pasien";
        //----

        // main program
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("|\t%-15s |\t%-15s |\t%-23s |\n", kodePasien,statusPasien,biaya);
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.printf("|\t%-15s |\t%-15s |\t%-23s |\n", pasien.mainArray[i][0],pasien.mainArray[i][1],pasien.mainArray[i][2]);
        }
        System.out.println("---------------------------------------------------------------------");

    }


}
