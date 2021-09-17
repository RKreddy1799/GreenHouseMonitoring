/**
 * Smartphone Observer to update green house attendant of humidity change
 * @author reddy
*/
package reddy.observer.greenhousemonitoring;

public class SmartPhoneObserver implements Observer , Printer{
    private GreenHouseData greenHouseData;
    private double humidity;
    
    public SmartPhoneObserver( GreenHouseData greenHouseData ){
        this.greenHouseData = greenHouseData;
        this.greenHouseData.register(this);
    }
    public void update( double humidity ) {
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("Smartphone Display Humidity changed humidity is " + humidity);
    }
}
