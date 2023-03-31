public class Main {

    public static void main(String[] args) {
        //Step one -Надає значення 4 полям типу int
        int a = 15, b = 8, c = 23, d = 42;

        //step two -  Сумує їх попарно.
        int sum1 = a + b;
        int sum2 = c + d;

        //step three - Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println(sum1 > sum2);

        //Step four - Збільшує першу суму на 1.
        sum1++;

        //Step five - Другу суму зменшує на 2.
        sum2 -= 2;

        //step six - Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println(sum1 > sum2);

        //Step seven - Виводить true якщо хоча б одна сума кратна 2, інакше - false.
        System.out.println((sum1 % 2 == 0) || (sum2 % 2 == 0));
    }

}
