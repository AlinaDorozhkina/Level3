package BigDeal;

import java.util.ArrayList;

import java.util.List;

public class  Box <T extends Fruits> {
    private final List <T> content;
    private float weight;

    public Box (){
        content = new ArrayList<>();
    }

    public void add (T element){
        content.add(element);
    }

    public float getWeight() {
        if (content.size()==0){
            return 0.0f;
        }

        for (T t : content) {
            weight = content.size()*t.getWeight();
        }
        return weight;
    }

    public boolean compare (Box box){
        return this.getWeight() == box.getWeight();
    }

    public void putFromOneToAnother ( Box<T> anotherBox) {

        anotherBox.content.addAll(this.content);
        this.content.clear();
        System.out.println(this.getWeight());
        System.out.println(anotherBox.getWeight());

    }

}
