public abstract class Person {
    private String nama;
    private int usia;
    protected String email;

    public Person(String nama, int usia, String email) {
        this.nama = nama;
        this.usia = usia;
        this.email = email;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getUsia() { return usia; }

    protected boolean validasiEmail() {
        return email != null && email.contains("@");
    }

    public abstract void tampilInfo();
}
