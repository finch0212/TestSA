package Practice2;

import java.io.File;

public class CommandDir extends Command
{
    @Override
    String Execute() {
        System.out.println(("Current directory: ") + Main.currPath + "\nFiles in directory:");
        File folder = new File(Main.currPath);
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