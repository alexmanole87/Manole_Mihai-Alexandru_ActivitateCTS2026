public class CreatorDoctor extends CreatorPersonalSpital{
    @Override
    public PersonalSpital create() {
        return new Doctor();
    }
}
