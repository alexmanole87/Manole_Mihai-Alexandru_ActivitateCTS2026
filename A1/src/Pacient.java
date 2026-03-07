public class Pacient {
   private boolean patRabatabil;
   private boolean micDejunInclus;
   private boolean papuciCamera;
   private boolean halatInterior;

   private Pacient  (PacientBuilder builder){
       this.patRabatabil = builder.patRabatabil;
       this.micDejunInclus = builder.micDejunInclus;
       this.halatInterior = builder.halatInterior;
       this.papuciCamera = builder.papuciCamera;
   }

   public static class PacientBuilder{
       private boolean patRabatabil;
       private boolean micDejunInclus;
       private boolean papuciCamera;
       private boolean halatInterior;

       public PacientBuilder (boolean patRabatabil){
           this.patRabatabil = patRabatabil;
       }

       public PacientBuilder micDejunInclus(boolean val){
           this.micDejunInclus = val;
           return this;
       }

       public PacientBuilder papuciCamera (boolean val){
           this.papuciCamera = val;
           return this;
       }

       public PacientBuilder halatInterior (boolean val){
           this.halatInterior = val;
           return this;
       }

       public Pacient build(){
           return  new Pacient(this);
       }
   }
}
