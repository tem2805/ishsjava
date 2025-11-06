package collections;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<>();
//        System.out.println(fruits.isEmpty()); //true

        fruits.add(new Fruit("Kiwi", 3000));
        fruits.add(new Fruit("Strawberry", 2500));

//        System.out.println(fruits.isEmpty()); //false


//        Fruit[] fruits = {
//                new Fruit("Kiwi", 3000),
//                new Fruit("Strawberry", 2500)
//        };

        //array and arraylist
//        for(Fruit fruit : fruits){
//            System.out.println(fruit.getName()+" (단가 : "+fruit.getPrice()+")");
//        }

        //array only
//        for(int i=0; i<fruits.length; i++){
//            System.out.println(fruits[i].getName()+" (단가 : "+fruits[i].getPrice()+")");
//        }

        //arraylist only
                for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i).getName()+" (단가 : "+fruits.get(i).getPrice()+")");
        }
    }
}
