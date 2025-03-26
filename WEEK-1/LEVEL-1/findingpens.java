/*5) Suppose you have to divide 14 pens among 3 students
equally. Write a program to find how many pens each
student will get if the pens must be divided equally.
Also, find the remaining non-distributed pens*/
public class findingpens {
    public static void main(String args[]) {
        int total_pens = 14;
        int no_of_people = 3;
        int to_divide_equally = total_pens / no_of_people; 
        int remaining = total_pens % no_of_people;       

        System.out.println("The Pen Per Student is " + to_divide_equally + 
                           " and the remaining pen not distributed is " + remaining);
    }
}

