//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MenuAbstract meniuPost = new MeniuPost();
        Mancare m1 = meniuPost.gateste();
        Desert d1 = meniuPost.prepara();

        MeniuNormal meniuNormal = new MeniuNormal();
        Mancare m2 = meniuNormal.gateste();
        Desert d2 = meniuNormal.prepara();

        meniuPost.descriere();
        m1.descriere();
        d1.descriere();

        System.out.println("---------------\n");

        meniuNormal.descriere();
        m2.descriere();
        d2.descriere();




    }
}