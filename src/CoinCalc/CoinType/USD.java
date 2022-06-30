package CoinCalc.CoinType;
import CoinCalc.Coin;
import java.io.Serializable;

public class USD extends Coin implements Serializable {

    private final double value = 3.52;

    @Override
    public double getValue(double value){
        return value;
    }
    @Override
    public double calculate(double input){
        return input * getValue(value);
    }
}
