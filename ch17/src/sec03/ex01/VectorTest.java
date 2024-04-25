package sec03.ex01;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("hello");
        vector.add(Integer.valueOf(189));
        vector.add(Float.valueOf(4.56F));
        vector.add(new Student());

        Enumeration enu = vector.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
