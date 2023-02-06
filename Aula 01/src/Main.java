public class Main {
    public static void main(String[] args) {
        divisaot objDivisao = new divisaot();

        objDivisao.iDividendo = 4;
        objDivisao.iDivisor = 2;

        objDivisao.iQuociente = objDivisao.iDividendo / objDivisao.iDivisor;
        objDivisao.iResto = objDivisao.iDividendo % objDivisao.iDivisor;

        System.out.println("O valor do dividendo é: "+objDivisao.iDividendo);
        System.out.println("O valor do divisor é: "+objDivisao.iDivisor);
        System.out.println("O valor do Quociente é: "+objDivisao.iQuociente);
        System.out.println("O valor do Resto é: "+objDivisao.iResto);
    }
}