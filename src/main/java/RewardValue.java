public class RewardValue {
    double cash;
    RewardValue(double cash){
        this.cash = cash;
    }
    double getCashValue(){
        return  cash;
    }
    double getMilesValue(){
        return  cash*0.0035;
    }
}

// cash = miles*0.0035