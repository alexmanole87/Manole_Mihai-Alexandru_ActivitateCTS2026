public class Context {
    private TipuriDeRedcuere tipReducere;

    public void setTipReducere(TipuriDeRedcuere tipReducere) {
        this.tipReducere = tipReducere;
    }

    public void aplicareReducere (double pretIntreg){

        if (tipReducere == null){
            System.out.println("Eroare");
        }

        tipReducere.setareReducere(pretIntreg);
    }
}
