public class Simulation {
        private Integer numberOfDies;
        private Integer numberOfTosses;

        public Simulation(Integer numberOfDies, Integer numberOfTosses){


        }

        public static void main(String[] args){
            Simulation sim = new Simulation(2, 10000);
            sim.runSimulation();
            sim.printResults();
    }

        public void runSimulation(){
            Dice crapsDice = new Dice(numberOfDies);
            for(int i = 0; i < numberOfTosses; i++){

            }
        }

        public void printResults(){

        }



}
