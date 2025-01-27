import java.util.Scanner;
import java.util.Arrays;
public class anagrams
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first string:");
        String str1=sc.nextLine();
        System.out.println("Enter your second string:");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length())
        {
            System.out.println("they are not anagrams");
        }
        else
        {
            char array1[]=str1.toCharArray();
            char array2[]=str2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            if(Arrays.equals(array1,array2))
            {
                System.out.println(str1+" and "+str2+ "     both are anagrams");
            }
            else
            {
                System.out.println("they are not anagrams");
            }
        }
    }
}
