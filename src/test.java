/**
 * Created by sbt-tolmasov-ia on 05.04.2018.
 */
public class test {
    public static void main(String[] args) {
        int a,b,c;
        a=1;
        b=2;
        c=a+b;
        System.out.println("c теперь равно " + c);

        long ci;
        long im;

        im = 5280*120;
        ci = im*im*im;
        System.out.println(ci);

        double x,y,z;
        x=5;
        y=6;
        z= Math.sqrt(x*x+y*y);
        System.out.println(z);

        char cr;
        cr='X';
        System.out.println("этот символ " +cr);
        cr++;
//        cr=90;
        System.out.println("этот символ " +cr);


        boolean d;
        d=false;
        System.out.println("d " +d);
        d=true;
        System.out.println("d " + (d));
        System.out.println("10>9 "+ (9>10));
    }
}
