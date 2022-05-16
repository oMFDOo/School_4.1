import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;
class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle(r="+ radius + ")";
    }
}

public class main {
    public static void main(String[] args) throws IOException {
        Circle obj = new Circle(5);
        System.out.println(obj.toString());

    }
}

