public class Partener extends Handler{
    @Override
    public void aparaClient(Client c) {
        System.out.println("Partenerul l-a apărat pe clientul " + c.getNume());
    }
}
