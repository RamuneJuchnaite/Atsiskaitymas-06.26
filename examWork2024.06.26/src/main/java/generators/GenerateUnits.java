package generators;

import java.util.Random;

public class GenerateUnits {

    public static String generateRandomEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "user" + randomInt + "@mail.com";


    }

    public static String generateRandomPassword() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100000);
        return "user" + randomInt + "!";

    }

    public static String generateRandomBirthday() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return ""; //randomGenerator(randomInt(2005,2025), randomInt(1,12),randomInt(1,28))
        //(String.valueOf(((1950+Math.floor(Math.random()*60)/1+Math.floor(Math.random()*28)/1+Math.floor(Math.random()*11))));

    }
}


