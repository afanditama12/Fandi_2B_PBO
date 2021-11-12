public class Televisi implements Kendali {
        // atribut class televisi
        private int statustv = 0;

        // keadaan nyala
        public void on() {
                if (this.statustv == mati) {
                        this.statustv = nyala;
                        System.out.println("Televisi nyala");
                } else {
                        System.out.println("Televisi sudah nyala");
                }
        }

        // keadaan mati
        public void off() {
                if (this.statustv == nyala) {
                        this.statustv = mati;
                        System.out.println("Televisi Mati");
                } else {
                        System.out.println("Televisi sudah mati");
                }
        }
}
