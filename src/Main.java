public class Main {
    public static void main(String[] args) {
        int startingBalance = 100;
        int paymentAmount = 300;
        int bonus;
        if (paymentAmount > 1000){
            bonus = (paymentAmount / 100);
        } else {
            bonus = 0;}

        int totalBalance = startingBalance + paymentAmount + bonus;
        System.out.println("Итоговый счет " +totalBalance+ "руб.");
        System.out.println("Бонусные рубли " + bonus);

    }
}

