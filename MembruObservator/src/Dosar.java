import java.util.ArrayList;
import java.util.List;

public class Dosar {

    private List<Observer> observatori = new ArrayList<>();

    public void addObservers(Observer obs) {
        observatori.add(obs);
    }

    public void notificare(String mesaj){
        for (Observer o: observatori){
            o.primesteMesaj(mesaj);
        }
    }

}
