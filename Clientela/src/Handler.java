public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void trimiteMaiDeparte(Client c){
        if (null!=next){
            next.aparaClient(c);
        } else {
            System.out.println("Nu se poate aloca vreun avocat acestui client");
        }
    }

    public abstract void aparaClient(Client c);


}
