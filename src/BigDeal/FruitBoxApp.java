package BigDeal;


public class FruitBoxApp {

    public static void main(String[] args) {
        doDemo();
    }

    public static void doDemo() {
        Box<Apple> appleBox = new Box();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box<Orange> orangeBox = new Box<>();
        //orangeBox.add(new Apple()); ошибка компиляции
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        Box <Orange> bigOrangeBox = new Box<>();
        bigOrangeBox.add(new Orange());
        bigOrangeBox.add(new Orange());
        bigOrangeBox.add(new Orange());
        bigOrangeBox.add(new Orange());
        bigOrangeBox.add(new Orange());
        bigOrangeBox.add(new Orange());

        System.out.println("Apple box weight is "+ appleBox.getWeight());
        System.out.println("Orange box weight is " +orangeBox.getWeight());
        System.out.println("Big Orange box weight is " +bigOrangeBox.getWeight());

        System.out.println("Is weight of apple box and orange box  the same? " + appleBox.compare(orangeBox));
        System.out.println("Is weight of orangeBox and Big Orange box the same " + orangeBox.compare(bigOrangeBox));

       orangeBox.putFromOneToAnother(bigOrangeBox);


    }


}


/*
        //Apple apple1 = new Apple();
       //Apple apple2=new Apple();
        //Apple apple3=new Apple();
        Orange orange = new Orange();
        Box <Apple>box=new Box();
       // box.add(apple1);
       /// box.add(apple2);
       // box.add(apple3);
        Box <Orange> box1 = new Box ();
        box1.add(orange);
        box1.getWeight();
        Box <Apple> box2 = new Box<>();
        box2.add(new Apple());
        box2.add(new Apple());
        System.out.println(box.getWeight());
        System.out.println(box.compare(box1));

        System.out.println(box.getWeight());
        System.out.println(box1.getWeight());

        box.putFromOneToAnother(box2);
        box.getWeight();
        box2.getWeight();


    }

 */

