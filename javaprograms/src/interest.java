public class interest {
    float principal;
    float rateofinterest;
    float timeperiod;

    interest(float amount, float rate, float period) {
        principal = amount;
        rateofinterest = rate;
        timeperiod = period;
    }

    public float savinginterest(float principal, float rateofinterest, float timeperiod) {
        float amount = (principal * rateofinterest * timeperiod) / (12 * 100);
        return principal+amount;
    }
        public float fdinterest ( float principal, float rateofinterest, float timeperiod){
            float fdamount = ((principal * (1 + (rateofinterest / 25))) *(4 * timeperiod));
            return (principal + fdamount);
        }

}
