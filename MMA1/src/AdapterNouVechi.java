public class AdapterNouVechi implements DocumentJudiciar {
    private GeneratorVechiHotarari genVechi;

    public AdapterNouVechi (GeneratorVechiHotarari genVechi){
        this.genVechi = genVechi;
    }
    @Override
    public void genereazaDocument() {
        System.out.println("Se trece de la Cuza la masini electrice");
        genVechi.creeazaHotarare();
    }
}
