package com.Keyin.demo;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {

    @Test
    public void testGetTotal() {
        Invoice invoiceTestGetTotal = new Invoice(1, "new item", 20, 9.99);

        Assert.assertTrue(invoiceTestGetTotal.getUnitPrice() == 199.8);
    }
}
