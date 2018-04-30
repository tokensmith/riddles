package org.rootservices.change;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class MakeChange {
    private static final Logger LOGGER = LogManager.getLogger(MakeChange.class);

    public Map<Coin, Integer> calculateChange(Integer amount) {
        Map<Coin, Integer> change = new HashMap<>();

        for(Coin coin: Coin.values()) {
            Integer qty = amount / coin.getValue();
            amount = amount % coin.getValue();
            change.put(coin, qty);
        }

        return change;
    }
}
