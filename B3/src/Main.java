//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FactoryMenu meniuPost = new FactoryMenuPost();

        Supe supaPost = meniuPost.createSUpa();
        Deserturi desertPost = meniuPost.createDesert();

        meniuPost.descriereMeniu();
        supaPost.descriereSupe();
        desertPost.descriereDesert();

        FactoryMenu meniuDeDulce = new FactoryMenuDeDulce();

        Supe supaDeDulce = meniuDeDulce.createSUpa();
        Deserturi desertDeDulce = meniuDeDulce.createDesert();

        System.out.println("------------");

        meniuDeDulce.descriereMeniu();
        supaDeDulce.descriereSupe();
        desertDeDulce.descriereDesert();

        FactoryMenu meniuMixt = new FactoryMenuMixt();

        Supe supaMixt = meniuMixt.createSUpa();
        Deserturi desertMixt = meniuMixt.createDesert();

        System.out.println("------------");

        meniuMixt.descriereMeniu();
        supaMixt.descriereSupe();
        desertMixt.descriereDesert();




    }
}