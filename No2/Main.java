import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    DLL list = new DLL();
    Kendaraan kendaraan1 = new Kendaraan("1111", "Vario", "Motor", 150, 2020, 1);
    Kendaraan kendaraan2 = new Kendaraan("2222", "Beat Karbu", "Motor", 150, 2021, 2);
    Kendaraan kendaraan3 = new Kendaraan("3333", "Mio Brong", "Motor", 150, 2019, 3);
    Kendaraan kendaraan4 = new Kendaraan("4444", "RX-King", "Motor", 150, 2002, 4);
    Kendaraan kendaraan5 = new Kendaraan("5555", "H-RV", "Mobil", 1000, 2005, 5);
    Kendaraan kendaraan6 = new Kendaraan("6666", "Fortuner", "Mobil", 1000, 2000, 6);
    Kendaraan kendaraan7 = new Kendaraan("7777", "Brio", "Mobil", 1000, 2024, 7);

    Transaksipajak transaksi1 = new Transaksipajak(6, 100000, 5000, kendaraan1);
    Transaksipajak transaksi2 = new Transaksipajak(7, 150000, 7000, kendaraan2);
    Transaksipajak transaksi3 = new Transaksipajak(8, 200000, 8000, kendaraan3);
    Transaksipajak transaksi4 = new Transaksipajak(9, 300000, 1000000, kendaraan4);

    list.addLast(transaksi1);
    list.addLast(transaksi2);
    list.addLast(transaksi3);
    list.addLast(transaksi4);

    // System.out.println("Daftar Transaksi Pajak:");
    // list.print();

    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in); // String
    boolean stop = true;

    System.out.println("----------------------------------------------");
    System.out.println("|                 WELCOME TO                 |");
    System.out.println("|               BAYARLAH PAJAK               |");
    System.out.println("----------------------------------------------");

    do {
      System.out.println("==============================================");
      System.out.println("|                 MENU UTAMA                 |");
      System.out.println("----------------------------------------------");
      System.out.println("| 1. Daftar Kendaraan                        |");
      System.out.println("| 2. bayar Pajak                             |");
      System.out.println("| 3. Tampilkan Seluruh Transaksi             |");
      System.out.println("| 4. Urutkan Transaksi Berdasar Nama Pemilik |");
      System.out.println("| 0. Keluar                                  |");
      System.out.println("----------------------------------------------");
      System.out.print("| Pilih Menu : ");
      int menu = sc.nextInt();
      switch (menu) {
        case 1:
          System.out.println("=============================================================================");
          System.out.println("|                              DAFTAR KENDARAAN                             |");
          System.out.println("=============================================================================");
          list.print();
          System.out.println("=============================================================================");
          
          break;
        case 2:
        case 3:
        case 4:
        case 0:
          break;
      }
    } while (stop);
  }
}