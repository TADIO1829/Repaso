import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.awt.dnd.DropTarget;
import java.awt.event.*;
import java.awt.im.InputContext;
import java.awt.im.InputMethodRequests;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.beans.BeanProperty;
import java.beans.PropertyChangeListener;
import java.beans.Transient;
import java.beans.VetoableChangeListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.EventListener;
import java.util.Locale;
import java.util.Set;

public class form1 {
    public JTextField nombretxt;
    public JButton aceptarBtn;
    public JPanel mainPanel;
    public JPasswordField contrasenaTxt;
    String usuario="TADIO";
    String clave="2004";
    String intento;
    String clave1;


    public form1() {
        aceptarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intento.equals(usuario) && clave1.equals(clave)){

                    JFrame jf = new JFrame("pe");
                    jf.setContentPane(new form2().menu2);
                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jf.setSize(800, 600);
                    jf.setPreferredSize(new Dimension(800, 600));
                    jf.setMinimumSize(new Dimension(800, 600));
                    jf.pack();
                    jf.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(aceptarBtn)).dispose();
                }
            }
        });
        nombretxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intento=nombretxt.getText();

            }
        });
        contrasenaTxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               clave1=contrasenaTxt.getText();


            }
        });
    }
}
