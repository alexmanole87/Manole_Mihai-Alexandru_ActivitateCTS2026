//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CreatorPersonalSpital creator = new CreatorBrancardier();
        PersonalSpital pm1 = creator.create();
        pm1.descriere();
        System.out.println(((PersonalMedical)pm1).nrIDMS());


        CreatorPersonalSpital crator2 = new CreatorAsistent();
        PersonalSpital pm2 = crator2.create();

        pm2.descriere();
        System.out.println(((PersonalMedical)pm2).nrIDMS());


        CreatorPersonalSpital creator3 = new CreatorDoctor();
        PersonalSpital pm3  = creator3.create();

        pm3.descriere();
        System.out.println(((PersonalMedical)pm3).nrIDMS());

        CreatorPersonalSpital creator4 = new CreatorSecretar();
        PersonalSpital pnm1 = creator4.create();

        pnm1.descriere();
        System.out.println(((PersonalNonMedical)pnm1).CNP());


        CreatorPersonalSpital creator5 = new CreatorRegistrator();
        PersonalSpital pnm2 = creator5.create();

        pnm2.descriere();
        System.out.println(((PersonalNonMedical)pnm2).CNP());



    }
}