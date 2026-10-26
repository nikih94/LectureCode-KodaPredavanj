package EN.P03;

public class Triangle {

    private static int count = 0;

    int a,b;
    int c;
    final String color;



    Triangle(int a, int b, int c, String color){
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        count++;
    }

    Triangle(){
        System.out.println("Creating a Triangle");
        a = 5;
        b = 6;
        c = 7;
        count++;
        color="nothing";
    }
    Triangle(int sideA, int sideB, int sideC){
        a = sideA;
        b = sideB;
        c = sideC;
        count++;
        color="nothing";
    }

    public static int getCountOfTriangles(){
        return count;
    }

    public int getPerimeter(){
        return a + b + c;
    }

    public boolean isEquilateral(){
        return a == b && b == c;
    }

     static void main(String[] args) {
        System.out.println("Number of triangles: " + count);
        Triangle one = new Triangle(5,5,5, "red");
        Triangle two = new Triangle(3,4,5,"green");
        count = 100;
        System.out.println(one.a);
        System.out.println(two.a);
        System.out.println(one.color);
        System.out.println(two.color);
        System.out.println("Number of triangles: " + count);
        Triangle tri = new Triangle();

         System.out.println("Number of triangles: " + count);

         int perimeter = one.getPerimeter();
        System.out.println(perimeter);
        System.out.println(two.getPerimeter());

        //one.color = "black"; -- not allowed by final



        System.out.println("Is equilateral: "+one.isEquilateral());
        System.out.println("Is equilateral: "+two.isEquilateral());
    }

    public static void oldMain(){
        Triangle tri;
        tri = new Triangle(); //object creation
        System.out.println(tri.a);
        System.out.println(tri.b);
        System.out.println(tri.c);
        System.out.println(tri.color);

        tri.a = 5;
        tri.b = 4;
        tri.c = 1;
        //tri.color = "red";

        System.out.println(tri.a);
        System.out.println(tri.c);
        System.out.println(tri.color);

        Triangle second = new Triangle();
        second.a =1;
        second.b=1;
        second.c=1;
        System.out.println(second.b);
        System.out.println(second.c);
        System.out.println(tri.b);

    }

}
