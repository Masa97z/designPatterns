public class Main {
    public static void main(String[] args) {
        senglton s1 = senglton.getInstance();
        s1.print();
        senglton s2 = senglton.getInstance();
        s2.print();
    }
}