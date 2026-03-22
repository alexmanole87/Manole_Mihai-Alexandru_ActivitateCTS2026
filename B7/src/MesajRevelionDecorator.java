public class MesajRevelionDecorator extends DecoratorAbstract{

    public MesajRevelionDecorator (NotaDePlata np){
        super(np);
    }

    @Override
    public void tiparire() {
        super.tiparire();
        adaugareMesajRevelion();
    }

    private void adaugareMesajRevelion(){
        System.out.println("La multi ani");
    }
}
