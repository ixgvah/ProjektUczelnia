package projekt.wzorzecObserwator;

public interface Subject {
    public void registerObserver(Observer s);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
