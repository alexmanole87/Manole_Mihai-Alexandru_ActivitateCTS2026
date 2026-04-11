import java.util.ArrayList;

public class NewsAgency {

    private ArrayList<Observer> abonanati = new ArrayList<>();

    public void adaugareObserver (Observer o){
        abonanati.add(o);
    }

    public void  stergeObserver (Observer o){
        abonanati.remove(o);
    }

    public void notifica (String stirea){
        for (Observer o: abonanati){
           o.update(stirea);
        }
    }

}
