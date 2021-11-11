class Lampu implements InterfaceLampu {

    private int statusLampu = 0;

    @Override
    public void hidupkan() {
        if(this.statusLampu == KEADAAN_MATI) {
            this.statusLampu = KEADAAN_HIDUP;
            System.out.println("Lampu hidup");
        } else {
            System.out.println("Lampu sudah hidup");
        }
        
    }

    @Override
    public void matikan() {
        if (this.statusLampu == KEADAAN_HIDUP) {
            this.statusLampu = KEADAAN_MATI;
            System.out.println("Lampu mati");
        } else {
            System.out.println("Lampu sudah mati");
        }
        
    }
    
}// akhir kelas
