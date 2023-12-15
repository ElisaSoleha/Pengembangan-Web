// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class AnimasiRumah extends JPanel implements ActionListener {
//     private int x = 50; // Koordinat X untuk rumah
//     private Timer timer;

//     public AnimasiRumah() {
//         timer = new Timer(10, this); // Membuat timer dengan delay 10ms
//         timer.start();
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // Menggambar rumah
//         g.setColor(Color.RED);
//         g.fillRect(x, 150, 100, 100); // Bangunan rumah
//         g.setColor(Color.BLUE);
//         g.fillRect(x + 10, 100, 80, 50); // Atap rumah
//         g.setColor(Color.YELLOW);
//         g.fillRect(x + 35, 175, 30, 75); // Pintu

//         // Gambar matahari
//         g.setColor(Color.YELLOW);
//         g.fillOval(300, 50, 50, 50);

//         // Gambar pohon
//         g.setColor(Color.GREEN);
//         g.fillRect(200, 200, 20, 100); // Batang pohon
//         g.setColor(Color.GREEN);
//         g.fillOval(175, 175, 70, 70); // Daun pohon
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // Memindahkan rumah ke kanan
//         x += 1;
//         if (x > 400) {
//             x = -100; // Reset posisi rumah jika sudah melewati batas kanan
//         }
//         repaint();
//     }

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Animasi Rumah");
//         AnimasiRumah animasi = new AnimasiRumah();
//         frame.add(animasi);
//         frame.setSize(500, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//     }
// }



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.*;

class GambarBangunan extends JPanel implements ActionListener {
    private Timer timer;

    public GambarBangunan() {
        timer = new Timer(10, this); // Membuat timer dengan delay 10ms
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint(); // Pembaruan dilakukan setiap kali timer mencapai delay-nya
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D Dua = (Graphics2D) g;

        //Langit Malam
        GradientPaint LangitMalam = new GradientPaint(0, 0, Color.black, 0, 150, new Color(125, 25, 202));
        Shape Langit = new Rectangle2D.Double(0, 0, 800, 500);
        Dua.setPaint(LangitMalam);
        Dua.fill(Langit);

        //bulan
        Dua.setColor(new Color(243, 241, 271));
        Dua.fillOval(15, 20, 50, 50);

        //awan
        Dua.setColor(new Color(25, 25, 70));
        Dua.fillOval(15, 20, 50, 50);
        Dua.fillOval(24, 40, 40, 30);
        Dua.fillOval(50, 40, 40, 30);

        //biintang
        Dua.setColor(Color.white);
        Dua.fillOval(100, 80, 4, 4);
        Dua.fillOval(153, 23, 4, 4);
        Dua.fillOval(290, 67, 4, 4);
        Dua.fillOval(769, 67, 4, 4);
        Dua.fillOval(646, 74, 4, 4);
        Dua.fillOval(342, 45, 4, 4);
        Dua.fillOval(456, 32, 4, 4);
        Dua.fillOval(233, 21, 4, 4);
        Dua.fillOval(431, 56, 4, 4);
        Dua.fillOval(710, 34, 4, 4);
        Dua.fillOval(651, 66, 4, 4);
        Dua.fillOval(560, 22, 4, 4);
        Dua.fillOval(134, 44, 4, 4);

        //Jalan
        Shape jalan = new Rectangle2D.Double(0, 400, 800, 100);
        Dua.setColor(new Color(112, 128, 144));
        Dua.fill(jalan);

        //marka Jalan
        Shape MarkaSatu = new Rectangle2D.Double(0, 445, 50, 10);
        Shape MarkaDua = new Rectangle2D.Double(75, 445, 50, 10);
        Shape MarkaTiga = new Rectangle2D.Double(150, 445, 50, 10);
        Shape MarkaEmpat = new Rectangle2D.Double(225, 445, 50, 10);
        Shape MarkaLima = new Rectangle2D.Double(300, 445, 50, 10);
        Shape MarkaEnam = new Rectangle2D.Double(375, 445, 50, 10);
        Shape MarkaTujuh = new Rectangle2D.Double(450, 445, 50, 10);
        Shape MarkaDelapan = new Rectangle2D.Double(525, 445, 50, 10);
        Shape MarkaSembilan = new Rectangle2D.Double(600, 445, 50, 10);
        Shape Marka10 = new Rectangle2D.Double(675, 445, 50, 10);

        Dua.setColor(Color.white);
        Dua.fill(MarkaSatu);
        Dua.fill(MarkaDua);
        Dua.fill(MarkaTiga);
        Dua.fill(MarkaEmpat);
        Dua.fill(MarkaLima);
        Dua.fill(MarkaEnam);
        Dua.fill(MarkaTujuh);
        Dua.fill(MarkaDelapan);
        Dua.fill(MarkaSembilan);
        Dua.fill(Marka10);

        //Bangunan Belakang Jalan
        Shape Bangunan = new Rectangle2D.Double(30, 170, 20, 230);
        Shape Bangunan1 = new Rectangle2D.Double(50, 120, 35, 240);
        Shape Bangunan2 = new Rectangle2D.Double(90, 160, 60, 250);
        Shape Bangunan3 = new Rectangle2D.Double(180, 150, 40, 250);
        Shape Bangunan4 = new Rectangle2D.Double(270, 150, 40, 310);
        Shape Bangunan5 = new Rectangle2D.Double(330, 90, 50, 250);
        Shape Bangunan6 = new Rectangle2D.Double(420, 150, 40, 240);
        Shape Bangunan7 = new Rectangle2D.Double(495, 160, 40, 260);
        Shape Bangunan8 = new Rectangle2D.Double(565, 140, 60, 280);
        Shape Bangunan9 = new Rectangle2D.Double(720, 170, 20, 230);
        Shape Bangunan10 = new Rectangle2D.Double(795, 180, 20, 230);
        Dua.setColor(new Color(25, 25, 70));
        Dua.fill(Bangunan);
        Dua.fill(Bangunan1);
        Dua.fill(Bangunan2);
        Dua.fill(Bangunan3);
        Dua.fill(Bangunan4);
        Dua.fill(Bangunan5);
        Dua.fill(Bangunan6);
        Dua.fill(Bangunan7);
        Dua.fill(Bangunan8);
        Dua.fill(Bangunan9);
        Dua.fill(Bangunan10);

        //Belakang
        Shape Belakang = new Rectangle2D.Double(10, 165, 30, 235);
        Shape Belakang1 = new Rectangle2D.Double(40, 205, 20, 195);
        Shape Belakang2 = new Rectangle2D.Double(60, 185, 40, 215);
        Shape Belakang3 = new Rectangle2D.Double(160, 175, 30, 220);
        Shape Belakang4 = new Rectangle2D.Double(220, 130, 

50, 220);
        Shape Belakang5 = new Rectangle2D.Double(290, 160, 60, 240);
        Shape Belakang6 = new Rectangle2D.Double(365, 160, 50, 240);
        Shape Belakang7 = new Rectangle2D.Double(435, 170, 65, 230);
        Shape Belakang8 = new Rectangle2D.Double(470, 260, 60, 140);
        Shape Belakang9 = new Rectangle2D.Double(630, 230, 40, 270);
        Shape Belakang10 = new Rectangle2D.Double(670, 160, 50, 240);
        Dua.setColor(new Color(25, 30, 45));
        Dua.fill(Belakang);
        Dua.fill(Belakang1);
        Dua.fill(Belakang2);
        Dua.fill(Belakang3);
        Dua.fill(Belakang4);
        Dua.fill(Belakang5);
        Dua.fill(Belakang6);
        Dua.fill(Belakang7);
        Dua.fill(Belakang8);
        Dua.fill(Belakang9);
        Dua.fill(Belakang10);

        // Belakang dua
        Shape BelakangDua = new Rectangle2D.Double(20, 175, 30, 225);
        Shape BelakangDua1 = new Rectangle2D.Double(50, 275, 40, 125);
        Shape BelakangDua2 = new Rectangle2D.Double(90, 300, 60, 100);
        Shape BelakangDua3 = new Rectangle2D.Double(150, 160, 40, 240);
        Shape BelakangDua4 = new Rectangle2D.Double(190, 275, 50, 125);
        Shape BelakangDua5 = new Rectangle2D.Double(240, 220, 90, 180);
        Shape BelakangDua6 = new Rectangle2D.Double(330, 330, 20, 70);
        Shape BelakangDua7 = new Rectangle2D.Double(350, 190, 60, 210);
        Shape BelakangDua8 = new Rectangle2D.Double(410, 210, 30, 190);
        Shape BelakangDua9 = new Rectangle2D.Double(410, 230, 40, 270);
        Shape BelakangDua10 = new Rectangle2D.Double(440, 180, 700, 220);
        Shape BelakangDua11 = new Rectangle2D.Double(510, 260, 25, 140);
        Shape BelakangDua12 = new Rectangle2D.Double(535, 120, 35, 280);
        Shape BelakangDua13 = new Rectangle2D.Double(570, 300, 90, 100);
        Shape BelakangDua14 = new Rectangle2D.Double(660, 240, 40, 160);
        Shape BelakangDua15 = new Rectangle2D.Double(700, 270, 60, 130);
        Dua.setColor(Color.black);
        Dua.fill(BelakangDua);
        Dua.fill(BelakangDua1);
        Dua.fill(BelakangDua2);
        Dua.fill(BelakangDua3);
        Dua.fill(BelakangDua4);
        Dua.fill(BelakangDua5);
        Dua.fill(BelakangDua6);
        Dua.fill(BelakangDua7);
        Dua.fill(BelakangDua8);
        Dua.fill(BelakangDua9);
        Dua.fill(BelakangDua10);
        Dua.fill(BelakangDua11);
        Dua.fill(BelakangDua12);
        Dua.fill(BelakangDua13);
        Dua.fill(BelakangDua14);
        Dua.fill(BelakangDua15);

        //Bangunan Depan
        //6:40
        Shape BangunanDepan = new Rectangle2D.Double(80, 220, 90, 180);
        Shape AtapG = new Polygon(new int[]{170, 170, 125}, new int[]{200, 220, 220}, 3);
        Dua.setColor(new Color(184, 134, 11));
        Dua.fill(BangunanDepan);
        Dua.fill(AtapG);
        Shape KacaGe = new Rectangle2D.Double(90, 230, 20, 160);
                Shape KacaGe1 = new Rectangle2D.Double(110, 230, 20, 160);
        Shape PintuGe = new Rectangle2D.Double(140, 250, 20, 70);
        Shape PintuGe1 = new Rectangle2D.Double(140, 250, 20, 70);
        Shape Tangga = new Polygon(new int[]{125, 170, 170, 125}, new int[]{220, 220, 240, 240}, 4);

        Dua.setColor(new Color(0, 128, 128));
        Dua.fill(KacaGe);
        Dua.fill(KacaGe1);
        Dua.fill(PintuGe);
        Dua.setColor(new Color(139, 69, 19));
        Dua.fill(PintuGe1);
        Dua.fill(Tangga);

        //Pohon Kiri
        Shape PohonBatang = new Rectangle2D.Double(350, 320, 20, 100);
        Shape PohonDaun = new Rectangle2D.Double(330, 280, 60, 60);

        Dua.setColor(new Color(139, 69, 19));
        Dua.fill(PohonBatang);
        Dua.setColor(new Color(0, 128, 0));
        Dua.fill(PohonDaun);

        //Pohon Kanan
        Shape PohonKananBatang = new Rectangle2D.Double(500, 320, 20, 100);
        Shape PohonKananDaun = new Rectangle2D.Double(480, 280, 60, 60);

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
