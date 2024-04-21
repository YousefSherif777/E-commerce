package com.mycompany.ecommercesystem;
public class BookProduct extends Product{
    String author;
    String publisher;
    public BookProduct(String n , int id, float p, String a,String pu){
    name = n;
    productId =id;
    price = p;
    author =a;
    publisher = pu;
    }
    public void setauthor(String a){
    author =a;
    }
    public String getauthor(){
    return author;
    }
    public void setpublisher(String p){
    publisher = p;
    }
    public String getpublisher(){
    return publisher;
    }
} 

