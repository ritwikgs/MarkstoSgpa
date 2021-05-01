public class Main {
    public static void main(String[] args) {
        Studentsgpa rit = new Studentsgpa("Ritwik");
        Studentsgpa xyz = new Studentsgpa("abc");
        System.out.println(rit.calsgpa());
        System.out.println(xyz.calsgpa());
    }
}
