import java.util.Random;

public class PasswordGenerator {

    PasswordGenerator(){
        System.out.println("Password Lenght not Found");
    };

    PasswordGenerator(int lenght){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "<>,.?/}]{]+_-)(*&^%#@!=";
        String combination = upper + lower + num + specialChars;
        int len = lenght;
        char[] password = new char[len];
        Random r = new Random();
        for(int i = 0; i < len; i++){
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password: " + new String(password));
    }
}
