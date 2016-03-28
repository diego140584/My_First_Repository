
import java.applet.Applet;
import java.awt.*;

<applet code="MainApplet"width=300height=50>
        </applet>

public class MainApplet extends Applet {

    String msg;

    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.RED);
        msg = "In init() --";
    }

    public void start() {
        msg += "In start() --";
    }

    public void pain(Graphics g) {
        msg += "In paint().";
        g.drawString(msg, 10, 30);
    }

}
