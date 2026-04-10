
/*
În cadrul aplicației personalul spitalului este de mai multe tipuri.
Acestea sunt salvate într-un enum { Brancardier, Asistent, Medic}.
Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor PersonalSpital in funcție de tipul primit ca parametru.
* */
public class Main {
    public static void main(String[] args) {

        PersoanalSpital p1 = PersoalFactory.create(NumePozitiePersonal.Medic);
        PersoanalSpital p2 = PersoalFactory.create(NumePozitiePersonal.Asistent);

        p1.activitate();
        p2.activitate();

    }
}
