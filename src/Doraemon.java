public class Doraemon extends Hewan implements Manusia {
    public Doraemon() {
        super("Doraemon", 2);
    }
    public void bersuara() {
        System.out.println("Hallo Doraemon......");
    }
    public void bernyanyi() {
        System.out.println("la la la lalalala.....");
    }
    public void tertawa() {
        System.out.println("hehehe....hehe.....");
    }
    @Override
    public void makan() {
        System.out.println("hhmm...kue dorayaki....");
    }
    public void makan2() {
        super.makan();
    }

    public static void main(String[] args) {
        Doraemon d = new Doraemon();
        d.cetakAttribute();
        d.bersuara();
        d.bernyanyi();
        d.tertawa();
        d.makan();
        d.makan2();

    }
}
