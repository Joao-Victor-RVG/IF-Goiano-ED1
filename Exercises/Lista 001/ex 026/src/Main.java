import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int data,dia,mes,ano,ndata;

        System.out.println("Digite data no formato dd/mm/aa:");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();

        dia = data / 10000;

        mes = data % 10000 / 100;

        ano = data % 100;

        ndata = mes * 10000 + dia  * 100 + ano;

        System.out.println("Dia " + dia);
        System.out.println("Mes " + mes);
        System.out.println("Ano " + ano);
        System.out.println("DATA NO FORMATO MMDDAA: " + ndata);


    }
}