public class Rectangle {
  private int x;
  private int y;
  private int width;
  private int height;
  
  public Rectangle() {
    this.x = 0;
    this.y = 0;
    this.width = 0;
    this.height = 0;
  }

  public Rectangle(int width, int height) {
    this.x = 0;
    this.y = 0;
    this.width = width;
    this.height = height;
  }

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return width * height;
  }
  
  public double calculatePerimeter() {
    return 2 * (width + height);
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public static boolean checkCollision(Rectangle r1, Rectangle r2) {
    return r1.x < r2.x + r2.width &&
        r1.x + r1.width > r2.x &&
        r1.y < r2.y + r2.height &&
        r1.y + r1.height > r2.y;
  }
}
