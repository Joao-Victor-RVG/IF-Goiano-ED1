public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "4,5,+";
        double expectedResult = 9.0;
        double actualResult = rpc.calc(rpnExpression);
        checkCalc(rpnExpression, expectedResult, actualResult);


        rpnExpression = "8.2,2.1,-";
        expectedResult = 6.1;
        actualResult = rpc.calc(rpnExpression);
        checkCalc(rpnExpression, expectedResult, actualResult);

        rpnExpression = "2.5,11,*";
        expectedResult = 27.5;
        actualResult = rpc.calc(rpnExpression);
        checkCalc(rpnExpression, expectedResult, actualResult);

        rpnExpression = "31.5,5.25,/";
        expectedResult = 6.0;
        actualResult = rpc.calc(rpnExpression);
        checkCalc(rpnExpression, expectedResult, actualResult);

        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calc(rpnExpression);
        checkCalc(rpnExpression, expectedResult, actualResult);
    }

    private static void checkCalc(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        }
        else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
