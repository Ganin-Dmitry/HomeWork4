public class Main {
    public static void main(String[] args) {
        /// Задание №1.
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        /// Задание №2.
        int temperature = 9;
        if (temperature >= 5){
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }

        /// Задание №3.
        int speed = 59;
        if (speed >= 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        /// Задание №4.
        int ageNew = 45;
        if (ageNew >= 2 && ageNew <= 6) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в детский сад.");
        }
        if (ageNew >= 7 && ageNew <= 17) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в школу.");
        }
        if (ageNew >= 18 && ageNew <= 24) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в университет.");
        }
        if (ageNew >= 25) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить на работу.");
        }

        /// Задание №5.
        int secondAgeNew = 13;
        if (secondAgeNew < 5) {
            System.out.println("Если возраст ребенка равен " + secondAgeNew + ", то ему нельзя кататься на аттракционе.");
        }
        if (secondAgeNew >= 5 && secondAgeNew < 14) {
            System.out.println("Если возраст ребенка равен " + secondAgeNew + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (secondAgeNew >= 14) {
            System.out.println("Если возраст ребенка равен " + secondAgeNew + ", то ему можно кататься на аттракционе без сопровождения взрослого)");
        }

        /// Задание №6.
        int place = 16;
        if (place <= 102) {
            if (place <= 60) {
                int seating = 60 - place;
                System.out.println("В вагоне осталось " + seating + " сидячих мест.");
            } else {
                int standingPlaces = 102 - place;
                System.out.println("В вагоне осталось " + standingPlaces + " стоящих мест.");
            }
        } else {
            System.out.println("В вагоне не осталось мест.");
        }

        /// Задание №7.
        int one = 42;
        int two = 75;
        int three = 15;
        if (one > two){
            if (one > three){
                System.out.println("Первое число всех больше.");
            } else {
                System.out.println("Третье число всех больше.");
            }
        } else {
            if (two > three){
                System.out.println("Второе число всех больше.");
            } else {
                System.out.println("Третье число всех больше.");
            }
        }
    }
}