package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int f = number %10;
        int n = number /10;

        int f1 = n %10;
        int n1 = n /10;

        int f2 = n1 %10;
     


        System.out.println(f+""+f1+""+f2);

    }
}
