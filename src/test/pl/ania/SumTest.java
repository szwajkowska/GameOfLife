package pl.ania;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void shouldAddInteger() {
        //given
        Sum sum = new Sum(5);

        //when
        int result = sum.add(6);

        //then
        Assert.assertEquals(11, result);


    }

    @Test
    public void shouldAddNegativeNumber() {
        //given
        Sum sum = new Sum(10);

        //when
        int result = sum.add(-10);

        //then
        Assert.assertEquals(0, result);
    }

}
