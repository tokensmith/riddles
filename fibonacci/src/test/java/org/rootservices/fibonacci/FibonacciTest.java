package org.rootservices.fibonacci;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci subject;

    @Before
    public void setUp() {
        subject = new Fibonacci();
    }

    @Test
    public void sequenceShouldBeOk() {
        List <Long> sequence = subject.sequence(7);

        assertThat(sequence, is(notNullValue()));
        assertThat(sequence.size(), is(8));

        assertThat(sequence.get(0), is(0L));
        assertThat(sequence.get(1), is(1L));
        assertThat(sequence.get(2), is(1L));
        assertThat(sequence.get(3), is(2L));
        assertThat(sequence.get(4), is(3L));
        assertThat(sequence.get(5), is(5L));
        assertThat(sequence.get(6), is(8L));
    }

    @Test
    public void fibonacciRecursiveShouldBeOk() {
        Long actual = subject.fibonacciRecursive(7);

        assertThat(actual, is(13L));
    }

    @Test
    public void fibonacciShouldBeOk() {
        Long actual = subject.fibonacci(7);

        assertThat(actual, is(13L));
    }
}