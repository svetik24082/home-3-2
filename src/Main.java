import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 23;
        if (age >= 18) {
            System.out.println("поздравляем с совершенолетием");
        } else {
            System.out.println("Возраст совершенолетия еще не наступил, нужно подождать");
        }


        System.out.println(" задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Человек закончил университет и ему пора искать работу");
        }
            System.out.println(" задание 3");
            int capacity = 120;
            int seating = 60;  // сидячие места
            int standingPlaces = capacity - seating; // стоячие места
            int occupiedBySedentary = 55; // зан сид
            int occupiedStanding = 50;  // зан ст
            if (occupiedBySedentary < seating ) {
                System.out.println("Осталось еще " + (seating - occupiedBySedentary)  + " сидячих мест ");
            } else {
                System.out.println(" Сидячих мест нет");
            }
            if (occupiedStanding < standingPlaces) {
                System.out.println("Осталось еще  " + (standingPlaces - occupiedStanding) + " стоячих мест ");
            } else {
                System.out.println(" Стоячих мест нет");


        }

    }

}