public class App {
    static Complexe n = new Complexe(1,1);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! \n le module de n = "+ n.module()
                            +"\nl'argument est ="+ n.argument());
        n.affiche();
    }
}
class Complexe
{
    public double a;
    double b;

    Complexe(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    double module()
    {
        return Math.sqrt((a*a) + (b*b));
    }
    double argument() { return Math.round((Math.acos(a/ module()))*180/Math.PI); }
    void affiche() { System.out.println(a + " + " + b + "i"); }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}