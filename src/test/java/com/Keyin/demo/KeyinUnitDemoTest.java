package com.Keyin.demo;

import org.junit.Assert;
import org.junit.Test;

public class KeyinUnitDemoTest {
    private ClassUnderTest classUnderTest = new ClassUnderTest();

    @Test
    public void testResultIsFalseDefault(){

        boolean returnValue = classUnderTest.isTrue();

        Assert.assertFalse(returnValue);
    }

    @Test
    public void testResultIsFTrueAfterSetting(){
        boolean returnValue = classUnderTest.isTrue();
        Assert.assertFalse(returnValue);

        classUnderTest.setValue(true);
        returnValue = classUnderTest.isTrue();
        Assert.assertTrue(returnValue);
    }
}
