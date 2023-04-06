package ss4_lop_va_doi_tuong;

public class QuadraticEquation {
    public double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.a = b;
        this.a = c;
    }
    public double getDiscrimiant(){
        return Math.pow(this.b,2) - 4 * this .a * this.c;
    }
    public double getRoot1() {
        return (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
    }
}
