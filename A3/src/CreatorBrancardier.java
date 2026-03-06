public class CreatorBrancardier extends CreatorPersonalSpital{
    @Override
    public PersonalSpital create() {
        return new Brancardier() {
        };
    }
}
