package Practice2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandTime extends Command
{
    @Override
    String Execute() {

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss a zzz");
        return ("Current time: ") + formatForDateNow.format(dateNow);
    }

    public CommandTime()
    {
        name = "time";
        desc = "Get vurrent time on this computer";
    }
}