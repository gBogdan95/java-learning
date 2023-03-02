///Class Complex with constructor for real and imaginary part of complex number.
///Methods to calculate module, display number, calculate sum and display how many complex numbers were printed.
///Class ClientComplex with main method for testing.
public class Complex {
    double re;
    double im;
    private static int counter=0;

    Complex(double a, double b){
        re = a;
        im = b;
    }

    public void module(){
        double x;
        x = this.re * this.re + this.im*this.im;
        Math.sqrt(x);
        System.out.println("Module is: " + x);
    }

    public void display(){
        System.out.println(this.re + " + " + this.im + " * i");
        counter++;
    }

    public void add(Complex z){
        double new_re;
        double new_im;
        new_re = this.re + z.re;
        new_im = this.im + z.im;
        System.out.println(new_re + " + " + new_im + " * i");
        counter++;
    }

    public static void getCounter(){
        System.out.println(counter + " complex numbers printed");
    }
}


class ClientComplex {

    public static void main(String args[]){
        Complex z1 = new Complex(5,10);
        Complex z2 = new Complex(20,10);
        Complex z3 = new Complex(50,25);
        z2.display();
        z1.display();
        z1.module();
        z2.module();
        z1.add(z2);
        z2.add(z3);
        Complex.getCounter();
    }
}

