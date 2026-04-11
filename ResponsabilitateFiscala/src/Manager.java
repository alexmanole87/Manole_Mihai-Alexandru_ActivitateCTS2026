public class Manager extends Handler{
    @Override
    public void proceseazaSuma(double suma) {
        if (suma<1000){
            System.out.println("Managerul a aprobat suma de " + suma);
        } else if (next!=null){
            next.proceseazaSuma(suma);
        }
    }
}
