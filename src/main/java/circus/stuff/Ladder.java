<<<<<<<< HEAD:src/main/java/Circus/equipment/Ladder.java
package Circus.equipment;

public class Ladder extends Equipment {
========
package circus.stuff;

import circus.Asset;

public class Ladder extends Equipment implements Asset {
>>>>>>>> upstream/master:src/main/java/circus/stuff/Ladder.java

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
