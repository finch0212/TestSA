package Practice2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class _2Task1
{
    public static String currPath;
    public static Map map = new HashMap<String, Command>();
    public static boolean exe = false;
    public static void main(String[] args) throws IOException {
        currPath = new File("").getAbsolutePath();
        map.put("date",new CommandDate());
        map.put("time",new CommandTime());
        map.put("dir",new CommandDir());
        map.put("exit",new CommandExit());
        map.put("help",new CommandHelp());
        map.put("cd",new CommandCd());
        map.put("mkdir",new CommandMkdir());
        Scanner in = new Scanner(System.in);
        while(true) {
            exe = false;
            System.out.print(currPath + ">");
            String command = in.nextLine();
            MyParser pars = new MyParser();
            List<String> commands = pars.Parse(command, ' ');
            if(map.containsKey(commands.get(0))) {
                Command c = (Command) map.get(commands.get(0));
                if(commands.size() == 1)
                System.out.println(c.Execute());
                else {
                    commands.remove(0);
                    String[] commArgs = new String[commands.size()];
                    for (int i = 0; i< commands.size();i++)
                    {
                        commArgs[i] = commands.get(i);
                    }
                    System.out.println(c.Execute(commArgs));
                }
            }
            else
            {
                File folder = new File(_2Task1.currPath);
                File[] listOfFiles = folder.listFiles();

                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        if(file.getName().equals(commands.get(0)))
                        {
                            System.out.println("Запуск "+currPath+"\\"+commands.get(0));
                            Runtime.getRuntime().exec(currPath+"\\"+commands.get(0));
                            exe = true;
                        }
                    }
                }
                if(!exe) System.out.println("Wrong command or exe file!");
            }

        }
    }
}



