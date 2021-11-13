package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
    //create one method that takes two parameter as a Integer
    //and return the multiplication of these two number

    public int getmulti ( int a, int b){
        return a*b;
    }

    @Test
    public void validateMulti(){
        int result =getmulti(-2,4);
        int expected = -8;

        Assert.assertEquals(result, expected,"it is for -2 and 4");


    }
    @Test
    public void validateZero(){
        int result =getmulti(3,0);
        int expected = 0;

        Assert.assertEquals(result, expected,"it is for 3 and 0");

    }
    @Test
    public void validatePositive(){
        int result =getmulti(2,3);
        Assert.assertTrue(result==6);
    }
    @Test
    public void validateNegative(){
        int result = getmulti(-2,-3);
        int expected = 5;
        Assert.assertEquals(result, expected);// when assert fails the next line will not be executed
        //this is called hard assertion
        System.out.println("Negative test");
    }
}
