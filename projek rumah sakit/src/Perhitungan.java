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
        System.out.println("Rumah Sakit Budi Utomo\n");
        System.out.println("Status Pasien: "+compareStatusPasien());
        System.out.println("Biaya Dafter Pasien: "+compareCostPasien());
        System.out.println("Nama Kamar: "+ compareStatusRoom());
        System.out.println("Biaya Kamar: "+compareCostRoom());
        System.out.println("Nama Dokter: "+compareStatusDoctor());
        System.out.println("Biaya Pemeriksaan: "+compareCostDoctor());
        System.out.println("Diskon: "+compareCostInap()+"%");
        total();
    }

    // calculate
    public void total(){
        int diskon = compareCostInap();
        diskon/=100;
        System.out.println(diskon);
        int after = compareCostRoom() * diskon;
        System.out.println(after);
        int total = compareCostPasien() + after + compareCostDoctor();
        System.out.println("Total Bayar: "+total);

    }

    // pasien
    public int compareCostPasien(){

        int cost = 0;

        for (int i = 0; i < 4; i++) {
            String foundCode = pasien.mainArray[i][0];
            cost = Integer.parseInt(pasien.mainArray[i][2]);
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
    public int compareCostRoom(){

        int cost = 0;

        for (int i = 0; i < 5; i++) {
            String foundCode = kamar.mainArray[i][0];
            cost = Integer.parseInt(kamar.mainArray[i][2]);
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
    public int compareCostDoctor(){

        int cost = 0;

        for (int i = 0; i < 5; i++) {
            String foundCode = dokter.mainArray[i][0];
            cost = Integer.parseInt(dokter.mainArray[i][2]);
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
    public int compareCostInap(){

        int cost = 0;

        for (int i = 0; i < 5; i++) {
            String foundCode = inap.mainArray[i][0];
            cost = Integer.parseInt(inap.mainArray[i][1]);
            if (lamaMenginap.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return cost;
    }
    public String compareStatusInap(){

        String status = "";

        for (int i = 0; i < 5; i++) {
            String foundCode = inap.mainArray[i][0];
            status = inap.mainArray[i][1];
            if (lamaMenginap.equalsIgnoreCase(foundCode)){
                i = 5;
            }
        }
        return status;
    }

}
