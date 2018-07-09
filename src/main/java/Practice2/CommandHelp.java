package Practice2;

import java.util.Iterator;
import java.util.Map;

public class CommandHelp extends Command
{
    @Override
    String Execute() {
        System.out.println("All commands:");
        Iterator<Map.Entry<String, Object>> iterator = Main.map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            Command c = (Command) entry.getValue();
            System.out.println("Command \"" + c.name + "\"" + ": " + c.desc);
        }

        return "";
    }
    @Override
    String Execute(String[] args) {
        Command c = (Command) Main.map.get(args[0]);
        System.out.println("Command \"" + c.name + "\"" + ": " + c.desc);
        return "";
    }

    public CommandHelp()
    {
        name = "help";
        desc = "Get description of all of the commands";
    }
}
