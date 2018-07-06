import java.io.File;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class CommandDir extends Command
{
    @Override
    String Execute() {
        System.out.println(("Current directory: ") + _2Task1.currPath + "\nFiles in directory:");
        File folder = new File(_2Task1.currPath);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
        return ("");

    }

    public CommandDir()
    {
        name = "dir";
        desc = "Get directory of this program";
    }
}