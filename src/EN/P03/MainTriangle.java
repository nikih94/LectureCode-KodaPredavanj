package EN.P03;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class MainTriangle {

    static void main(String[] args) {
        System.out.println("Num of tri:" + Triangle.getCountOfTriangles());
        Triangle t = new Triangle();
        Triangle e = new Triangle(4,5,8,"red");
        System.out.println("Num of tri:" + Triangle.getCountOfTriangles());

        System.out.println("Set of t.a: ");
        t.setA(100);
        System.out.println("Value of t.a: "+t.getA());

        Triangle larger = t.returnLarger(e);
        System.out.println("Color of the larger: "+ larger.color);
        larger.setA(5);
        System.out.println("Value of t.a: "+t.getA());
        System.out.println("Value of t.a: "+larger.getA());

        System.out.println("Are two references pointing to same obj?: "+ (t == larger));
        System.out.println("Are two references pointing to same obj?: "+ (t == e));

        Triangle a = new Triangle(1,2,3,"red");
        Triangle b = new Triangle(1,2,3,"red");
        System.out.println("Are two references pointing to same obj?: "+ (a == b));
        System.out.println("Are the two triangles of the same size?: "+ a.compare(b));
        Triangle c = a.clone();
        System.out.println("Are two references pointing to same obj?: "+ (a == c));
        System.out.println("Are the two triangles of the same size?: "+ a.compare(c));




    }
}
