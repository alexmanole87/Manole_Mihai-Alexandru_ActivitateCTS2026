public class Clienti implements Observer{

    private String nume;

    public Clienti (String nume){
        this.nume = nume;
    }

    @Override
    public void update(String sales) {
        System.out.println("Clientul " + nume + " a primit informatii despre " + sales);
    }
}
