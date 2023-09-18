public class Rectangle {
    double length;
    double width;
    int x;
    int y;

    //constructor to initialize
    public Rectangle(double length, double width ,int x ,int y) {
        this.length = length;
        this.width = width;
        this.x=x;
        this.y=y;
    }

    //setter and getter
    public void setlength() {
            this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setwidth() {
            this.width = width;
    }

    public double getWidth() {
            return width;
    }

    //to calculate area of reactangle
    public double calculatearea(){
        return length * width;
    }

    //to calculate perimeter
    public double calculateperimeter() {
        return 2 * (length + width);
    }
    public  Rectangle MiniRect(Rectangle r1, Rectangle r2) {
        if (r1.calculatearea()>r2.calculatearea())
            return r2;
        else
            return r1;
    }
 public boolean overlaping(Rectangle other){
     if(x < other.x + other.length && x + length > other.x && y < other.y + other.width && y + width > other.y){
         return true;
     }
     else {
         return false;
     }
    }


}
