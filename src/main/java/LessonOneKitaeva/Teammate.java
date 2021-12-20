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
            this.maximumRun = 1000;
            this.maximumSwim = 200;
            this.active = true;
        }

        @Override
        public void run(int dist) {
            if (dist <= maximumRun) {
                System.out.println(name + " runs very good! Winner!");
            } else {
                System.out.println(name + " runs not very good. Try next time(");
                active = false;
            }
        }


        @Override
        public void swim(int dist) {
            if (dist <= maximumSwim) {
                System.out.println(name + " swims very good! Champion!");
            } else {
                System.out.println(name + " swims not very good. Try next time(");
                active = false;
            }
        }

        @Override
        public void info() {
            System.out.println(name + " - " + active);
        }
    }
