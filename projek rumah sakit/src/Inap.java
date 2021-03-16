public class Inap {

    //---
    String[][] mainArray;

    // lama menginap
    final static String inap1 = "10";
    final static String inap2 = "8";
    final static String inap3 = "6";
    final static String inap4 = "4";
    final static String inap5 = "1";

    // diskon
    final static String diskon1 = "50";
    final static String diskon2 = "40";
    final static String diskon3 = "30";
    final static String diskon4 = "20";
    final static String diskon5 = "10";

    // constructor
    Inap(String[][] mainArray){
        this.mainArray = mainArray;
    }

    // getter
    public String getInap1() {
        return inap1;
    }
    public String getInap2() {
        return inap2;
    }
    public String getInap3() {
        return inap3;
    }
    public String getInap4() {
        return inap4;
    }
    public String getInap5() {
        return inap5;
    }
    public String getDiskon1() {
        return diskon1;
    }
    public String getDiskon2() {
        return diskon2;
    }
    public String getDiskon3() {
        return diskon3;
    }
    public String getDiskon4() {
        return diskon4;
    }
    public String getDiskon5() {
        return diskon5;
    }

    // array
    public static String[][] mainArray(Inap inap) {
        inap.mainArray[0][0] = inap1;
        inap.mainArray[0][1] = diskon1;
        inap.mainArray[1][0] = inap2;
        inap.mainArray[1][1] = diskon2;
        inap.mainArray[2][0] = inap3;
        inap.mainArray[2][1] = diskon3;
        inap.mainArray[3][0] = inap4;
        inap.mainArray[3][1] = diskon4;
        inap.mainArray[4][0] = inap5;
        inap.mainArray[4][1] = diskon5;

        return inap.mainArray;
    }

    public static void displayData(Inap inap){
        //----
        String lamaMenginap = "Lama Menginap";String diskon = "Diskon";

        //----

        // main program
        System.out.println("----------------------------------------------");
        System.out.printf("|\t%-15s |\t%-20s |\n", lamaMenginap,diskon);
        System.out.println("----------------------------------------------");

        for (int i = 0; i < 5; i++) {
            String displayHari = inap.mainArray[i][0] + " Hari";
            String displayDiskon  = inap.mainArray[i][1] + "% Dari Biaya Kamar";
            System.out.printf("|\t>%-14s |\t%-11s |\n", displayHari,displayDiskon);
        }
        System.out.println("----------------------------------------------");
    }

}
