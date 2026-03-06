public class CreatorRegistrator extends CreatorPersonalSpital{
    @Override
    public PersonalSpital create() {
        return new Registrator();
    }
}
