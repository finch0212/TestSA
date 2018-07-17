package Practice7;

public class VoterBase implements Voter{
    VoterBase.AgeCategory age;

    public AgeCategory getAgeCategory(){
        return age;
    }

    public void setAgeCategory(AgeCategory age) {
        this.age = age;
    }

    public Gender getGenger(){
        return null;
    }

    enum Gender{
        Man,
        Woman
    }

    enum AgeCategory{
        Young,//18-29
        Middle,//30-49
        Old,//50-64
        Pension//>65
    }
}
