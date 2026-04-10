public class ContUtilizator implements Prototype{
    private String preferinte;
    private String rol;
    private String setari;
    private String istoric;

    public ContUtilizator (String preferinte, String rol, String setari, String istoric){
        this.preferinte = preferinte;
        this.rol = rol;
        this.setari = setari;
        this.istoric = istoric;
    }

    @Override
    public Prototype clone() {
        return new ContUtilizator(preferinte, rol,setari, istoric);
    }
}
