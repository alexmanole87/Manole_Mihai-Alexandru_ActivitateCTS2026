public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonoimice;
    private boolean masaDecorata;
    private boolean muzicaPersoanlizata;
    private String genMuzica;

    private Rezervare (RezervareBuilder builder){
        this.asezareLaGeam = builder.asezareLaGeam;
        this.scauneErgonoimice = builder.scauneErgonoimice;
        this.masaDecorata = builder.masaDecorata;
        this.muzicaPersoanlizata = builder.muzicaPersoanlizata;
        this.genMuzica = builder.genMuzica;
    }

    public static class RezervareBuilder {
        private boolean asezareLaGeam = false;
        private boolean scauneErgonoimice = false;
        private boolean masaDecorata = false;
        private boolean muzicaPersoanlizata = false;
        private String genMuzica = "";

        public RezervareBuilder (boolean asezareLaGeam){
            this.asezareLaGeam = asezareLaGeam;
        }

        public RezervareBuilder scauneErgonoimice (boolean v){
            this.scauneErgonoimice = v;
            return this;
        }

        public RezervareBuilder masaDecorata (boolean v){
            this.masaDecorata = v;
            return this;
        }

        public RezervareBuilder muzicaPersoanlizata (boolean v){
            this.muzicaPersoanlizata = v;
            return this;
        }

        public RezervareBuilder genMuzica (String gen){
            this.genMuzica = gen;
            return this;
        }

        public Rezervare build(){
            return new Rezervare(this);
        }
    }




}
