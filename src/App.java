public class App {

    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(5, 5);
        Rectangle r2 = new Rectangle(4, 0, 3, 2);

        System.out.println(Rectangle.checkCollision(r1, r2));
    }
}
