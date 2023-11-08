/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_1;

/**
 *
 * @author ASUS
 */

class Nilai {
    String NIM;
    String Nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;
    double NilaiAkhir;

    public Nilai(String NIM, String Nama, double NilaiAbsen, double NilaiTugas, double NilaiUTS, double NilaiUAS) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.NilaiAbsen = NilaiAbsen;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
    }

    public void CetakNilai() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen[10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS [40%] : " + NilaiUAS);
        NilaiAkhir = (0.1 * NilaiAbsen) + (0.2 * NilaiTugas) + (0.3 * NilaiUTS) + (0.4 * NilaiUAS);
        System.out.println("Nilai Akhir : " + NilaiAkhir);
    }
}

public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nim = "123456";
        String nama = "John Doe";
        double absen = 80;
        double tugas = 85;
        double uts = 75;
        double uas = 90;

        Nilai nilai = new Nilai(nim, nama, absen, tugas, uts, uas);
        nilai.CetakNilai();
    }
    
}
