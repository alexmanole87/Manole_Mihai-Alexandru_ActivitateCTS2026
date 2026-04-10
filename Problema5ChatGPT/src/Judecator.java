public class Judecator {
    private String nume;
    private float vechime;
    private boolean cunoasteLimbaFranceza;
    private boolean areDoctorat;
    private boolean aUrmatCursuriInternationale;
    private boolean poateParticipaLaCompleteSpecializate;

   private Judecator (JudecatorBuilder builder){
       this.nume = builder.nume;
       this.vechime= builder.vechime;
       this.cunoasteLimbaFranceza= builder.cunoasteLimbaFranceza;
       this.areDoctorat=builder.areDoctorat;
       this.aUrmatCursuriInternationale= builder.aUrmatCursuriInternationale;
       this.poateParticipaLaCompleteSpecializate=builder.poateParticipaLaCompleteSpecializate;
   }

   public static class JudecatorBuilder{
       private String nume;
       private float vechime;
       private boolean cunoasteLimbaFranceza;
       private boolean areDoctorat;
       private boolean aUrmatCursuriInternationale;
       private boolean poateParticipaLaCompleteSpecializate;

       public JudecatorBuilder (String nume, float vechime){
           this.nume=nume;
           this.vechime = vechime;
       }

       public JudecatorBuilder cunoasteLimbaFranceza (boolean v){
           this.cunoasteLimbaFranceza = v;
           return this;
       }

       public JudecatorBuilder areDoctorat (boolean v){
           this.areDoctorat = v;
           return this;
       }

       public JudecatorBuilder aUrmatCursuriInternationale (boolean v){
           this.aUrmatCursuriInternationale = v;
           return this;
       }

       public JudecatorBuilder poateParticipaLaCompleteSpecializate (boolean v){
           this.poateParticipaLaCompleteSpecializate = v;
           return this;
       }

       public Judecator build(){
           return new Judecator(this);
       }

   }
}


