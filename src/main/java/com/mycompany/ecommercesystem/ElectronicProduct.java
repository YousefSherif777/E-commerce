package com.mycompany.ecommercesystem;
public class ElectronicProduct extends Product{
    String brand;
    int warrantyPeriod;
    public ElectronicProduct(String n , int id, float p,String b, int wp){
    name = n;
    productId =id;
    price = p;
    brand = b;
    warrantyPeriod = wp;
    }
    public void setbrand(String b){
    brand = b;
    }
    public String getbrand(){
    return brand;
    }
    public void setwarrantyPeriod(int wp){
    if(wp>0){
    warrantyPeriod = wp;
    }
    else{
        warrantyPeriod = Math.abs(wp);
    }
    }
    public int getwarrantyPeriod(){
    return warrantyPeriod;
    }
}
