
/**
 * Concrete Implementation of the Subject
 * @author Reddy
 * @description Observer Interface
 */
package reddy.observer.greenhousemonitoring;
import java.util.*;

public class GreenHouseData implements Subject{
    private List<Observer> observers;
    private double humidity;
    
    public GreenHouseData(){
        observers = new ArrayList<Observer>();
    }
    public void register(Observer o){
        if( o != null && !observers.contains(o)){
            observers.add(o);
        }
    }
    public void unregister(Observer o){
      
            observers.remove(o);
        
    }
    public void notifyAllObservers(){
        for ( Observer observer : observers ){
            observer.update(humidity);
        }
    }
    public void humidityChanged(){
        notifyAllObservers();
    }
    
    public void setHumidity(double humidity){
        this.humidity = humidity;
        humidityChanged();
    }
    
}
