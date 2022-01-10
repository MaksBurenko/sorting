package sorting;
import java.util.Arrays;
public class Dispatcher {
    public static void main(String[] args) {
        Car c1 = new Car(200, 7000, "BMW", "Red");
        Car c2 = new Car(120, 1000, "Mers", "Green");
        Car c3 = new Car(190, 9000, "Honda", "White");

        Car[] c = {c1, c2, c3};

        if (args.length == 0) {
            Arrays.sort(c);
            for (Car temp : c) {
                System.out.println(temp);
            }
        } else {

            try{
                int enterValue = Integer.parseInt(args[0]);
                if (enterValue == 1) {
                    Arrays.sort(c);
                    for (Car temp : c) {
                        System.out.println(temp);
                    }
                } else {
                    if (enterValue == 2) {
                        Arrays.sort(c, new ComparatorByColor());
                        for (Car temp : c) {
                            System.out.println(temp);
                        }
                    } else {
                        if (enterValue == 3) {
                            Arrays.sort(c, new ComparatorByPrice());
                            for (Car temp : c) {
                                System.out.println(temp);
                            }
                        } else {
                            if (enterValue == 4) {
                                Arrays.sort(c, new ComparatorBySpeed());
                                for (Car temp : c) {
                                    System.out.println(temp);
                                }
                            } else {
                                Arrays.sort(c);
                                for (Car temp : c) {
                                    System.out.println(temp);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Arrays.sort(c);
                for (Car temp : c) {
                    System.out.println(temp);
                }
            }
        }
    }
}
