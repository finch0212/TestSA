package Practice7;

public class Man extends VoterBase {
    private VoterBase.Gender gender;

    @Override
    public VoterBase.Gender getGenger(){
        return  gender;
    }

    Man(VoterBase.AgeCategory age){
        this.gender = VoterBase.Gender.Man;
        super.age = age;
    }

}
