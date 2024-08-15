import java.util.*;
import java.io.IOException;
public class temp
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases =in.nextInt();
        int[] c=new int[testCases];
        int k=0;
        ArrayList<Character> al=new ArrayList<Character>();
        while(k<testCases){
            String pattern = in.nextLine();
              //Write your code
              for(int i=0;i<pattern.length();i++){
                  char a=pattern.charAt(i);
                  if((a=='(')||(a==')')||(a=='[')||(a==']')||(a=='{')||(a=='}')){
                      al.add(a);
                  }
                  else
                  continue;
              }
              int lp=Collections.frequency(al, '(');
              int rp=Collections.frequency(al, ')');
              int ls=Collections.frequency(al, '[');
               int rs=Collections.frequency(al, ']');
               int lb=Collections.frequency(al, '{');
               int rb=Collections.frequency(al, '}');
               if((lp==rp)&&(ls==rs)&&(lb==rb)){
                 c[k]=1;
               }
               else
               c[k]=0;
               al.clear();
               k++;
            }
            for(int i=0;i<c.length;i++)
            System.out.println(c[i]);
            for(int i=0;i<c.length;i++)
            {
                if(c[i]==1)
                System.out.println("Valid");
                else
                System.out.println("Invalid");
            }
        }
    }

