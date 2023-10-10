package flower.store;

import java.util.ArrayList;



public class FlowerBucket {
    private ArrayList<FlowerPack> packs = new ArrayList<FlowerPack>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public FlowerPack get(int index) {
        return packs.get(index);
    }

    public double getPrice() {
        double price = 0.0;

        for (int i = 0; i < packs.size(); i++) {
            price += packs.get(i).getPrice();
        }

        return price;
    }
}
