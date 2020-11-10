
import org.junit.jupiter.api.Test;


public class DiceTest {

    @Test
    //For Craps
    public void diceCraps(){
        Dice crapsDice = new Dice(2);
        Integer expected = 2;
    }

    @Test
    //For Yatzee
    public void diceYatzee(){
        Dice yatzeeDice = new Dice(5);
        Integer expected = 5;
    }
}
