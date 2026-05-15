public class Judecatorie extends Handler{
    @Override
    public void judeca(double valoareObiect) {
        if (valoareObiect<40000){
            System.out.println("Judecatoria a judecat o cauza cu un obiect în valoare de " + valoareObiect);
        } else {
            next.judeca(valoareObiect);
        }

    }
}
