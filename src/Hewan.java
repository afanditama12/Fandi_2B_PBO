public abstract class Hewan {
    protected String nama;
    protected int jumKaki;

    public Hewan(String nama, int jumKaki) {
        this.nama = nama;
        this.jumKaki = jumKaki;
    }
    public abstract void bersuara();

    public void makan() {
        System.out.println("Nyam, Nyam, Nyam");
    }
    public void cetakAttribute() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Kaki: " + jumKaki);
    }
}
