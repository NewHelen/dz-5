import java.util.Scanner;

public class Main {
    static public void main(String[] argv) {

        // 1. Надає значення 4 полям типу int
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int intVal1 = scanner.nextInt();
        System.out.print("Enter second value: ");
        int intVal2 = scanner.nextInt();
        System.out.print("Enter third value: ");
        int intVal3 = scanner.nextInt();
        System.out.print("Enter fourth value: ");
        int intVal4 = scanner.nextInt();

        //2. Сумує їх попарно
        int sum1 = intVal1 + intVal2;
        int sum2 = intVal3 + intVal4;

        //3. Виводить результат порівняння (true якщо перша сума менша)
        boolean equalVal1 = sum1 < sum2;
        System.out.println( "результат порівняння сум: " + sum1 +  " < " + sum2 + ": " + equalVal1);

        // 4. Збільшує першу суму на 1
        sum1++;

        //5. Другу суму зменшує на 2
        int sum2Minus2 = sum2 -2;

        //6. Виводить результат порівняння сум (true, якщо перша сума більша)
        boolean equalVal2 = sum1 > sum2Minus2;
        System.out.println( "результат порівняння сум після змін: " + sum1 +  " > " + sum2Minus2 + ": " + equalVal2);

        //7. Виводить true якщо хоча б одна сума кратна 2, інакше - false
        if (sum1 % 2 ==0 || sum2Minus2 % 2 ==0 ) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}

