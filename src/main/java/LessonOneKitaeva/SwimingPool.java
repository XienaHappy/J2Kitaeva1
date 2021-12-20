package LessonOneKitaeva;

    public class SwimingPool extends Barrier {
        int length;

        public SwimingPool(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.swim(length);
        }
    }

