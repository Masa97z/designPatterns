package Observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
    private String name;
    private String availabilty ;
    private List<Observer> observerList;
    public Course(String name){
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyAllSubscribe() {
        for(Observer observer: observerList){
            observer.update(availabilty);
        }
    }
    void setAvailabilty(boolean availabile){
        availabilty = this.name + (availabile ? " Avalabile" : " Not Avalabile");
        notifyAllSubscribe();
    }
}
