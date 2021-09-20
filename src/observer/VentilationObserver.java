/**
 * @description Ventilation Observer Changes in humidity causes 
 * operation of Ventilation observer to be activated
 * @author reddy
 */
package observer;

public class VentilationObserver implements  Observer , Printer{
    private GreenHouseData greenHouseData;
    private double humidity;
    
    public VentilationObserver( GreenHouseData greenHouseData ){
        this.greenHouseData = greenHouseData;
        this.greenHouseData.register(this);
    }
    public void update( double humidity ) {
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("Ventillation System Activated Monitoring humidity is " + humidity);
    }
}
