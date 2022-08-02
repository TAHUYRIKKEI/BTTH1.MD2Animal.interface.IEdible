package rikkei.academy.Fruit;

import edible.Iedible;

public class Apple extends Fruit implements Iedible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
