<<<<<<<< HEAD:src/main/java/Circus/Trainer.java
package Circus;

import Circus.Animal.Animal;
import Circus.Animal.Bird;
import Circus.Animal.Duck;
========
package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;
>>>>>>>> upstream/master:src/main/java/circus/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<<< HEAD:src/main/java/Circus/Trainer.java
        train(new Duck());
        // train(new Parrot());

        //Animal a2 = new Animal();
        //Bird b2 = new Bird();

========
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>>> upstream/master:src/main/java/circus/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
