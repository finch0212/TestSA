import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandDate extends Command
{
    @Override
    String Execute() {

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd");
        return ("Current date: ") + formatForDateNow.format(dateNow);

    }

    public CommandDate()
    {
        name = "date";
        desc = "Get vurrent date on this computer";
    }
}