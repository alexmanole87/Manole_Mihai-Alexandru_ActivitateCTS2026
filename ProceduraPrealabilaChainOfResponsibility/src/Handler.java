public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void verificaCererea (CerereChemareInJudecata ccj){
        if (problemaDetectata(ccj)){
            atentioneaza(ccj);
        }
        if (next!=null){
            next.verificaCererea(ccj);
        }
    }

    protected abstract boolean problemaDetectata(CerereChemareInJudecata ccj);

    protected abstract void atentioneaza (CerereChemareInJudecata ccj);
}
