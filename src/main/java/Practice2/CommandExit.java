package Practice2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandExit extends Command
{
    @Override
    String Execute() {

        System.exit(0);
        return  null;
    }

    public CommandExit()
    {
        name = "exit";
        desc = "Exit out of this program";
    }
}