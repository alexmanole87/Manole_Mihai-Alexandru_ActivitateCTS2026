public class PersoalFactory {
    public static PersoanalSpital create(NumePozitiePersonal poz){
        switch (poz){
            case Asistent: return new Asistent();
            case Medic:return new Medic();
            case Brancardier: return new Brancardier();
            default: throw new IllegalArgumentException("Pozitie Invalida");
        }
    }
}
