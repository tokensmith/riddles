package org.rootservices.postfix;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PostFixCalculatorTest {
    private PostFixCalculator subject;

    @Before
    public void setUp() {
        subject = new PostFixCalculator();
    }

    @Test
    public void calculateWhenAddShouldBeOk() {
        Integer actual = subject.calculate("3 3 +");
        assertThat(actual, is(6));
    }

    @Test
    public void calculateWhenAddAndMinusShouldBeOk() {
        Integer actual = subject.calculate("3 3 + 5 -");
        assertThat(actual, is(1));
    }

    @Test
    public void calculateWhenAddAndMinusAndDivideShouldBeOk() {
        Integer actual = subject.calculate("3 3 + 2 /");
        assertThat(actual, is(3));
    }
}