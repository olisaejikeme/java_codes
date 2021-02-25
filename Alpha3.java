//Basic If Else statement to check the positivity or negativity of a number

public class Alpha3 {
    public static void main(String[] args) {
        int number=109;
        
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
