// to check if a list of integers contains only odd numbers
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class odds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer>list=new ArrayList<>();
        System.out.println("Enter the number:");
        int no=sc.nextInt();
        System.out.println("Enter: "+ no + " integers");
        for(int i=0;i<no;i++)
        {
            list.add(sc.nextInt());
        }

        boolean result=onlyOddNumber(list);
        if(result){
            System.out.println("The list contains only odd number");
        }else{
            System.out.println("The list does not contain onl odd number");
        }

    }

    public static boolean onlyOddNumber(List<Integer>list){
        for(int i : list){
            if(i % 2 == 0)
                return false;
        }
        return true;
    }
}
