public class Homework26 {

    public static void main(String[] args) {
        //     1
        int current_year = 2022;
        int friend_year = 1993;
        System.out.println("Моему другу " + (current_year-friend_year) + " лет");

        //     2
        int number = 188660414;
        System.out.println("Last digit " + (number%10));

        //     3
        int age = 29;
        if (age>=18 && age<=30) {
            System.out.println("Натали, поздравляю ты разобралась как работает if");
        }

        //     4
        int x = 46;
        int y = 0;
          if (x > 0 && y > 0) {
            System.out.println("Цель находится в I четверти!");}
          if (x < 0 && y > 0) {
            System.out.println("Цель находится в II четверти!");}
          if (x < 0 && y > 0) {
            System.out.println("Цель находится в II четверти!");}
          if (x < 0 && y < 0) {
            System.out.println("Цель находится в III четверти!");}
          if (x > 0 && y < 0) {
            System.out.println("Цель находится в IV четверти!");}
          if (x == 0 && y > 0) {
            System.out.println("Цель находится на оси y!");}
          if (x == 0 && y < 0) {
            System.out.println("Цель находится на оси y!");}
          if (x > 0 && y == 0) {
            System.out.println("Цель находится на оси х!");}
          if (x < 0 && y == 0) {
            System.out.println("Цель находится на оси х!");}

        //     5
        int a = 10;
        int b = 1;
        int c = 15;
        if (a+b>c && b+c>a && a+c>b) {
            System.out.println("Треугольник возможно посторить");}
           else {
            System.out.println("Треугольник посторить невозможно");}






    }
}
