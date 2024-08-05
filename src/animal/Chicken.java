package animal;

import edible.Edible;

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
