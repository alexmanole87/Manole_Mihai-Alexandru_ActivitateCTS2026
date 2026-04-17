public class SeniorIT extends Handler{
    @Override
    public void proceseazaCerere(int nivelDificultate) {
        if(nivelDificultate==2){
            System.out.printf("Eroarea de nivel " + nivelDificultate + " rezolvata de Senior");
        } else if (nivelDificultate == 3) {
            next.proceseazaCerere(nivelDificultate);
        } else {
            throw new RuntimeException("Nivel de eroare invalid");
        }
    }
}
