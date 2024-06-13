public class DLL {
    Node head;
    int size;

    public DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Transaksipajak data) {
        Node newNode = new Node(null, data, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void print() {
        Node current = head;
        System.out.printf("| %-10s| %-8s| %-5s| %-10s| %-7s| %-12s %s|%n", "NOMOR TNKB", "NAMA PEMILIK", "JENIS", "CC KENDARAAN", "TAHUN", "BULAN HARUS BAYAR", "");

        while (current != null) {
            System.out.println("Kode: " + current.data.kode);
            System.out.println("Bulan Bayar: " + current.data.bulanBayar);
            System.out.println("Nominal Bayar: " + current.data.nominalBayar);
            System.out.println("Denda: " + current.data.denda);
            System.out.println("No TNKB: " + current.data.kendaraan.noTNKB);
            System.out.println("Nama: " + current.data.kendaraan.nama);
            System.out.println("Jenis: " + current.data.kendaraan.jenis);
            System.out.println("CC: " + current.data.kendaraan.cc);
            System.out.println("Tahun: " + current.data.kendaraan.tahun);
            System.out.println("Bulan Harus Bayar: " + current.data.kendaraan.bulanHarusBayar);
            System.out.println();
            current = current.next;
        }
    }
}

