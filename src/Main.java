public class Main
{
    public static void main(String[] args)
    {
        int birthMonth = 45;

        System.out.println("What is your birth month?");

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}