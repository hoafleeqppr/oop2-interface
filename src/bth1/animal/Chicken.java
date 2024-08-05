package bth1.animal;

import bth1.animal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken-Trang : cuc cc cuc cc ";
    }

    @Override
    public String howToEat() {
        return "bo vao mieng nhai";
    }
}
