
/**
 *Water pump Observer to activate once humidity has changed
 * @author reddy
 */
package observer;

public class WaterPumpObserver implements Observer , Printer{
    private GreenHouseData greenHouseData;
    private double humidity;
    
    public WaterPumpObserver( GreenHouseData greenHouseData ){
        this.greenHouseData = greenHouseData;
        this.greenHouseData.register(this);
    }
    public void update( double humidity ) {
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("WaterPump Activated Monitoring humidity is " + humidity);
    }
}
