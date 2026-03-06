public class Doctor extends PersonalMedical{
    @Override
    public void descriere() {
        System.out.println("Trateaza pacinti");
    }

    @Override
    public int nrIDMS() {
        return 512;
    }
}
