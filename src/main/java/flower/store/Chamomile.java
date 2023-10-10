package flower.store;

import lombok.Setter;

@Setter
public class Chamomile extends Flower {

    public Chamomile(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.CHAMOMILE);
    }
    public Chamomile() {
        super(0, FlowerColor.RED, 0, FlowerType.CHAMOMILE);
    }
}
