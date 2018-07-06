import java.io.File;

public class CommandMkdir extends Command
{
    @Override
    String Execute() {

        return "";
    }
    @Override
    String Execute(String[] args) {
        new File(args[0]).mkdir();
        return ("Create new derictory: " + args[0]);
    }

    public CommandMkdir()
    {
        name = "mkdir";
        desc = "Create new derictory";
    }
}