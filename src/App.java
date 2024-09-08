public class App {

    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle();
        r1.setXY(2, 3);
        r1.setWidth(2);
        r1.setHeight(4);
        Rectangle r2 = new Rectangle(3, 2);
        Rectangle r3 = new Rectangle(2, 5, 10, 7);

        System.out.println(r1.calculateArea());
        System.out.println(r2.calculatePerimeter());

        System.out.println(Rectangle.checkCollision(r1, r3));
        System.out.println(Rectangle.checkCollision(r2, r3));
    }
}
