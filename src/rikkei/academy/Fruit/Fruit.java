package rikkei.academy.Fruit;

import edible.Iedible;

public abstract class Fruit implements Iedible {
    public static class Orange extends Fruit {
        @Override
        public String howToEat() {
            return null;
        }
    }
}
