public class Manajer extends Karyawan {
    private String departemen;
    private int levelManajer;

    public Manajer(String nama, int usia, String email, String nip,
                   String jabatan, double gaji, String departemen, int levelManajer) {
        super(nama, usia, email, nip, jabatan, gaji);
        this.departemen = departemen;
        this.levelManajer = levelManajer;
    }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String d) { this.departemen = d; }

    public boolean approveRequest(String request) {
        System.out.println("Memproses: " + request);
        return levelManajer >= 2;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Departemen: " + departemen + " | Level: " + levelManajer);
    }
}
