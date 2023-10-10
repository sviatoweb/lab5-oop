package flower.store;

public class Store {
    private FlowerBucket[] flowerBuckets;

    public Store(FlowerBucket[] flowerBuckets) {
        this.flowerBuckets = flowerBuckets;
    }


    public FlowerBucket[] search(FlowerType flowerType) {
        FlowerBucket[] result = new FlowerBucket[flowerBuckets.length];
        int resultIndex = 0;
        for (int i = 0; i < flowerBuckets.length; i++) {
            if (flowerBuckets[i].get(i).getFlower().
            getFlowerType().equals(flowerType)) {
                result[resultIndex] = flowerBuckets[i];
                resultIndex++;
            }
        }
        return result;
    }

}
