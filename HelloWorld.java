import java.applet.Applet;
import java.awt.Graphics;


class HelloWorld extends Applet 
{
	
	public void paint(Graphics g) 
	{
		g.drawString("Hello World", 20, 20);
	}
	
}
/*
<html>
<applet code="HelloWorld.class" width=200 height=100>
</applet>
</html>
*/