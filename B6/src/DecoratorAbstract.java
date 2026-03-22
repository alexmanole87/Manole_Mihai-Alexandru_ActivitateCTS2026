public abstract class DecoratorAbstract implements NotaDePlata{
    protected NotaDePlata nota;

    public DecoratorAbstract (NotaDePlata np){
        this.nota = np;
    }

    @Override
    public void tiparire() {
        nota.tiparire();
    }
}
