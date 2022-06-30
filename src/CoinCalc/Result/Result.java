package CoinCalc.Result;

public class Result {
  private String valueType;
  private double value;

  public Result(double value,String valueType) {
      this.valueType = valueType;
      this.value = value;
  }

      public String getResult(){
      return  valueType + value;
  }

}

