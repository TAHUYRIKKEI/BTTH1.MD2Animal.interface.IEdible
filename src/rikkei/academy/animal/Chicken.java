package rikkei.academy.animal;


import edible.Iedible;

public class Chicken extends Animal implements Iedible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
