package Practice7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Election {

    private static Scanner in = new Scanner(System.in);
    private static Map<String ,ArrayList<Voter>> results = new HashMap<>();

    public static void main(String[] args) {
        results.put("Путин", new ArrayList<Voter>());
        results.put("Грудинин", new ArrayList<Voter>());

        while (true) {
            System.out.println("1 – Проголосовать\n" +
                    "2 – Вывести статистику\n" +
                    "3 – Выход»");
            switch (in.nextInt()) {
                case 1: {
                    System.out.println("Введите пол: " + "\n1. Мужской" + "\n2. Женский");
                    int genger = in.nextInt();
                    System.out.print("Введите возраст: ");
                    int age = in.nextInt();
                    System.out.println();
                    System.out.println("Ввыберите кандидата: " + "\n1. Путин" + "\n2. Грудинин");
                    int candNum = in.nextInt();
                    String candidate = candNum==1?"Путин":"Грудинин";
                    ArrayList<Voter> list = results.get(candidate);
                    list.add(createVoter(genger==1? VoterBase.Gender.Man: VoterBase.Gender.Woman,age));
                    results.put(candidate,list);
                    System.out.println("Ваш голос обработан.");
                }
                break;
                case 2:
                    showOutStatistics();
                    break;
                default:
                    return;
            }
        }
    }

    private static void showOutStatistics() {
            for(ArrayList<Voter> list : results.values()){
                for(Voter v:list){
                    System.out.println(v.getGenger() + " " + v.getAgeCategory());
                }

            }
    }

    private static Voter createVoter(VoterBase.Gender gender, int age) {
        VoterBase.AgeCategory ageCat = VoterBase.AgeCategory.Young;;
        if (age >= 18 && age <= 29) ageCat = VoterBase.AgeCategory.Young;
        else if (age >= 30 && age <= 49) ageCat = VoterBase.AgeCategory.Middle;
        else if (age >= 50 && age <= 64) ageCat = VoterBase.AgeCategory.Old;
        else if (age >= 65) ageCat = VoterBase.AgeCategory.Pension;
        return gender == VoterBase.Gender.Man?new Man(ageCat):new Woman(ageCat);
    }
}
