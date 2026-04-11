public class Context {
    private Stare stare;

    public Context(){
        stare = new DeLogat();
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void apasaButon(){
        stare.actiune(this);
    }
}
