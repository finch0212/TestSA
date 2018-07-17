package Practice7;

public class Woman extends VoterBase{
    private VoterBase.Gender gender;

    @Override
    public VoterBase.Gender getGenger(){
        return  gender;
    }

    Woman(VoterBase.AgeCategory age){
        this.gender = VoterBase.Gender.Woman;
        super.age = age;
    }
}
