/**
 * 
 * @author Reddy
 * @description Subject interface
 */
package reddy.observer.greenhousemonitoring;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyAllObservers();
}
