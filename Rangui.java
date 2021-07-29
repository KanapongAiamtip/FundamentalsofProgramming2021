import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Rangui extends JFrame implements ActionListener
{
    JLabel hint;
    JLabel name;
    JButton a;
    int times = 5;
    java.util.List<String> ShowHint = Test();
    java.util.List<String> ShowName = Test2();
    public Rangui()
    {
        setTitle("Random");
        setSize(1100, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 220);
        setLayout(new GridLayout(2, 2));

        hint = new JLabel("Welcome To CSIT 64");
        getContentPane().add(hint);

        name = new JLabel("Welcome Faculty of Science");
        getContentPane().add(name);

        a = new JButton("Press To Show Wish!");
        a.setActionCommand("do");
        a.addActionListener(this);
        getContentPane().add(a);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton swap = (JButton)e.getSource();
        Random rand = new Random();

        if (swap.getActionCommand().equals("do"))
        {
            if (ShowHint.size() == 0)
            {
              hint.setText("Program Wirtten By  Soda");
              name.setText("End");
            }
            else
            {  
              int showtimeran = rand.nextInt(times);
              int checkname = rand.nextInt(times);
              //if(hint.setText(ShowHint.get(showtimeran)))
              //{
                
              //}
              System.out.println(showtimeran);
              hint.setText(ShowHint.get(showtimeran));
              ShowHint.remove(showtimeran);
              name.setText((ShowName.get(checkname)));
              ShowName.remove(checkname);
              times--;
              System.out.println(ShowHint.size());
            }
    
        }
    }

    private static LinkedList<String> Test()
    {
      String [] hint = new String [3];
      hint[0] = "Loopx";
      hint[1] = "While True";
      hint[2] = "www.codee.club";
      java.util.LinkedList<String> meassge = new LinkedList<String>(Arrays.asList(hint));
      return meassge;
    }

    private static LinkedList<String> Test2()
    {
      String [] name = new String [3];
      name[0] = "Charb";
      name[1] = "Mark";
      name[2] = "Heart";

      java.util.LinkedList<String> p = new LinkedList<String>(Arrays.asList(name));
      return p;
        
    }



    public static void main(String [] args)
    {
        Rangui meassge = new Rangui();
        meassge.setVisible(true);
    }

}