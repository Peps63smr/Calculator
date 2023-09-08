import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // calc.println.accept(c); не будет работать так как деление на 0 математически не возможно,
        // BinaryOperator<Integer> devide = (x, y) -> (y != 0) ? (x / y) : 0;
        // Этот код проверяет, равен ли знаменатель нулю, и если это так, то возвращает ноль, иначе возвращает результат деления.
        // один из вариантов решения проблемы, при делении на 0 вернуть 0.
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);

    }
}