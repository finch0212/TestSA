package Practice7;

public class Woman extends VoterBase{
    public Woman(int age) {
        super(age);
    }

    @Override
    public Gender getGender(){
        return Gender.WOMAN;
    }
}
