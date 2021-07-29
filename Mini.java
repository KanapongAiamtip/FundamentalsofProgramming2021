//import java.util.Scanner;
public class Mini
{
    public static void main(String[] args)
    {
    //    Scanner in =  new Scanner(System.in);
  /*      int i =1 ,j=-1;
        switch (i) {
            case 0: case 1: j =1; break;
            case 2:  j =2; break;
            default: j =0;
        }
  //      System.out.println(j);

      boolean b1 = true;
      boolean b2 = false;
      boolean b3 = true;
      if (b1 && b2 || b2 && b3 || b2)
      //  System.out.print("ok");
      if(b1 && b2 || b2 && b3 || b2 || b1)
        //System.out.print("dokey"); */


/*        String str1  = "Java";
        String str2 = "Java programing";
        String str3 = "program";
        char c = '_';
        String s1 = str1+str3;
        String s2 = str1+"c";
        String s3 = str1+c;
        String s4 = s1+s3;
        System.out.println(s2);
        System.out.println(s4);*/
        int x , y=15;
        if (y<=15)
          if (y>0)
            x = 5 * y;
          else
            x = 2*y;
        else
           x =3 *y;
        System.out.println(x);







      /*  int x =3, j=1;
        switch (x) {
          case 1: j++;
          case 2: j++;
          case 3: j++;
          case 4: j++;
          case 5: j++;
          default: j++;
        }
        System.out.println("value ="+(j+x));*/
      /*  while (true)
        {
          String solution = in.nextLine();
          if (!solution.equals("correct"))
          {
            System.out.println("Where there’s a will, there’s a way");
            System.out.println("Upload Solution Again");
          }
          else
          {
            System.out.println("You are very good at that.");
            System.out.println("You outdid yourself today");
            System.out.println("You’re doing a good job");
            System.out.println("You are really learning a lot");
            System.out.println("I knew you could do it!");
            break;
          }
        }*/
    /*  String p = Codee.getProblem()
      do
      {
        String solution = student.applyProgrammingSkill(to: p)
        String result = codee.upload(solution)
      } while (!result.correct)*/


      let problem = Codee.getProblem()
       do {
           let solution = People.applyProgrammingSkill(to: problem)
           let result = Codee.upload(solution)
       } while (!result.correct)
    }
}
