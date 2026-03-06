public class Asistent extends PersonalMedical{
    @Override
    public int nrIDMS() {
        return 256;
    }

    @Override
    public void descriere() {
        System.out.println("Ajuta dr.");
    }
}
