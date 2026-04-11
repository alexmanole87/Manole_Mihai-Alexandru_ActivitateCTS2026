public class Comanda {

    private LivrareStrategy strategy;

    public void setStrategy(LivrareStrategy strategy) {
        this.strategy = strategy;
    }

    public double executraCalucalreCuLivrare (double costFaraLivrare){
        if(strategy== null){
            throw  new RuntimeException("Eroare!!!!");
        }

        return costFaraLivrare + strategy.costLivrare();


    }
}
