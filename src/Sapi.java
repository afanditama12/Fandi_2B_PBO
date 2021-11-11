public class Sapi extends Hewan{
    public Sapi() {
        super("Sapi", 4);
    }
    public void bersuara() {
        System.out.println("\nhemmmooohhh...,emmooouuh...");
    }
    public static void main(String[] args) {
        Sapi s = new Sapi();
        s.cetakAttribute();
        s.bersuara();
    }
}
