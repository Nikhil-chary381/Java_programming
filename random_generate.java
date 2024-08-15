

import java.util.Random;
//import java.util.*;
public class random_generate
{public static void main(String[] args){
    Random r=new Random();
    for(int i=0;i<5;i++)
    {
    int random=r.nextInt(100)+50;
    System.out.println(random);


}


}


}