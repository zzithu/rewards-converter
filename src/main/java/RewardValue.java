

/*
 * This class is responsible for the conversion of miles to a cash value, and from a cash value to miles.
 * 
 */
public class RewardValue {
    //You can have more significance (Like this), or force them to round up to the next mile 
    double miles;
    double cashValue;

    /*
     * Constructors
     */
    public RewardValue(Double cashValue){
        this.cashValue = Double.parseDouble(cashValue);
        this.miles = cashValue / .0035;
    }
    
    
    //Pay PER mile, so whole number
    public RewardValue(int miles)
    {
        this.miles = miles;
        this.cashValue = miles * .0035;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return miles;
    }
}
