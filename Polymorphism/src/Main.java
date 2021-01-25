

    class  Movie{
        private String name;

        public Movie(String name){
            this.name = name;
        }

        public String plot(){
            return "Not Listed";
        }

        public String getName() {
            return name;
        }
    }



    class Jaws extends Movie{
        public Jaws(){
            super("Jaws");
        }

        @Override
        public String plot() {
            return "we're gonna need a bigger boat";
        }
    }
    class IndependenceDay extends Movie{
        public IndependenceDay(){
            super("Independence Day");
        }

        @Override
        public String plot() {
            return "Aliens invade Earth";
        }
    }

    class Oscar extends Movie{
        public Oscar(){
            super("Oscar");
        }

        @Override
        public String plot() {
            return "Snaps tries to go straight";
        }
    }
    class Forgettable extends Movie {
        public Forgettable() {
            super("Forgettable");
        }
    }




    public class Main {

        public static void main(String[] args) {
            for (int a = 0; a < 10; a++) {
                Movie movie = randomMovie();
                System.out.println("Movie #" + a + " Named : " + movie.getName() + " Plot: " + movie.plot());
            }
        }

        public static Movie randomMovie() {
            int randomNumber = (int) (Math.random() * 4) + 1;
            System.out.println("Number = " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new Oscar();
                case 4:
                    return new Forgettable();
            }
            return null;
        }
    }
