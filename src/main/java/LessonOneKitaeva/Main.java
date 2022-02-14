package LessonOneKitaeva;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("The Competition starts!");
        System.out.println("____________________________");

                Championship c = new Championship(new Barrier[]{new Run(100), new SwimingPool(200)});
                Team team = new Team(" Super Zoo","red", "It's time to win!", new Competitor[]{new Teammate("The dog Daisy"), new Cat ("The cat Leopold"), new Bird(" eagle Fluffy")});

                team.teamInfo();
        System.out.println("____________________________");
                c.go(team);
        System.out.println("____________________________");
                team.showResults();
        System.out.println("____________________________");

        System.out.println("Competition completed. Welcome again!");
            }

        }