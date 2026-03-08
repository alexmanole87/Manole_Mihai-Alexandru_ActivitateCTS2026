public class FactorySupe {
    public static iSupe create (tipSupe tip) {
        switch (tip){
            case supaDeLegume: return new supaDeLegume();
            case supaDeCiuperci: return new supaDeCiuperci();
            case supaDeVita: return new supaDeVita();
            default: throw new IllegalArgumentException("Nu avem supa asta");
        }
    }
}
