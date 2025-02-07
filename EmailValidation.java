import java.util.*;
public class EmailValidation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        boolean dot = false;
        boolean at = false;
        int atCount = 0;
        int dotCount = 0;


        // condition to check  the email starts with  @, .
        if(email.charAt(0) == '@' || email.charAt(0) == '.' )
        {
            System.out.println("It's Not a valid Email Id");
            return;
        }



        //iterate Each Character of the Email
        if(email.contains("gmail") && email.contains("@") && email.contains(".")&& email.contains("com")){
            for(int i = 0; i < email.length(); i++){

                //dot comes before || more than one times of @ or .
                if((dot == true && at == false) || atCount > 1 || dotCount > 1 ) {
                    System.out.println("It's Not a valid Email Id");
                    return;
                }

                //increment of @
                if(email.charAt(i) == '@'){
                    at = true;
                    atCount++;
                }

                //increment of .
                if(email.charAt(i) == '.'){
                    dot = true;
                    dotCount++;

                }
            }
        System.out.println("It is Valid EmailId");
        }else{
        System.out.println("It is Not Valid EmailId");

        }



        sc.close();
    }
}
