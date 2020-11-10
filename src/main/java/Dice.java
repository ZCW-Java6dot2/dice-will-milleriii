import java.util.Random;
public class Dice {
    private Integer rolled;

    public Dice(Integer rolled) {
        this.rolled = rolled;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        Random roll = new Random();
        for (int i = 0; i < rolled; i++){
            sum += roll.nextInt(6)+1;
        }
        return sum;
    }
}
