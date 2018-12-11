package tools;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class ObservableClass implements Observable {
    private List<Observers> observers = new LinkedList<Observers>();

    public void addObserver(Observers o) {
        this.observers.add(o);
    }
    public void deleteObserver(Observers o) {
        this.observers.remove(o);
    }
    public void notifyObservers(Object o) {

        Iterator<Observers> iterator = observers.listIterator();
        Observers obs;

        if(iterator != null) {
            while(iterator.hasNext()){
                obs = iterator.next();
                if(obs != null) {
                    obs.update(o);
                }
            }
        }
    }


}
