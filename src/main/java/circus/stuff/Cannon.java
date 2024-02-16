<<<<<<<< HEAD:src/main/java/Circus/equipment/Cannon.java
package Circus.equipment;
========
package circus.stuff;
>>>>>>>> upstream/master:src/main/java/circus/stuff/Cannon.java

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
