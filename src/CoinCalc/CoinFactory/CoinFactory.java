/*

*Factory Pattern says that just define an interface or abstract class
 for creating an object but let the subclasses
 decide which class to instantiate.
 * */

package CoinCalc.CoinFactory;
import CoinCalc.CoinFactory.Coins;
import CoinCalc.CoinType.ILS;
import CoinCalc.CoinType.USD;
import CoinCalc.Coin;

public class CoinFactory {
    public static Coin getCoinInstance(Coins coin){

        switch (coin){
            case ILS :
            return new ILS();


            case USD:
           return new USD();
       }
return null;
    }
}


