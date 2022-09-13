public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        // Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        // Установите версию приложения для iOS по ссылке
        // Установите версию приложения для Android по ссылке
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка - устройство не распознао");
        }
        System.out.println();


        System.out.println("Задание 2");
        // Для пользователей с телефоном с 2015 г выпуска нужно вывести обычное предложение об установке приложения
        // Если телефон произведен ранее 2015, то клиенту нужно посоветовать установить облегченную версию приложения
        // Установите облегченную версию приложения для iOS по ссылке
        int clientDeviceYear = 2015;
        clientOS = 1;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ошибка - устройство не распознано");
        }
        System.out.println();


        System.out.println("Задание 3");
        // является ли год високосным или нет
        // високосным является каждый четвертый год, но не является каждый 100. Также високосным является каждый 400 год
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();


        System.out.println("Задание 4");
        // Доставка в пределах 20 км занимает сутки.
        // Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        // Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        int deliveryDistance = 95; //расстояние до клиента
        int deliveryPeriod = 1;
        if (deliveryDistance <= 20) {
            System.out.println("На доставку в пределах " + deliveryDistance + " км потребуется " + deliveryPeriod + " сутки");
        } else if (deliveryDistance <= 60) {
            deliveryPeriod += 1;
            System.out.println("На доставку в пределах " + deliveryDistance + " км потребуется " + deliveryPeriod + " суток");
        } else if (deliveryDistance <= 100) {
            deliveryPeriod += 2;
            System.out.println("На доставку в пределах " + deliveryDistance + " км потребуется " + deliveryPeriod + " суток");
        } else {
            System.out.println("Срок доставки в пределах " + deliveryDistance + " км уточняйте у менеджера");
        }
        System.out.println();


        System.out.println("Задание 5");
        // определяет по номеру месяца в году, к какому сезону этот месяц принадлежит
        // Для написания программы используйте оператор switch
        // Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13)
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас " + monthNumber + " месяц - Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас " + monthNumber + " месяц - Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас " + monthNumber + " месяц - Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас " + monthNumber + " месяц - Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        System.out.println();
        System.out.println("ДЗ5 выполнено");
    }
}