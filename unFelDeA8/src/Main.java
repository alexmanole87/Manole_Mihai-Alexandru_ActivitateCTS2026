public class Main {
    public static void main(String[] args) {
            CreatorAbstract creatorATI= new CreatorATI();
            CreatorAbstract creatorIT = new CreatorIT();

            DepSpital dep1 = creatorATI.create();
            DepSpital dep2 = creatorIT.create();

            dep1.descriere();
            dep2.descriere();













    }
}