import java.awt.*;
import java.awt.event.*;
class mouse extends Frame implements MouseListener
{Label l;
  mouse()
 {addMouseListener(this);
  l=new Label();
  l.setBounds(20,50,100,20);
  add(l);
  setSize(300,300);
  setLayout(null);
  setVisible(true);
 }
public void mouseClicked(MouseEvent e)
{l.setText("mouse clicked");}
public void mousePressed(MouseEvent e)
{l.setText("mouse pressed");}
public void mouseReleased(MouseEvent e)
{l.setText("mouse released");}
public void mouseEntered(MouseEvent e)
{l.setText("mouse entered");}
public void mouseExited(MouseEvent e)
{l.setText("mouse exited");}
public static void main(String[]args)
{new mouse();}
}
   