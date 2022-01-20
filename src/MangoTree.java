import java.util.Scanner;

public class MangoTree
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row,column,treeNumber;
        row=sc.nextInt();
        column=sc.nextInt();
        treeNumber=sc.nextInt();
        if(treeNumber%row==1 || treeNumber%row==0 || treeNumber<row || treeNumber>row*column-row)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
