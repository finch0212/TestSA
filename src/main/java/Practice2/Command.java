package Practice2;
import java.util.Map;

abstract public class Command
{
    String  name, desc;
    String Execute()
    {
        return null;
    }
    String Execute(String[] args)
    {
        return null;
    }
    String Execute(Map map)
    {
        return null;
    }
    String GetName()
    {
        return name;
    }
    String GetDesc()
    {
        return desc;
    }
}
