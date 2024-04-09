import ru.netology.services.EarnServiceClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EarnServiceClassTest {
    @Test
    public void shouldCalculateMoneyMonths1() {
      EarnServiceClass service = new EarnServiceClass();
        int income = 10000; // месячный доход
        int expenses = 3000; // ежемесячные обязательные траты
        int threshold = 20000; // сумма, при которой можно отдохнуть
        int expected = 3;

        int actual = service.calculate(income, expenses);

        Assertions.assertEquals(expected, actual, threshold);
    }

    @Test
    public void shouldCalculateMoneyMonths2() {
        EarnServiceClass service = new EarnServiceClass();
        int income = 100000; // месячный доход
        int expenses = 60000; // ежемесячные обязательные траты
        int threshold = 150000; // сумма, при которой можно отдохнуть
        int expected = 2;

        int actual = service.calculate(income, expenses);

        Assertions.assertEquals(expected, actual, threshold);
    }


}



