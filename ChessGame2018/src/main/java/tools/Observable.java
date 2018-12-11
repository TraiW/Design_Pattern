package tools;

public interface Observable {
    public void addObserver(Observers o);
    public void deleteObserver(Observers o);
    public void notifyObservers(Object o);
}
