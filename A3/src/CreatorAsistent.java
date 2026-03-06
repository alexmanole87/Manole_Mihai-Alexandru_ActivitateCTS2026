public class CreatorAsistent extends CreatorPersonalSpital{
    @Override
    public PersonalSpital create() {
        return new Asistent();
    }
}
