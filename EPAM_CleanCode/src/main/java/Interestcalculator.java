import java.lang.Math;

public class Interestcalculator {
    public float simpleInterest(float p, float r,float t){
    	float interest = p*r*t/100;
        return interest;
    }
    public float compoundInterest(float p, float r,float t)  {
        float totalAmount = (float) (p * Math.pow(1 + (r/100),t));
        float interest = totalAmount - p;
        return interest;
    }
}
