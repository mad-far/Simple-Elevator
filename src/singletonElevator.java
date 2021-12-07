public class singletonElevator {
    private Integer number;
    private static singletonElevator instance;
       private singletonElevator(int inputnum) {
            this.number = inputnum;
        }

        public void setNumber(int inputnum) {
            this.number = inputnum;
        }

        public int getNumber() {
            return this.number;
        }
    public static singletonElevator getInstance(int inputnum) {
        
        if(instance == null){
            instance = new singletonElevator(inputnum);
        }
        return instance;
    }
}
