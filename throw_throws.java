class age_restriction extends Exception
{age_restriction(String s)
 {System.out.println(s);}
}

class throw_throws
{public void vote(int age) throws age_restriction
 {if(age<18)
  {throw new age_restriction("you are minor");}
  else
  {System.out.println("you can vote");}
  }
 public static void main(String[]args)
 {throw_throws t=new throw_throws();
  try{ t.vote(20);}
  catch(Exception e)
  {System.out.println(e);}
 }
}


  