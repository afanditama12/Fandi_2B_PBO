public class LaporanTahunan implements InterfaceCetakLaporan {
    @Override
    public void cetakA5() {
        System.out.println("Cetak Laporan di A5");
    }

    @Override
    public void cetakB4() {
        System.out.println("Cetak Laporan di B4");
    }

    @Override
    public void cetakCustomSize() {
        System.out.println("Cetak Laporan di Custom Size");
    }

    // tanpa membuat main class
    public static void main(String[] args) {
        LaporanTahunan laporanTahunan = new LaporanTahunan();
        laporanTahunan.cetakA5();
        laporanTahunan.cetakB4();
        laporanTahunan.cetakCustomSize();
    }
    
}
