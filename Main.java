public class Main {
  public static void main(String[] args) {
  String nama="Muhammad Rahardian Baihaqi";
  int nim= 1237050023;
  int nilai_tugas= 90;
  int nilai_UTS= 95;
  int nilai_UAS= 80;
  int persentase_tugas= nilai_tugas * 30 / 100;
  int persentase_UTS= nilai_UTS * 30 / 100;
  int persentase_UAS= nilai_UAS * 40 / 100;
  int nilai_akhir= persentase_tugas + persentase_UTS + persentase_UAS;
  
    System.out.println("=====DATA MAHASISWA=====");
    System.out.println("NAMA : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("NILAI TUGAS : " + nilai_tugas);
    System.out.println("NILAI UTS : " + nilai_UTS);
    System.out.println("NILAI UAS : " + nilai_UAS);
    System.out.println("NILAI AKHIR : " + nilai_akhir);
  }
}