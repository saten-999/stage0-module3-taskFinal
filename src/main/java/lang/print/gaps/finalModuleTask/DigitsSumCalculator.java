package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int f = number %10;
        int n = number /10;

        int f1 = n %10;
        int n1 = n /10;

        int f2 = n1 %10;
        int n2 = n1 /10;

        int f3 = n2 %10;

        System.out.println(f+f1+f2+f3);
     
    }
}
