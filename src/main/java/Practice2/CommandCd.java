
package Practice2;

public class CommandCd  extends Command
{
    @Override
    String Execute() {

        return null;
    }
    @Override
    String Execute(String[] args) {
        String str = "";
        for (String s: args
             ) {
            str += (s+" ");
        }
        str = str.substring(0,str.length()-1);
        Main.currPath = str;
        return ("Working derictory changed on" + str);
    }

    public CommandCd()
    {
        name = "cd";
        desc = "Change working derictory";
    }
}
