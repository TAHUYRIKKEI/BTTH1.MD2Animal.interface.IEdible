package rikkei.academy;


import rikkei.academy.Fruit.Apple;
import rikkei.academy.Fruit.Fruit;
import rikkei.academy.Fruit.Orange;
import rikkei.academy.animal.Animal;
import rikkei.academy.animal.Chicken;
import rikkei.academy.animal.Tiger;
import edible.Iedible;





public class Main {
    public static void main (String[]args){
        Animal[]animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Iedible iedible = (Chicken) animal;
                System.out.println(iedible.howToEat());
            }

        }
        Fruit[]fruits=new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}