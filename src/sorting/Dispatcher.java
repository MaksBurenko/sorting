package sorting;
import java.util.Arrays;
public class Dispatcher {
    public static void main(String[] args) {
        Car c1 = new Car (200, 8000, "BMW", "Red");
        Car c2 = new Car (120, 1000, "BMW", "Green");
        Car c3 = new Car (190, 7000, "BMW", "White");

        Car [] c = {c1, c2, c3};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
