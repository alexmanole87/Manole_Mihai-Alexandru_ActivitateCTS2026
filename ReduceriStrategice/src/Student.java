public class Student implements TipuriDeRedcuere{
    @Override
    public void setareReducere(double pretIntreg) {
        double pretRedus = pretIntreg - pretIntreg*0.1;

        System.out.println("După aplicarea reducerii de 10% noul preț este " + pretRedus + " lei");
    }
}
