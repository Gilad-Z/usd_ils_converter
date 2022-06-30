package CoinCalc;

public abstract class Coin implements ICalculate {


    public abstract double getValue(double value);


    @Override
    public double calculate(double value){
        return value;
    }

    }
