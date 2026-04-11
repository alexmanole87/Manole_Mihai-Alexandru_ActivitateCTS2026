import java.util.ArrayList;

public class Shop {
     ArrayList<Observer> clienti = new ArrayList<>();

     public void addClient(Observer o){
         clienti.add(o);
     }

     public  void remClient(Observer o){
         clienti.remove(o);
     }

     public void notify (String sale){
         for(Observer o: clienti){
             o.update(sale);
         }
     }
}
