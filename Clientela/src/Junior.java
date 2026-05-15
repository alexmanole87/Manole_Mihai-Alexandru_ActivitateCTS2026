public class Junior extends Handler{
    @Override
    public void aparaClient(Client c) {
        if (c.isPlus() || c.isVIP()){
            trimiteMaiDeparte(c);
        } else {
            System.out.println("Avocatul stagiar l-a apărat pe clientul  "+c.getNume());
        }
    }
}
