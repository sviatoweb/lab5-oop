package flower.store;

import lombok.Setter;

@Setter
public class Tulip extends Flower {

    public Tulip(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.TULIP);
    }
    public Tulip() {
        super(0, FlowerColor.RED, 0, FlowerType.TULIP);
    }
}
