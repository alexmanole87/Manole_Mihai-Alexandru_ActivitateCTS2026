public class Semafor {
    Culoare culoare;

    public Semafor(){
        culoare = new Rosu();
    }

    public void setCuloare(Culoare culoare) {
        this.culoare = culoare;
    }

    public void schimbareCuloare(){
        culoare.actiune(this);
    }
}
