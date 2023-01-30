package methodOverriding;
class AdvCalc extends Calc {
    public int add(int n1, int n2){
        int res = n1+n2+1;
        return res;
    }

    public int sub(int n1, int n2){
        int res = n1-n2+1;
        return res;
    }
}