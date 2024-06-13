public class Transaksipajak {
  Kendaraan kendaraan;
  int kode, bulanBayar;
  long nominalBayar, denda;

  private static int kodeCounter = 1;

  public Transaksipajak(int bulanBayar, long nominalBayar, long denda, Kendaraan kendaraan) {
      this.kode = kodeCounter++;
      this.bulanBayar = bulanBayar;
      this.nominalBayar = nominalBayar;
      this.denda = denda;
      this.kendaraan = kendaraan;
  }
}
