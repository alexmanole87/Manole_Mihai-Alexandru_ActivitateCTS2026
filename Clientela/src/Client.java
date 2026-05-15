public class Client {
    boolean Plus;
    boolean VIP;
    String nume;
    public Client(boolean plus, boolean VIP, String nume) {
        this.Plus = plus;
        this.VIP = VIP;
        this.nume = nume;
    }

    public boolean isPlus() {
        return Plus;
    }

    public boolean isVIP() {
        return VIP;
    }

    public String getNume() {
        return nume;
    }
}
