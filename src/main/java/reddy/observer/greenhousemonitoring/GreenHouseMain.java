package reddy.observer.greenhousemonitoring;
/**
 * @description Main Driver Class For GreenHouse Monitoring System
 * To Control various conditions such as Light, water and ventilation and
 * display the values on a smart phone 
 * @author Reddy
 */
public class GreenHouseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GreenHouseData greenHouseData = new GreenHouseData();
        
        VentilationObserver ventObserver = new VentilationObserver(greenHouseData);
        LightFilterObserver lightObserver = new LightFilterObserver(greenHouseData);
        WaterPumpObserver waterObserver = new WaterPumpObserver(greenHouseData);
        SmartPhoneObserver smartPhoneObserver = new SmartPhoneObserver(greenHouseData);
        
        System.out.println("\n Humidity Changed \n");
        greenHouseData.setHumidity(20.5);
        
        System.out.println("\n Humidity Changed \n");
        greenHouseData.setHumidity(0.5);
        
        greenHouseData.unregister(smartPhoneObserver);
        
        System.out.println("\n Humidity Changed \n");
        greenHouseData.setHumidity(50.5);
        
     }
}
