public class SeniorAssociate extends Handler{
    @Override
    public void aparaClient(Client c) {
        if (c.isVIP()){
            trimiteMaiDeparte(c);
        } else {
            System.out.println("Avocatul colaborator cu o vechime mare l-a apărat pe clientul " + c.getNume());
        }
    }
}
