package LessonOneKitaeva;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dreamteam:");

        Teammate teammate1 = new Teammate("Leopold",110);

        System.out.println(teammate1);

        Teammate teammate2 = new Teammate("Matilda", 100);

        System.out.println(teammate2);
 
        Teammate teammate3 = new Teammate("Katrin",90);

        System.out.println(teammate3);

        Teammate teammate4 = new Teammate("Samuel", 60);

        System.out.println(teammate4);


        System.out.println("To overcome the obstacle need energy:");

        Obstacle Obstacle1 = new Obstacle("Sweeming pool", 60);

        System.out.println(Obstacle1);

        Obstacle Obstacle2 = new Obstacle("Jumping", 20);

        System.out.println(Obstacle2);

        Obstacle Obstacle3 = new Obstacle("Jugging", 20);

        System.out.println(Obstacle3);
        }
    }