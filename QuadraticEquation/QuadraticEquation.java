package QuadraticEquation;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;
    public QuadraticEquation(){}
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double setA(double newA){
        return this.a = newA;
    }
    public double setB(double newB){
        return this.b = newB;
    }
    public double setC(double newC){
        return this.c = newC;
    }
    public double getDelta() {
        return this.b*this.b - 4*this.a*this.c;
    }
    public void getRoot(){
        if(getDelta()<0) {
            System.out.println("PT vo nghiem");
        } else if(getDelta()==0) {
            System.out.println("PT nghiem kep " + getDoubleRoot());
        } else {
            System.out.println("PT co 2 nghiem phan biet: x1=" + getRoot1() + " x2=" + getRoot2());
        }
    }
    public double getDoubleRoot() {
        return -this.b/(2*this.a);
    }
    public double getRoot1() {
        return (-this.b - Math.sqrt(getDelta())/(2*this.a));
    }
    public double getRoot2() {
        return (-this.b + Math.sqrt(getDelta())/(2*this.a));
    }
    public String display(){
        return this.a+"a + " + this.b + "b + " + this.c + "= 0";
    }
}
