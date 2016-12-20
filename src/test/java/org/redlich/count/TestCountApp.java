package org.redlich.count;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.redlich.count.Count;

public class TestCountApp {

    @Test
    public void test() {
        Count count = new Count("Mike","i");
        assertEquals(count.getString(),"Mike");
        }
    }
