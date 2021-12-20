package LessonOneKitaeva;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dreamteam starts the Campionship!");

                Championship c = new Championship(new Barrier[]{new Run(200), new SwimingPool(500)});
                Team team = new Team("Dreamteam", new Competitor[]{new Teammate("Fire bird"), new Cat ("Teammate2"), new Bird("Teammate3")});
                c.go(team);
                team.showResults();

        System.out.println("Championship completed. Welcome again!");
            }

        }