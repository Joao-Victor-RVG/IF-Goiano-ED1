import java.util.*;

public class RandomStacks {
    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(9) + 1;
            randomNumbers.add(number);
        }


        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();


        for (int number : randomNumbers) {
            if (number >= 1 && number <= 3) {
                stack1.push(number);
            } else if (number >= 4 && number <= 6) {
                stack2.push(number);
            } else if (number >= 7 && number <= 9) {
                stack3.push(number);
            }
        }


        for (int i = 0; i < 100; i++) {
            int randomSelection = random.nextInt(3) + 1;
            Stack<Integer> sourceStack;
            Stack<Integer> destinationStack;
            String sourceStackName;
            String destinationStackName;


            if (randomSelection == 1) {
                sourceStack = stack2;
                destinationStack = stack1;
                sourceStackName = "Stack 2";
                destinationStackName = "Stack 1";
            } else if (randomSelection == 2) {
                sourceStack = stack3;
                destinationStack = stack2;
                sourceStackName = "Stack 3";
                destinationStackName = "Stack 2";
            } else {
                sourceStack = stack1;
                destinationStack = stack3;
                sourceStackName = "Stack 1";
                destinationStackName = "Stack 3";
            }

            if (!sourceStack.isEmpty()) {
                int movedNumber = sourceStack.pop();
                destinationStack.push(movedNumber);
                System.out.println("Moving number " + movedNumber + " from " +
                        sourceStackName + " to " + destinationStackName);
            }


            if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
                System.out.println("\nThe program has terminated because one of the stacks became empty.");
                break;
            }


            if (i == 99) {
                System.out.println("\nThe program has terminated after processing a total of 100 random numbers.");
            }
        }


        System.out.println("\nStack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
        System.out.println("Stack 3: " + stack3);
    }
}
