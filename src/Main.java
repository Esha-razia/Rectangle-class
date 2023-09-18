public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2, 3, 4, 5);
        Rectangle rect2 = new Rectangle(10, 4, 7, 6);
        //Rectangle miniRect=Rectangle.MiniRect(rect1,rect2);
        System.out.println(rect1.calculatearea());
        System.out.println(rect1.calculateperimeter());
        System.out.println(rect1.MiniRect(rect1, rect2));

        //if they overlap or not
        if (rect1.overlaping(rect2)) {
            System.out.println("Rectangle overlap.");
        } else {
            System.out.println("Rectangle do not overlap.");
        }
    }
}


