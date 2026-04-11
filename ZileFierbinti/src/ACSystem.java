import java.util.ArrayList;

public class ACSystem {

    private ArrayList<Observer> utilizatori = new ArrayList<>();
    private double  temperatura;

    public void addUtilizator(Observer o){
        utilizatori.add(o);
    }

    public void removeUtilizator (Observer o){
        utilizatori.remove(o);
    }

    public void notificareUtilizatori(){
        for (Observer o: utilizatori){
            o.uodate(temperatura);
        }

    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificareUtilizatori();
    }
}
