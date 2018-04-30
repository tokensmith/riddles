package org.rootservices.change;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MakeChangeTest {
    private MakeChange subject;

    @Before
    public void setUp() {
        subject = new MakeChange();
    }

    @Test
    public void calculateChange() {
        Map<Coin, Integer> actual = subject.calculateChange(76);
        assertThat(actual.size(), is(4));

        assertThat(actual.get(Coin.PENNY), is(1));
        assertThat(actual.get(Coin.NICKEL), is(0));
        assertThat(actual.get(Coin.DIME), is(0));
        assertThat(actual.get(Coin.QUARTER), is(3));
    }
}