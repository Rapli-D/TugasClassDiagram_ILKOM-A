public class Karyawan extends Person {
    private String nip;
    private String jabatan;
    private double gaji;

    public Karyawan(String nama, int usia, String email, String nip, String jabatan, double gaji) {
        super(nama, usia, email);
        this.nip = nip;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getNip() { return nip; }
    public String getJabatan() { return jabatan; }
    public double hitungBonus() { return gaji * 0.10; }

    @Override
    public void tampilInfo() {
        System.out.println("Nama    : " + getNama() + "  |  NIP: " + nip);
        System.out.printf ("Jabatan : %s  |  Gaji: Rp%.0f%n", jabatan, gaji);
        System.out.printf ("Bonus   : Rp%.0f%n", hitungBonus());
    }
}
