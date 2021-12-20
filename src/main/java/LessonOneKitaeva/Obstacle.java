package LessonOneKitaeva;

public class Obstacle {
    String name ;
    int energy;

    public Obstacle(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }
}
