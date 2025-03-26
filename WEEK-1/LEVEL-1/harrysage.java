/*1) Write a program to find the age of Harry if the birth year is
2000. Assume the Current Year is 2024*/
public class harrysage
{
    public static void main(String args[])
    {
        String name = "Harry's";
        int birth_year = 2000;
        int current_year = 2025;
        int current_age = current_year - birth_year;
        
        System.out.println(name + " age in " + current_year + " is " + current_age);
    }
}
