public class Samsung extends Phone {
    public void setMerk() {
        System.out.println("Samsung");
    }

    public void setOS() {
        System.out.println("Android");
    }

    public void setColor() {
        System.out.println("WHITE");
    }

    public static void main(String[] args) {
        Samsung k = new Samsung();
        k.setMerk();
        k.setOS();
        k.setColor();
    }
}