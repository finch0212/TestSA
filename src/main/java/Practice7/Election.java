package Practice7;

import java.util.*;

public class Election {

    private static Scanner in = new Scanner(System.in);
    private static String[] names = new String[]{"Пыня", "Сисян"};
    private static Map<String, ArrayList<Voter>> results = new HashMap<>();
    private static Map<Integer, String> namesWithNumber = new HashMap<>();

    public static void main(String[] args) {
        init();
        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    electionProcess();
                    break;
                case 2:
                    showOutStatistics();
                    break;
                default:
                    return;
            }
        }
    }

    private static void init() {
        for (int i = 0; i < names.length; i++) {
            results.put(names[i], new ArrayList<Voter>());
            namesWithNumber.put((i + 1), names[i]);
        }
    }

    private static void electionProcess() {
        System.out.println("Введите пол: " + "\n1. Мужской" + "\n2. Женский");
        int genger = in.nextInt();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.println();
        System.out.println("Ввыберите кандидата: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(String.format("%d. %s", (i + 1), names[i]));
        }
        int candidateNumber = in.nextInt();
        String candidate = namesWithNumber.get(candidateNumber);
        ArrayList<Voter> list = results.get(candidate);
        list.add(createVoter(genger == 1 ? VoterBase.Gender.Man : VoterBase.Gender.Woman, age));
        results.put(candidate, list);
        System.out.println("Ваш голос обработан.");
    }

    private static void showOutMenu() {
        System.out.println("1 – Проголосовать\n" +
                "2 – Вывести статистику\n" +
                "3 – Выход");
    }

    private static void showOutStatistics() {
        int count = 0;
        for (ArrayList<Voter> list : results.values()) {
            System.out.println("Голоса за кандидата " + names[count++]);
            for (Voter v : list) {
                System.out.println(v.getGenger() + " " + v.getAgeCategory());
            }
            System.out.println();
        }
    }

    private static Voter createVoter(VoterBase.Gender gender, int age) {
        VoterBase.AgeCategory ageCat = VoterBase.AgeCategory.Young;
        ;
        if (age >= 18 && age <= 29) ageCat = VoterBase.AgeCategory.Young;
        else if (age >= 30 && age <= 49) ageCat = VoterBase.AgeCategory.Middle;
        else if (age >= 50 && age <= 64) ageCat = VoterBase.AgeCategory.Old;
        else if (age >= 65) ageCat = VoterBase.AgeCategory.Pension;
        return gender == VoterBase.Gender.Man ? new Man(ageCat) : new Woman(ageCat);
    }
}