package Practice7;

abstract class VoterBase implements Voter {
    private AgeCategory ageCategory;

    VoterBase(int age) {
        ageCategory = AgeCategory.valueOf(age);
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public abstract Gender getGender();
}
