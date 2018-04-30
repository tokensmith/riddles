package org.rootservices.sum;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SumExistsTest {
    private SumExists subject;

    @Before
    public void setUp() {
        subject = new SumExists();
    }

    @Test
    public void existsTwoItemsShouldBeTrue() {
        List<Integer> items = List.of(5, 5);
        Integer sum = 10;

        Boolean actual = subject.exists(items, sum);
        assertThat(actual, is(true));
    }

    @Test
    public void existManyItemsShouldBeTrue() {
        List<Integer> items = List.of(5, 1, 4, 9, 3, 2, 5);
        Integer sum = 10;

        Boolean actual = subject.exists(items, sum);
        assertThat(actual, is(true));
    }
}