public class GeniusIT extends Handler{
    @Override
    public void proceseazaCerere(int nivelDificultate) {
        if (nivelDificultate>4){
            throw new RuntimeException("Nivel de eroare invalid");
        } else {
            System.out.printf("Eroarea de nivel " + nivelDificultate + " rezolvata de geniu");
        }
    }
}
