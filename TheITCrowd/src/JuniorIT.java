public class JuniorIT extends Handler{
    @Override
    public void proceseazaCerere(int nivelDificultate) {
        if(nivelDificultate==1){
            System.out.printf("Eroarea de nivel " + nivelDificultate + " rezolvata de junior");
        } else if ( nivelDificultate == 2 || nivelDificultate == 3) {
            next.proceseazaCerere(nivelDificultate);
        } else {
            throw new RuntimeException("Nivel de eroare invalid");
        }
    }
}
