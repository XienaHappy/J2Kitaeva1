package LessonOneKitaeva;

public class Teammate {
    String name ;
    int energy;

    public Teammate(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Teammate{" +
                "name='" + name + '\'' +
                ", power=" + energy +
                '}';
    }
}
