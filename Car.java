package project2;

public class Car {
    //Create a Class Car that would have the
    //following fields: carPrice and color and method
    //calculateSalePrice() which should be returning
    //a price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck
    //class has a field as weight and has its own
    //implementation of calculateSalePrice() method
    //in which returned price is calculated as
    //following: if weight>2000 then returned price
    //car should include 10% discount, otherwise 20%
    //discount.
    //The Sedan class has field as length and also
    //does it is own implementation of
    //calculateSalePrice(): if length of sedan is >20
    //feet then returned car price should include 5%
    //discount, otherwise 10% discount
String carColor;
double carPrice;
Car(double carPrice){
    this.carPrice=carPrice;

}
 double calculateSalePrice (){
     return carPrice;
 }
}
class Sedan extends Car{
    int length;
    Sedan(double carPrice,int length){
        super(carPrice);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return carPrice-(carPrice*0.05);
        }else {
            return carPrice-(carPrice*0.10);
        }

    }
}
class Truck extends Car{
    double weight;
    Truck(double carPrice,double weight){
        super(carPrice);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
     if (weight>2000){
         return carPrice-(carPrice*0.10);
     }else {
         return carPrice-(carPrice*0.20);
     }
    }
}
class CarTester{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(25000,23);
        System.out.println("Sedan  price is "+sedan.calculateSalePrice()+"$ with discount ");
        Truck truck =new Truck(39000,5900);
        System.out.println("Truck price is "+truck.calculateSalePrice()+"$ with discount ");
    }
}
