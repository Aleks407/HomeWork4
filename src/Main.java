import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {

        int age = 17;
        System.out.println("Задача №1 ");
        if (age >= 18) {
            System.out.println("«Если возраст человека равен " + age + ",то он совершеннолетний.» ");
        }
        if (age < 18) {
            System.out.println("«Если возраст человека равен " + age + ",то он не достиг совершеннолетия, " +
                    "нужно немного подождать.» ");
        }

        int temperature = 15;
        System.out.println("Задача №2 ");
        if (temperature <= 10) {
            System.out.println("«На улице " + temperature + " градусов, нужно надеть шапку.»");
        }
        if (temperature > 10) {
            System.out.println("«На улице " + temperature + " градусов, можно идти без шапки.»");
        }
        int speed = 20;
        System.out.println("Задача №3");
        if (speed > 60) {
            System.out.println("«Если скорость " + speed + " то, придется заплатить штраф.»");
        }
        if (speed <= 60) {
            System.out.println("«Если скорость " + speed + " то, можно ездить спокойно.»");
        }
        int ageOfMen = 40;
        System.out.println("Задача №4 ");
        if (ageOfMen >= 2 && ageOfMen <= 6) {
            System.out.println("«Если возраст человека равен "
                    + ageOfMen + " то,ему нужно ходить в детский сад.»");
        }

        if (ageOfMen >= 7 && ageOfMen <= 17) {
            System.out.println("«Если возраст человека равен "
                    + ageOfMen + " то,ему нужно ходить в школу.»");
        }
        if (ageOfMen >= 18 && ageOfMen <= 24) {
            System.out.println("«Если возраст человека равен "
                    + ageOfMen + " то его место в университете.»");
        } else {
            System.out.println("«Если возраст человека равен "
                    + ageOfMen + ", то ему пора ходить на работу.»");
        }
        int ageChildForAttraction = 10;
        System.out.println("Задача №5");
        if (ageChildForAttraction < 5) {
            System.out.println("«Если возраст ребенка равен "
                    + ageChildForAttraction + " то,ему нельзя кататься на аттракционе.» ");


        }
        boolean adult = true;
        if (ageChildForAttraction >= 5 && ageChildForAttraction <= 14 && adult) {
            System.out.println("«Если возраст человека равен "
                    + ageChildForAttraction + " то, можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("«Если возраст человека равен "
                    + ageChildForAttraction + " то, можно кататься на аттракционе без сопровождения взрослого.»");


        }
        int numberOfPassengers = 105;
        System.out.println("Задача №6");
        if (numberOfPassengers <= 60) {
            System.out.println("«В вагоне есть сидячие места.» ");
        }

        if (numberOfPassengers >= 60 && numberOfPassengers <= 102) {
            System.out.println("«В вагоне есть только стоячие места.» ");
        } else {
            System.out.println("«В вагоне мест нет.» ");
        }
        int one = 80000;
        int two = 55005;
        int three = 10000;
        System.out.println("Задача №7");

        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two> one && two > three) {
            System.out.println(two);

        }
        if (three> two && three > one) {
            System.out.println(three);

        }
    }
}


