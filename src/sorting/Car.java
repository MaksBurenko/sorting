package sorting;
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
    public int compareTo(Object o) {
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
    }
}
