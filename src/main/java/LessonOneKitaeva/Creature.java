package LessonOneKitaeva;

    public abstract class Creature implements Competitor {
        String type;
        String name;

        int maximumRun;
        int maximumSwim;

        boolean onDistance;

        @Override
        public boolean isOnDistance() {
            return onDistance;
        }

        public Creature(String type, String name, int maximumRun, int maximumSwim) {
            this.type = type;
            this.name = name;
            this.maximumRun = maximumRun;
            this.maximumSwim = maximumSwim;
            this.onDistance = true;
        }

        @Override
        public void run(int dist) {
            if (dist <= maximumRun) {
                System.out.println(type + " " + name + " runs very good! It is victory!");
            } else {
                System.out.println(type + " " + name + " runs not very good. Need to train harder!");
                onDistance = false;
            }
        }


        @Override
        public void swim(int dist) {
            if (maximumSwim == 0) {
                System.out.println(type + " " + name + " can't swim at all.");
                onDistance = false;
                return;
            }
            if (dist <= maximumSwim) {
                System.out.println(type + " " + name + " swims like a fish! Perfect!");
            } else {
                System.out.println(type + " " + name + "can't swim.");
                onDistance = false;
            }
        }

        @Override
        public void info() {
            System.out.println(type + " " + name + " - " + onDistance);
        }
    }
