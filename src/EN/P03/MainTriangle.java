package EN.P03;

public class MainTriangle {

    static void main(String[] args) {
        System.out.println("Num of tri:" + Triangle.getCountOfTriangles());
        Triangle t = new Triangle();
        Triangle e = new Triangle();
        System.out.println("Num of tri:" + Triangle.getCountOfTriangles());

    }
}
