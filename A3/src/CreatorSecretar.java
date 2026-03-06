public class CreatorSecretar extends CreatorPersonalSpital{
    @Override
    public PersonalSpital create() {
        return new Secretar();
    }
}
