public class Object{
public static void main(String[] args) {

    Calculator cal = new Calculator();
    int r1 = cal.addOp(3,4);
    double r2 = cal.addOp(7.25,8.25);
    int r3  = cal.multOp(5,25);
    int r4 = cal.divOp(88,8);
    double r5 = cal.power(4.0,2.0);
    System.out.println("res-add:" + r1 + "\n" + "res2_add" + r2+ " res_3-mult " + r3);
    System.out.println("res 4 : "+ r4);
    System.out.println("res 5: "+ r5);
}
    
}
