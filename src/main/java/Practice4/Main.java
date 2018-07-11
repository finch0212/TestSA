package Practice4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Command> COMMAND_MAP = buildCommandMap();

    private static Map<String, Command> buildCommandMap() {
        Map<String, Command> result = new HashMap<>();
        result.put("list", new CommandList());
        result.put("map", new CommandMap());
        result.put("set", new CommandSet());
        result.put("deque", new CommandDeque());
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    COMMAND_MAP.get("list").execute();
                    break;

                case 2:
                    COMMAND_MAP.get("set").execute();
                    break;

                case 3:
                    COMMAND_MAP.get("deque").execute();
                    break;

                case 4:
                    COMMAND_MAP.get("COMMAND_MAP").execute();
                    break;

                default:
                    return;
            }
        }
    }

    private static void showOutMenu() {
        System.out.println("Выберите тип коллекции:\n" +
                "1. List\n" +
                "2. Set\n" +
                "3. Deque\n" +
                "4. Map\n" +
                "5. Выход из программы");
    }
}
