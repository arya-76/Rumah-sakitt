import jdk.swing.interop.SwingInterOpUtils;

public class Perhitungan {
    private String kodePasien;
    private String kodeKamar;
    private String lamaMenginap;
    private String kodeDokter;
    Pasien pasien;
    Dokter dokter;
    Inap inap;
    Kamar kamar;

    // constructor
    public Perhitungan(Pasien pasien,Dokter dokter,Inap inap,Kamar kamar,String kodePasien,String kodeKamar, String lamaMenginap, String kodeDokter){
        this.kodePasien = kodePasien;
        this.kodeKamar = kodeKamar;
        this.lamaMenginap = lamaMenginap;
        this.kodeDokter = kodeDokter;
        this.pasien = pasien;
        this.dokter = dokter;
        this.inap = inap;
        this.kamar = kamar;
    }

    //display
    public void display(){
        System.out.println("\nRumah Sakit Budi Utomo");
        System.out.println("----------------------");
        System.out.println("Status Pasien: "+compareStatusPasien());
        System.out.println("Biaya Dafter Pasien: "+compareCostPasien());
        System.out.println("Nama Kamar: "+ compareStatusRoom());
        System.out.println("Biaya Kamar: "+compareCostRoom());
        System.out.println("Nama Dokter: "+compareStatusDoctor());
        System.out.println("Biaya Pemeriksaan: "+compareCostDoctor());
        System.out.println("Diskon: "+compareCostInap()+"%");
        total();
    }

    //parse


    // calculate
    public void total(){
        double total = this.compareCostPasien() + ((this.compareCostInap()/100)*this.compareCostRoom()) + this.compareCostDoctor();
        System.out.println("Total Bayar: "+total);

    }

    // pasien
    public double compareCostPasien(){

        double cost = 0;

        for (int i = 0; i < 4; i++) {
            String foundCode = pasien.mainArray[i][0];
            cost = Double.parseDouble(pasien.mainArray[i][2]);
            if (kodePasien.equalsIgnoreCase(foundCode)){
                i = 4;
            }
        }
        return cost;
    }
    public String compareStatusPasien(){

        String status = "";

        for (int i = 0; i < 5; i++) {
            String foundCode = pasien.mainArray[i][0];
            status = pasien.mainArray[i][1];
            if (kodePasien.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return status;
    }

    // kamar
    public double compareCostRoom(){

        double cost = 0;

        for (int i = 0; i < 5; i++) {
            String foundCode = kamar.mainArray[i][0];
            cost = Double.parseDouble(kamar.mainArray[i][2]);
            if (kodeKamar.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }


        return cost;
    }
    public String compareStatusRoom(){

        String status = "";

        for (int i = 0; i < 5; i++) {
            String foundCode = kamar.mainArray[i][0];
            status = kamar.mainArray[i][1];
            if (kodeKamar.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return status;
    }

    // dokter
    public double compareCostDoctor(){

        double cost = 0;

        for (int i = 0; i < 5; i++) {
            String foundCode = dokter.mainArray[i][0];
            cost = Double.parseDouble(dokter.mainArray[i][2]);
            if (kodeDokter.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return cost;
    }
    public String compareStatusDoctor(){

        String status = "";

        for (int i = 0; i < 5; i++) {
            String foundCode = dokter.mainArray[i][0];
            status = dokter.mainArray[i][1];
            if (kodeDokter.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return status;
    }

    // inap
    public double compareCostInap(){

        double cost = 0;

        for (int i = 0; i < 5; i++) {
            String foundCode = inap.mainArray[i][0];
            cost = Double.parseDouble(inap.mainArray[i][1]);
            if (lamaMenginap.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return cost;
    }


}
