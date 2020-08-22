package BigDeal;

public class Orange implements Fruits {
    private float weight;


    public Orange() {
        this.weight = 1.5f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
