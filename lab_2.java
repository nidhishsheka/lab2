package Car;


public class Car {
  String brand;
  String model; 
  double price;
  double mileage; 

 String OwnerName;

  static int totalcars;

  static String ShowroomName="RedRacing";
  Car(String brand, String model,double price,double mileage)
{
this.brand=brand; 
this.model=model;
 this.price=price; 
this.mileage=mileage; 
OwnerName="Manish"; 
totalcars++;
 
 }

Car(String brand, String model,double price,double mileage,String owner)

  {

    this.brand=brand;
 this.model=model; 
this.price=price;
 this.mileage=mileage;
 this.OwnerName=owner;
 totalcars++;

  }
  public String getOwnerName(String owner)
 {
    return OwnerName;
  }

  public void setOwnerName(String owner)
 {
    OwnerName=owner;
  }

  public void displayDetails() 
{
    System.out.println("Brand"+brand);
    System.out.println("Model"+model);
    System.out.println("Price"+price);
    System.out.println("mileage"+mileage);
    System.out.println("owner"+OwnerName);
}

  public void UpdatePrice(double newPrice)
 {
    price=newPrice;
  }

  public static void showTotalCars()
 {
    System.out.println("Total cars"+totalcars);
  }

  public static void showShowroomName() 
{
 System.out.println("Showroom"+ShowroomName); 
}

}

package Car;
public class Showroom { public static void main(String[] args) 
{
 Car c1 = new Car("Nano", "200", 40000, 18.5);
  Car c2 = new Car("Lamborghini", "300", 60000, 20.0);
 Car c3 = new Car("Ferrari", "500", 242000, 35.0);
  c1.displayDetails(); c2.displayDetails(); c3.displayDetails();
  c1.setOwnerName("Manish"); c1.UpdatePrice(16000);
   System.out.println("After Updates:"); c1.displayDetails();
   Car.showShowroomName();
  Car.showTotalCars();
    }

}
