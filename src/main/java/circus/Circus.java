package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            printCircusSize(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                printCircusSize("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            printCircusSize("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        //makeAnimalsTalk();
        //animals[3] = new Duck(" louise");
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        printAllAnimals(animalArrayList);
        printCircusSize("Number of animals in circus: " + animalArrayList.size());
        animalArrayList.add(new Duck("louise"));
        printCircusSize("Number of animals in circus: " + animalArrayList.size());
        Elephant strongOne = new Elephant("bob");
        Parrot andy = new Parrot("andy");
        animalArrayList.add(strongOne);
        animalArrayList.add(andy);
        printAllAnimals(animalArrayList);
        printCircusSize("Number of animals in circus: " + animalArrayList.size());
        animalArrayList.sort(Animal.AnimalNameComparator);
        printAllAnimals(animalArrayList);
        //System.out.println("Total value of animals " + calculateAssetValue(animals));
        //System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printCircusSize(String animalArrayList) {
        System.out.println(animalArrayList);
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a: animalArrayList){
            System.out.println(a);
        }
    }
}
