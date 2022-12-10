public class Main {
    public static void main(String[] args) {

        //System.out.println("Привет, Натали!");

        /*int my_number = 5;
        double second_number;
        System.out.println("My number is "+ my_number);

        second_number = 22.5;
        System.out.println("My number is "+ my_number);

        String my_string = "My first string";
        System.out.println(my_string.toLowerCase());
        System.out.println(my_string.toUpperCase());
        System.out.println(my_string.charAt(0));
        System.out.println(my_string.length());*/
        //int a = 10;
       // int b = 3;
       /* System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);*/
       /* System.out.println(++a);
        System.out.println(--b);

        System.out.println(a++);
        System.out.println(b--);

        System.out.println(a);
        System.out.println(b);*/
       /* >
        <
        >=
        <=

        == сравнивает равны ли два значания
        != сравнивает что значения не равны */

       /* System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b); */

        int age = 17;
        if (age>=18) {
            System.out.println("Ты взрослый");
        } else {
            System.out.println("Ты ребенок");
        }


        int WeekDay = 1;
        if(WeekDay == 10) {
            System.out.println("Monday!");

            switch (WeekDay) {
                case  1:
                    System.out.println("Monday!");
                    break;
                case  2:
                    System.out.println("Вторник!");
                    break;
                case  3:
                    System.out.println("Среда!");
                    break;
                case  4:
                    System.out.println("Четверг!");
                    break;
                case  5:
                    System.out.println("Пятница!");
                    break;
                case  6:
                    System.out.println("Суббота!");
                    break;
                case  7:
                    System.out.println("Воскресенье!");
                    break;
                default:
                    System.out.println("No such day");
            }
        }


    }
}