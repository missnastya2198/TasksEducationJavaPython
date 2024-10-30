public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber re1 = (ComplexNumber) o;
        return re == re1.re && im == re1.im;
    }

    @Override
    public int hashCode() {
        return (int) (re + im);
    }
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        //ComplexNumber c = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println("a.hashCode():"+a.hashCode()+" b.hashCode():"+b.hashCode());

    }
}