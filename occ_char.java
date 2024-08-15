import java.util.*;
class occ_char
{public static void main(String[]args)
 {Scanner sc=new Scanner(System.in);
  int spaces=0,consonants=0,vowels=0;
  System.out.print("enter string:");
  String s=sc.nextLine();
  for(int i=0;i<s.length();i++)
  {switch(s.charAt(i))
   {case 'a':vowels++;break;
    case 'A':vowels++;break;
    case 'e':vowels++;break;
    case 'E':vowels++;break;
    case 'i':vowels++;break;
    case 'I':vowels++;break;
    case 'o':vowels++;break;
    case 'O':vowels++;break;
    case 'u':vowels++;break;
    case 'U':vowels++;break;
    case ' ':spaces++;break;
    default:consonants++;
   }
  }
 System.out.println("spaces:"+spaces);
 System.out.println("vowels:"+vowels);
 System.out.println("consonants:"+consonants);
 sc.close();
 }
}