public class PrintingSoftwareAdapter implements PrintareFacturi{
    private SoftBar sb;

    public PrintingSoftwareAdapter (SoftBar sb){
        this.sb = sb;
    }

    @Override
    public void PrintNewBills() {
        System.out.println("Se primeste comanda de la bucatarie.....");
        sb.imprimare();
    }
}
