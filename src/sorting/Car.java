package sorting;

import java.util.Comparator;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;
    Car (int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }
    public String toString(){
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }
    // сортировка по всем параметрам по очереди в случае если предыдущие параметры одинаковые
   /* public int compareTo(Object o) {
        int m = this.model.compareTo(((Car)o).model);
        int s = this.speed - ((Car)o).speed;
        int p = this.price - ((Car)o).price;
        int c = this.color.compareTo(((Car)o).color);

        if (m == 0 ) {
            if (s == 0) {
                if (p == 0) {
                    return this.color.compareTo(((Car)o).color);
                } else
                    return p;
            } else
                return s;
        } else
            return m;
    }*/
   public int compareTo(Object o) {
       return this.model.compareTo(((Car)o).model);
   }
}

class ComparatorByPrice implements Comparator {
    public int compare (Object o1, Object o2) {
        return ((Car)o1).price - ((Car)o2).price;
    }
}
class ComparatorBySpeed implements Comparator {
    public int compare (Object o1, Object o2) {
        return ((Car)o1).speed - ((Car)o2).speed;
    }
}
class ComparatorByColor implements Comparator {
    public int compare (Object o1, Object o2) {
        return ((Car)o1).color.compareTo(((Car)o2).color);
    }
}
