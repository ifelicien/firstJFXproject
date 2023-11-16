package hellofx;

/** 
 * The code is defining a class called `Vehicle`. This class represents a vehicle object 
 * and has several private instance variables such as `year`, `make`, `model`, `color`, 
 * and `vinNumber`.
 */
public class Car {
    private int year;
    private String make;
    private String model;
    private String mileage;
    private String color;
    private String vinNumber;
    private String description;
    
    Car(int year, String make, String model, String mileage, String color, String vinNumber){
        this.setYear(year);
        this.setMake(make);
        this.setModel(model);
        this.setMileage(mileage);
        this.setColor(color);
        this.setVinNumber(vinNumber);
        this.setDescription(description);
    }

    //getter
    public int getYear(){
        return year;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getMileage(){
        return mileage;
    }
    public String getColor(){
        return color;
    }
    public String getVinNumber(){
        return vinNumber;
    }
    public String getDescription(){
        return description;
    }

    //setter
    public void setYear(int newYear){
        this.year = newYear;
    }
    public void setMake(String newMake){
        this.make = newMake;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setMileage(String newMileage){
        this.model = newMileage;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setVinNumber(String newVinNumber){
        this.vinNumber = newVinNumber;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
};