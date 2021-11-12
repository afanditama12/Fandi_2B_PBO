public class DVDPlayer implements Kendali {
        // atribut class dvd
        private int statusdvd = 0;

        // keadaan nyala
        public void on() {
                if (this.statusdvd == mati) {
                        this.statusdvd = nyala;
                        System.out.println("DVD nyala");
                } else {
                        System.out.println("DVD sudah nyala");
                }
        }

        // keadaan mati
        public void off() {
                if (this.statusdvd == nyala) {
                        this.statusdvd = mati;
                        System.out.println("DVD Mati");
                } else {
                        System.out.println("DVD sudah mati");
                }
        }
}
