public class Main {
    public static void main(String[] args) {

        // Задание 2

        int chek = 450; // Текущий счет клиента
        int replenishment = 2250; // Сумма пополнения счета
        int bonusRuble = 100; // Кол-во рублей для 1 бонусного рубля

        if (replenishment > 1000) {
            int finalChek = replenishment / bonusRuble + chek; // Итоговый счет клиента
            System.out.println("Решение задания 2:");
            System.out.println("Итоговый счет клиента: " + finalChek);
        } else {
            System.out.println("Решение задания 2:");
            System.out.println("Сумма недостаточна для начисления бонусов!");
        }

    }
}