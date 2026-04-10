public class Senior implements TipuriDeRedcuere{
    @Override
    public void setareReducere(double pretIntreg) {
        double pretRedus = pretIntreg - pretIntreg*0.15;
        System.out.println("După aplicarea reducerii de 15% noul preț este " + pretRedus + " lei");
    }
}
