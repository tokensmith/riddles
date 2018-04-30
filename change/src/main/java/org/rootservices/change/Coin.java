package org.rootservices.change;

public enum Coin {
    QUARTER (25),
    DIME (10),
    NICKEL (5),
    PENNY (1);

    Integer value;

    Coin(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
