/**
 * Light Filter Class to increase the shade or reduce
 * based on humidity in the greenhouse
 * @author Reddy
 */
package reddy.observer.greenhousemonitoring;

public class LightFilterObserver implements Observer , Printer{
    private GreenHouseData greenHouseData;
    private double humidity;
    
    public LightFilterObserver( GreenHouseData greenHouseData ){
        this.greenHouseData = greenHouseData;
        this.greenHouseData.register(this);
    }
    public void update( double humidity ) {
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("LightFilter Activated Monitoring humidity is " + humidity );
    }
}
