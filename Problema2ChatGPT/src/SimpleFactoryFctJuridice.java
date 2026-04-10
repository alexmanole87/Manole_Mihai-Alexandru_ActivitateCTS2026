public class SimpleFactoryFctJuridice {
    public static iFctJuridica hire (FctJuridice fj){
        return switch (fj) {
            case Judecator -> new Judector();
            case Grefier -> new Grefier();
            case Arhivar -> new Arhivar();
            case Registrator -> new Registrator();
            default -> throw new IllegalArgumentException("problem");
        };
    }
}
