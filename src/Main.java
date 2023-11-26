import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int accountOld = 100; // Начальный счет у клиента
        float addedMoney = 1100; // Пополнение счета
        float bonus; // бонус
        if (addedMoney > 1000) {
            bonus = addedMoney / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус " + bonus);

        float accountNew = accountOld + addedMoney + bonus; // Конечный счет после пополнения и бонусов

        System.out.println("Итоговый счет " + accountNew);
    }
}