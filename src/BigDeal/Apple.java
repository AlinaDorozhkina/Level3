package BigDeal;

public class Apple implements Fruits{
    private float weight;


    public Apple() {
        this.weight =1.0f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
