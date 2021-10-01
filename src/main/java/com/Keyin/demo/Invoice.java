package com.Keyin.demo;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    static int count = 0;

    public Invoice(int id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        count++;
    }

    //Copy constructor
    public Invoice(Invoice i){
        this.id = i.id;
        this.desc = i.desc;
        this.qty = i.qty;
        this.unitPrice = i.unitPrice;
        count++;
    }

    static int InvoiceCount(){
        count++;
    }

    public String getID(){
        return this.id;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        this.unitPrice = unitPrice*qty;
        return unitPrice;
    }

    public String toString(){
        return ("invoice " + this.id + this.desc + this.qty + this.unitPrice);
    }

}
