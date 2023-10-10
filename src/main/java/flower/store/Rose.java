package flower.store;

import lombok.Setter;

@Setter
public class Rose extends Flower {

    public Rose(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.ROSE);
    }
    public Rose() {
        super(0, FlowerColor.RED, 0, FlowerType.ROSE);
    }
}
