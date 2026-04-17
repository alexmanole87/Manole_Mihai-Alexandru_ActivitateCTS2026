public abstract class Bautura {
    public final void prepara(){
        fierbeApa();
        preparaIngredient();
        toarnaInCana();
        adaugaExtra();
    }

    private void fierbeApa(){
        System.out.println("Se fierba bautura");
    }

    private void toarnaInCana(){
        System.out.println("Se toarna in cana");
    }

    protected abstract void preparaIngredient();
    protected void  adaugaExtra(){
        System.out.println("Nimic de adaugat in plus");
    }
}
