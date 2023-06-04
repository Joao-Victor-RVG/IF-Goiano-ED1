//Exercicio Pilha


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String[] text = ("ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG").split(" ");

        for (String s : text) {
            stack.push(s);
        }


        Stack<String> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            String str = stack.pop();
            StringBuilder reversedStr = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr.append(str.charAt(i));
            }
            reversedStack.push(reversedStr.toString());
        }


        System.out.println("As strings invertidas são:");
        while (!reversedStack.isEmpty()) {
            System.out.print(reversedStack.pop() + " ");
        }
    }
}