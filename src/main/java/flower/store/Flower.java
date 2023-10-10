package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter @AllArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {

    }

    public String getColor() {
        return color.toString();
    }
}
