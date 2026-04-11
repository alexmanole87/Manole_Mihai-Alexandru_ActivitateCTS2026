public class Director extends Handler{
    @Override
    public void proceseazaSuma(double suma) {
        if (suma<5000){
            System.out.println("Directorul a aprobat suma de " + suma);
        } else if (next!=null) {
            next.proceseazaSuma(suma);
        }
    }
}
