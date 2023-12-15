import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;

class Rumah extends JPanel implements ActionListener {
    private Timer timer;

    public Rumah() {
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D Dua = (Graphics2D) g;

        // Background
        GradientPaint LangitMalam = new GradientPaint(0, 0, Color.black, 0, 150, new Color(125, 25, 202));
        Shape Langit = new Rectangle2D.Double(0, 0, 800, 500);
        Dua.setPaint(LangitMalam);
        Dua.fill(Langit);

        // ... (rest of your drawing code)

        // Pohon Kiri
        Shape PohonBatang = new Rectangle2D.Double(350, 320, 20, 100);
        Shape PohonDaun = new Ellipse2D.Double(330, 280, 60, 60);

        Dua.setColor(new Color(139, 69, 19));
        Dua.fill(PohonBatang);
        Dua.setColor(new Color(0, 128, 0));
        Dua.fill(PohonDaun);

        // Pohon Kanan
        Shape PohonKananBatang = new Rectangle2D.Double(500, 320, 20, 100);
        Shape PohonKananDaun = new Ellipse2D.Double(480, 280, 60, 60);

        Dua.setColor(new Color(139, 69, 19));
        Dua.fill(PohonKananBatang);
        Dua.setColor(new Color(0, 128, 0));
        Dua.fill(PohonKananDaun);
    }

    public static void main(String[] args) {
        JFrame Frame = new JFrame("Desa di Malam Hari");
        GambarBangunan Desa = new GambarBangunan();

        Frame.add(Desa);
        Frame.setSize(800, 500);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
    }
}

