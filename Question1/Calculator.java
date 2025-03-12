package Question1;

public class Calculator {

    /**
     * @param a first number
     * @param b second number
     * @return LCM of both the numbers
     * @throws IllegalArgumentException when undesired value is input
     */
    public static int calculateLCM(int a, int b)throws IllegalArgumentException{
        try{
            return (a*b)/calculateHCF(a, b); 
        }catch(IllegalArgumentException e){
            throw e; 
        }
    }

    /**
     * @param a first number
     * @param b second number
     * @return HCF of both the numbers
     * @throws IllegalArgumentException when undesired value is input
     */
    public static int calculateHCF(int a,int b)throws IllegalArgumentException{
        if(a<0||b<0)throw new IllegalArgumentException("Numbers can only be positve Integers");
        if(a==0)return b; 
        return calculateHCF(b%a, a); 
    }
}