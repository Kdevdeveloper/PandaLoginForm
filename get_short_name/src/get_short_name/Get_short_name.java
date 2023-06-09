package get_short_name;
import java.util.*;
public class Get_short_name 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String fn,mn,ln;//input
        String FirstName,MiddleName,LastName,ShortName="";//sub string
        System.out.println("Enter the First Name :=>  ");
        fn = sc.nextLine();
        System.out.println("Enter the Middle Name :=>  ");
        mn = sc.nextLine();
        System.out.println("Enter the Last Name :=>  ");
        ln = sc.nextLine();
        FirstName = fn.substring(0,1);
        MiddleName = mn.substring(0,1);
        LastName = ln;
        ShortName = ShortName.concat(FirstName);
        ShortName = ShortName.concat(".");
        ShortName = ShortName.concat(MiddleName);
        ShortName = ShortName.concat(".");
        ShortName = ShortName.concat(LastName);
        System.out.println("Short Name is: "+ShortName);
    }
}
    