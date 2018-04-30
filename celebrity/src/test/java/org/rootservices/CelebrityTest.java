package org.rootservices;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class CelebrityTest {
    Celebrity subject;

    @Before
    public void setUp() {
        subject = new Celebrity();
    }

    @Test
    public void findCelebrity() {
        Integer actual = subject.findCelebrity(4);
        assertThat(actual, is(2));
    }
}