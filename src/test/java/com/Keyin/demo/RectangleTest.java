package com.Keyin.demo;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testGetArea(){
        Rectangle rectangleTestArea = new Rectangle(2, 5);

        Assert.assertTrue(rectangleTestArea.getArea()==10);
    }

    @Test
    public void testGetPerimeter(){
        Rectangle rectangleTestPerimeter = new Rectangle(8, 4);

        Assert.assertTrue(rectangleTestPerimeter.getPerimeter()== 24);
    }

}
