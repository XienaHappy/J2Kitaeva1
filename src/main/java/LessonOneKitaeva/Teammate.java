package LessonOneKitaeva;

    public class Teammate implements Competitor {
        String name;

        int maximumRun;
        int maximumSwim;

        boolean active;

        @Override
        public boolean isOnDistance() {
            return active;
        }

        public Teammate(String name) {
            this.name = name;
            this.maximumRun = 150;
            this.maximumSwim = 300;
            this.active = true;
        }

        @Override
        public void run(int dist) {
            if (dist <= maximumRun) {
                System.out.println(name + " runs very fast! Good result!");
            } else {
                System.out.println(name + " runs quite slow. Nice try, but it loose(");
                active = false;
            }
        }


        @Override
        public void swim(int dist) {
            if (dist <= maximumSwim) {
                System.out.println(name + " swims perfect! It is the best result!");
            } else {
                System.out.println(name + " swims rather poor. Try next time(");
                active = false;
            }
        }

        @Override
        public void info() {
            System.out.println(name + " - " + active);
        }
    }
