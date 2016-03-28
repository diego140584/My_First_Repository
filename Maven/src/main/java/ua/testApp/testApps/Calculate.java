
package ua.testApp.testApps;

import java.util.Scanner;


public class Calculate {
    private int result = 0;

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calculate calculate = (Calculate) o;

        if (result != calculate.result) return false;
        if (num != calculate.num) return false;
        if (action != null ? !action.equals(calculate.action) : calculate.action != null) return false;
        return scanner != null ? scanner.equals(calculate.scanner) : calculate.scanner == null;

    }

    @Override
    public int hashCode() {
        int result1 = result;
        result1 = 31 * result1 + num;
        result1 = 31 * result1 + (action != null ? action.hashCode() : 0);
        result1 = 31 * result1 + (scanner != null ? scanner.hashCode() : 0);
        return result1;
    }

    private int num = 0;
    String action = "no";


    Scanner scanner = new Scanner(System.in);

    public Calculate() {
    }

    public int addresult(int... result) {


      /*  do {
            System.out.println("Select an Action:\n1-Summ.\n2-Subtraction.\n3-Multiplication.\n4-Division.");
            num = Integer.parseInt(scanner.next());
            switch (num) {
                case 1:
                    for (int sum : result)
                        this.result += sum;
                    break;
                case 2:
                    for (int sum : result)
                        this.result -= sum;
                    break;
                case 3:
                    this.result = 1;
                    for (int sum : result)
                        this.result *= sum;
                    break;
                case 4:
                    this.result = 1;
                    for (int sum : result)
                        this.result /= sum;
                    break;
            }
            getResult();
            resetResult();
            System.out.println("yes-repeat, no-end");
            action = scanner.next();
        }
        while (!action.equals("no"));*/
        int summ = 0;
        for (int val : result) {
            summ += val;
        }
        return summ;
    }

    public void getResult() {
        System.out.println(result);
    }

    public int getDivision(int... result) {
        int summ = 0;
        for (int val : result) {
            summ -= val;
        }
        return summ;
    }


    public void resetResult() {
        result = 0;
        num = 0;
    }
}



