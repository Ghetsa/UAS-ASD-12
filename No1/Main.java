
public class Main {
  public static void main(String[] args) {
    DLL list = new DLL();
    Kendaraan kendaraan1 = new Kendaraan("1111", "Vario", "Honda", 150, 2020, 1);

    Transaksipajak transaksi1 = new Transaksipajak(6, 100000, 5000, kendaraan1);
    Transaksipajak transaksi2 = new Transaksipajak(7, 150000, 7000, kendaraan1);
    Transaksipajak transaksi3 = new Transaksipajak(8, 200000, 8000, kendaraan1);
    Transaksipajak transaksi4 = new Transaksipajak(9, 300000, 1000000, kendaraan1);

    list.addLast(transaksi1);
    list.addLast(transaksi2);
    list.addLast(transaksi3);
    list.addLast(transaksi4);

    System.out.println("Daftar Transaksi Pajak:");
    list.print();
}
}