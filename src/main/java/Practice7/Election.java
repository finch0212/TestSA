package Practice7;

import java.util.*;

public class Election {
    private static Scanner in = new Scanner(System.in);
    private static Map<Integer, String> candidatesById;
    private static Map<String, List<Voter>> votersByCandidate;

    static {
        candidatesById = new LinkedHashMap<>();
        candidatesById.put(1, "Пыня");
        candidatesById.put(2, "Сисян");

        votersByCandidate = new HashMap<>();
        for (String candidateName : candidatesById.values()) {
            votersByCandidate.put(candidateName, new ArrayList<>());
        }
    }

    public static void main(String[] args) {
        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    vote();
                    break;

                case 2:
                    showOutStatistics();
                    break;

                default:
                    return;
            }
        }
    }

    private static void vote() {
        Gender gender = getGender();

        System.out.print("\nВведите возраст: ");
        int age = in.nextInt();

        System.out.println("\nВыберите кандидата: ");

        for (Map.Entry<Integer, String> entry : candidatesById.entrySet()) {
            System.out.println(String.format("%d. %s", entry.getKey(), entry.getValue()));
        }
        String candidateName = candidatesById.get(in.nextInt());

        List<Voter> voters = votersByCandidate.get(candidateName);
        voters.add(createVoter(gender, age));

        System.out.println("Ваш голос обработан.");
    }

    private static Gender getGender() {
        System.out.println("Введите пол: " + "\n1. Мужской" + "\n2. Женский");
        return (in.nextInt() == 1) ? Gender.MAN : Gender.WOMAN;
    }

    private static void showOutMenu() {
        System.out.println("1 – Проголосовать\n" +
                "2 – Вывести статистику\n" +
                "3 – Выход");
    }

    private static void showOutStatistics() {
        for (String candidateName : candidatesById.values()) {
            System.out.println("Голоса за кандидата " + candidateName + ":");

            Map<Gender, Integer> votesByGender = new HashMap<>();
            Map<AgeCategory, Integer> votesByAge = new HashMap<>();
            votesByGender.put(Gender.MAN,0);
            votesByGender.put(Gender.WOMAN,0);
            votesByAge.put(AgeCategory.YOUNG,0);
            votesByAge.put(AgeCategory.MIDDLE,0);
            votesByAge.put(AgeCategory.OLD,0);
            votesByAge.put(AgeCategory.PENSION,0);

            List<Voter> voters = votersByCandidate.get(candidateName);
            for (Voter voter : voters) {
                votesByGender.put(voter.getGender(), getVotesNumberByGender(votesByGender, voter) + 1);
                votesByAge.put(voter.getAgeCategory(), getVotesNumberByAge(votesByAge, voter) + 1);
            }
            showOutStatistics(votesByGender, votesByAge);
        }
    }

    private static void showOutStatistics(Map<Gender, Integer> votesByGender, Map<AgeCategory, Integer> votesByAge) {
        System.out.println("Мужчины: " + votesByGender.get(Gender.MAN) + ", Женщины: " + votesByGender.get(Gender.WOMAN));
        System.out.println("YOUNG: " + votesByAge.get(AgeCategory.YOUNG) + ", MIDDLE: " + votesByAge.get(AgeCategory.MIDDLE)
                + ", OLD: " + votesByAge.get(AgeCategory.OLD) + ", PENSION: " + votesByAge.get(AgeCategory.PENSION));
        System.out.println();
    }

    private static Integer getVotesNumberByAge(Map<AgeCategory, Integer> votesByAge, Voter voter) {
        Integer votesByAgeNum = votesByAge.get(voter.getAgeCategory());
        if (votesByAgeNum == null) {
            votesByAgeNum = 0;
        }
        return votesByAgeNum;
    }

    private static Integer getVotesNumberByGender(Map<Gender, Integer> votesByGender, Voter voter) {
        Integer votesByGenderNum = votesByGender.get(voter.getGender());
        if (votesByGenderNum == null) {
            votesByGenderNum = 0;
        }
        return votesByGenderNum;
    }

    private static Voter createVoter(Gender gender, int age) {
        return (gender == Gender.MAN) ? new Man(age) : new Woman(age);
    }
}