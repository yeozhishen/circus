<<<<<<<< HEAD:src/main/java/Circus/equipment/Equipment.java
package Circus.equipment;

import Circus.asset;

public abstract class Equipment implements asset {
========
package circus.stuff;

import circus.Asset;

public abstract class Equipment implements Asset {
>>>>>>>> upstream/master:src/main/java/circus/stuff/Equipment.java
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
