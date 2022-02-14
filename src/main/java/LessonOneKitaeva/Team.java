package LessonOneKitaeva;

    public class Team {

        protected String name;
        protected String color;
        protected String logo;
        protected Competitor[] teammates;

        public Team(String name,String color,String logo, Competitor... teammates){
            this.name = name;
            this.color = color;
            this.logo = logo;
            this.teammates = teammates;
        }

        public String getName(){
            return new String(this.name);
        }
        public String getColor(){
            return new String (this.color);
        }
        public String logo () {
            return new String (this.logo);
        }

        public void teamInfo() {
            System.out.println("The name of the team is:" + name + ", the color of the uniform is:"+ color + ", the logo of the team is: "+ logo );
        }

        public Competitor[] getTeammates(){
            return teammates.clone();
        }

        public void showSuccessfulResults(){
            for(Competitor c:this.teammates){
                if(c.isOnDistance())
                    c.info();
            }
        }

        public void showResults(){
            for(Competitor c:this.teammates){
                c.info();
            }
        }
    }

