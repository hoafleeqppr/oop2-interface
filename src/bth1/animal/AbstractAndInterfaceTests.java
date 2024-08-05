package bth1.animal;

import bth1.animal.Animal;
import bth1.animal.Chicken;
import bth1.animal.Tiger;
import bth1.animal.edible.Edible;
import bth1.animal.fruit.Fruit;
import bth1.animal.fruit.Orange;
import bth1.animal.fruit.Apple;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[1] = new Chicken();
        animals[0] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }


    }
}
