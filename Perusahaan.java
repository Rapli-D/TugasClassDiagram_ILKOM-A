import java.util.ArrayList;
import java.util.List;

public class Perusahaan {
    private String namaPerusahaan;
    private String alamat;
    private List<Karyawan> daftarKaryawan = new ArrayList<>();

    public Perusahaan(String nama, String alamat) {
        this.namaPerusahaan = nama;
        this.alamat = alamat;
    }

    public void tambahKaryawan(Karyawan k) { daftarKaryawan.add(k); }

    public void hapusKaryawan(String nip) {
        daftarKaryawan.removeIf(k -> k.getNip().equals(nip));
    }

    public int getTotalKaryawan() { return daftarKaryawan.size(); }

    public void tampilSemuaKaryawan() {
        System.out.println("=== " + namaPerusahaan + " ===");
        for (Karyawan k : daftarKaryawan) { k.tampilInfo(); System.out.println(); }
        System.out.println("Total: " + getTotalKaryawan() + " karyawan");
    }
}
