import java.util.*;

public  class Generics {
    public static void main(String[] args) {
        String [] names = {"Marry", "Kate","Mila","Jessi", "Nicole"};
        Dog [] dogs = {new Dog("Boss","Black"), new Dog("Haski", "White"), new Dog ("Lik","Grey")};
        Integer [] numbers = {1,2,3,4,5};

        replace (names,0,10);
        replace(names,2,4);
        replace(dogs, 1,2);
        replace(numbers, 1,2);

        System.out.println(arrayToArrayList(names));
        arrayToArrayList(numbers);
    }

    public static <T> void replace(T[] array, int index1, int index2) {
        try {
            System.out.println("input array "+Arrays.toString(array));
            for (int i=0; i<array.length; i++){
                if (i==index1){
                    T temp= array[i];
                    array[i]=array[index2];
                    array[index2]=temp;
                }
            }
            System.out.println("output array "+Arrays.toString(array));

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound, size is " + array.length);

        }


    }

    public static <T> List <T> arrayToArrayList(T [] array){
        List <T> newArrayList = new ArrayList<>(array.length);
        for (T element:array){
            newArrayList.add(element);
        }
        return newArrayList;
    }

    private static class Dog{
        private String name;
        private String color;


        public Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }



        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}




