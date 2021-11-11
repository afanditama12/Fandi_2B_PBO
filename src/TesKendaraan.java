public class TesKendaraan {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Motor motorku = new Motor();

        // class mobil
        mobilku.tambahKecepatan();
        mobilku.kurangiKecepatan();

        // class motor
        motorku.tambahKecepatan();
        motorku.kurangiKecepatan();
    }
}
