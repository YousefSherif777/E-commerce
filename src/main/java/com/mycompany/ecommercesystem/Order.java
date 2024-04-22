package com.mycompany.ecommercesystem;
public class Order {
   protected int customerId;
   protected int OrderId;
   float TotalPrice;
   public Order(){
   }

    public Order(int customerId, int OrderId, float TotalPrice) {
        this.customerId = customerId;
        this.OrderId = OrderId;
        this.TotalPrice = TotalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getOrderId() {
        return OrderId;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
   public void PrintOrderInformation(Product[]a){
       System.out.println("Order Id: " + OrderId);
       System.out.println("Customer Id: " + customerId);
       System.out.println("Products: ");
       for(int i =0 ;i<a.length;i++){
           System.out.println(a[i].name + " - "+ a[i].price);
       
       }
   }  
}
