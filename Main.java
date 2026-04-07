public class Main {
    public static void main(String[] args) {
        Perusahaan pt = new Perusahaan("PT. Teknologi Nusantara", "Bandung");

        Karyawan k1 = new Karyawan("Budi Santoso", 30, "budi@mail.com", "K001", "Engineer", 8000000);
        Karyawan k2 = new Karyawan("Siti Rahayu", 25, "siti@mail.com", "K002", "Designer", 7500000);
        Manajer m1 = new Manajer("Ahmad Fauzi", 40, "ahmad@mail.com", "M001", "Manager", 15000000, "Engineering", 3);

        pt.tambahKaryawan(k1);
        pt.tambahKaryawan(k2);
        pt.tambahKaryawan(m1);

        pt.tampilSemuaKaryawan();

        boolean acc = m1.approveRequest("Cuti 3 hari - Budi");
        System.out.println("Status: " + (acc ? "DISETUJUI" : "DITOLAK"));

        pt.hapusKaryawan("K002");
        System.out.println("Sisa karyawan: " + pt.getTotalKaryawan());
    }
}
