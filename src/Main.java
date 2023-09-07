public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // calc.println.accept(c); не будет работать так как деление на 0 математически не возможно,
        // какое бы не было первое число при делении на 0 всегда даёт результат 0.
        // один из вариантов решения проблемы, сообщить пользователю что данное выражение не возможно.
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}