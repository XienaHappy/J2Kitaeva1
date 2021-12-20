package LessonOneKitaeva;

    public class Run extends Barrier {
        int length;

        public Run(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.run(length);
        }
    }
