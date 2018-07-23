import org.junit.Test;

import static org.junit.Assert.*;

public class CheckArrayContainerTest {
    CheckArrayContainer checkArrayContainer = new CheckArrayContainer();
    @Test
    public void checkIfArrayContains1() {
        int[] temp = {1,2,3,4,5};
        assertEquals(true,checkArrayContainer.checkIfArrayContains(temp));
    }
    @Test
    public void checkIfArrayContains2() {
        int[] temp = {0,2,3,4,5};
        assertEquals(true,checkArrayContainer.checkIfArrayContains(temp));
    }
    @Test
    public void checkIfArrayContains3() {
        int[] temp = {0,0,0,0,0};
        assertEquals(false,checkArrayContainer.checkIfArrayContains(temp));
    }
}