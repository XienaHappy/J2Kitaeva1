package LessonOneKitaeva;

        public class Championship {
            protected Barrier[] barriers;

            public Championship(Barrier... barriers){
                this.barriers = barriers;
            }

            public void go(Team team){
                for (Competitor c : team.getTeammates()) {
                    for (Barrier o : barriers) {
                        o.doIt(c);
                        if (!c.isOnDistance())
                            break;
                    }
                }
            }
        }

