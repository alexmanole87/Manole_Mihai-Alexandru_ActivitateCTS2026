public class Dosar {
    private StrategieRedactare strategieRedactare;

    public void setStrategieRedactare(StrategieRedactare strategieRedactare) {
        this.strategieRedactare = strategieRedactare;
    }

    public void procesare(){
        strategieRedactare.redacteaza();
    }
}
