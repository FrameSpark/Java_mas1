package Array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicArrayTest {

    DynamicArray da;
    @Before
    public void create()
    {
       da = new DynamicArray(0);
    }
    @Test
    public void insertElement() {
        da.insertElement(5);
        assertEquals(da.showElementByIndex(0) , 5);
        assertEquals(da.getSize(), 1);
    }

    @Test
    public void changeElementByIndex() {
        da.insertElement(6);
        da.changeElementByIndex(0,1);
        assertEquals(da.showElementByIndex(0),6);
    }

    @Test
    public void deleteElementByIndex() {
        da.deleteElementByIndex(0);
        assertEquals(da.getSize(),0);
    }
}