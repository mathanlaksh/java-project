 public class Calculator extends advCalculator {
   
    public int addOp(int n1,int n2){
        int res = n1+n2;
        return res;
    }
    public double addOp(double n1,double n2){      
      double result = n1 + n2;
        System.out.println("n1, n2 are"+ result);
        return result;
    }
    public int subOp(int n1, int n2){
        int res=n1-n2;
        return res;
    }
}