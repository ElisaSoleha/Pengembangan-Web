import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

class Bangun extends JPanel {

    private boolean isNight = true;
    private boolean isRaining = false;
    private boolean isBuildingAnimationInProgress = true;
    private int buildingProgress = 0;

    public Bangun() {
        // Mengatur timer untuk mengatur animasi
        Timer animationTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isBuildingAnimationInProgress) {
                    if (buildingProgress < 100) {
                        buildingProgress += 10;
                    } else {
                        stopBuildingAnimation();
                    }
                    repaint();
                }
            }
        });
        animationTimer.start();

        // Timer untuk mengatur perubahan malam menjadi siang
        Timer dayNightTimer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleDayNight();
                repaint();
            }
        });
        dayNightTimer.start();

        // Timer untuk mengatur hujan
        Timer rainTimer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleRain();
                repaint();
            }
        });
        rainTimer.start();
    }

    // Metode untuk mengganti status hujan
    private void toggleRain() {
        isRaining = !isRaining;
    }

    // Metode untuk mengganti status malam/siang
    private void toggleDayNight() {
        isNight = !isNight;
    }

    private void stopBuildingAnimation() {
        isBuildingAnimationInProgress = false;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D Dua = (Graphics2D)g;
        // Implementasi gambar seperti sebelumnya
        if (isBuildingAnimationInProgress) {
            // Hitung posisi bangunan berdasarkan kemajuan pembangunan
            int buildingX = 200 + buildingProgress;
            int buildingWidth = 200 - buildingProgress;

            // Langit
            Dua.setColor(Color.black);
            Dua.fillRect(0, 0, 800, 500);

            // Matahari Terbit
            Dua.setColor(new Color(255, 165, 0));
            Dua.fillOval(50, 50, 100, 100);

            // Bangunan
            Dua.setColor(new Color(25, 25, 70));
            Dua.fillRect(buildingX, 200, buildingWidth, 200);
        }
        if (isNight) {
            // Langit Malam
            GradientPaint LangitMalam = new GradientPaint(0, 0, Color.black, 0, 150, new Color(125, 25, 200));
            Shape Langit = new Rectangle2D.Double(0, 0, 800, 500);
            Dua.draw(Langit);
            Dua.setPaint(LangitMalam);
            Dua.fill(Langit);
        } else {
            // Langit Siang
            GradientPaint LangitSiang = new GradientPaint(0, 0, new Color(173, 216, 230), 0, 150, new Color(135, 206, 250));
            Shape Langit = new Rectangle2D.Double(0, 0, 800, 500);
            Dua.draw(Langit);
            Dua.setPaint(LangitSiang);
            Dua.fill(Langit);
        }
        if (isBuildingAnimationInProgress) {
            // Langit
            Dua.setColor(Color.black);
            Dua.fillRect(0, 0, 800, 500);

            // Matahari Terbit
            Dua.setColor(new Color(255, 165, 0));
            Dua.fillOval(50, 50, 100, 100);

            // Bangunan
            Dua.setColor(new Color(25, 25, 70));
            Dua.fillRect(200, 200, 200, 200);

            // Hentikan animasi setelah selesai membuat bangunan
            stopBuildingAnimation();
        }

        
        //bulan
        Dua.setColor(new Color(243, 241,251));
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
        Shape MarkaEmpat = new Rectangle2D.Double(225, 445,50, 10);
        Shape MarkaLima = new Rectangle2D.Double(300, 445, 50,10);
        Shape MarkaEnam = new Rectangle2D.Double(375, 445, 50, 10);
        Shape MarkaTujuh = new Rectangle2D.Double(450, 445, 50, 10);
        Shape MarkaDelapan = new Rectangle2D.Double(525, 445, 50, 10);
        Shape MarkaSembilan = new Rectangle2D.Double(600, 445,50, 10);
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

        if (isRaining) {
            for (int i = 0; i < 100; i++) {
                int x = (int) (Math.random() * 800);
                int y = (int) (Math.random() * 500);
                Dua.setColor(Color.blue);
                Dua.drawLine(x, y, x, y + 5);
            }
        }
    
        
        //Bangunan Belakang Jalan
        Shape Bangunan = new Rectangle2D.Double(30, 170, 20, 230);
        Shape Bangunan1 = new Rectangle2D.Double(50, 120,35, 240);
        Shape Bangunan2 = new Rectangle2D.Double(90, 160, 60, 250);
        Shape Bangunan3= new Rectangle2D.Double(180, 150, 40, 250);
        Shape Bangunan4 = new Rectangle2D.Double(270, 150, 40, 310);
        Shape Bangunan5= new Rectangle2D.Double(330, 90, 50, 250);
        Shape Bangunan6 = new Rectangle2D.Double(420, 150, 40, 240);
        Shape Bangunan7 = new Rectangle2D.Double(495, 160, 40, 260);
        Shape Bangunan8 = new Rectangle2D.Double(565,140, 60, 280);
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
        Shape Belakang1 = new Rectangle2D.Double(40, 205,20, 195);
        Shape Belakang2 = new Rectangle2D.Double(60, 185, 40, 215);
        Shape Belakang3= new Rectangle2D.Double(160, 175, 30, 220);
        Shape Belakang4 = new Rectangle2D.Double(220, 130, 50, 220);
        Shape Belakang5= new Rectangle2D.Double(290, 160, 60, 240);
        Shape Belakang6 = new Rectangle2D.Double(365, 160, 50, 240);
        Shape Belakang7 = new Rectangle2D.Double(435, 170, 65, 230);
        Shape Belakang8 = new Rectangle2D.Double(470,260, 60, 140);
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
        Shape BelakangDua1 = new Rectangle2D.Double(50, 275,40, 125);
        Shape BelakangDua2 = new Rectangle2D.Double(90, 300, 60, 100);
        Shape BelakangDua3= new Rectangle2D.Double(150, 160, 40, 240);
        Shape BelakangDua4 = new Rectangle2D.Double(190, 275, 50, 125);
        Shape BelakangDua5= new Rectangle2D.Double(240, 220, 90, 180);
        Shape BelakangDua6 = new Rectangle2D.Double(330, 330, 20, 70);
        Shape BelakangDua7 = new Rectangle2D.Double(350, 190, 60, 210);
        Shape BelakangDua8 = new Rectangle2D.Double(410,210, 30, 190);
        Shape BelakangDua9 = new Rectangle2D.Double(410, 230, 40, 270);
        Shape BelakangDua10 = new Rectangle2D.Double(440, 180, 700, 220);
        Shape BelakangDua11 = new Rectangle2D.Double(510, 260,25, 140);
        Shape BelakangDua12 = new Rectangle2D.Double(535, 120, 35, 280);
        Shape BelakangDua13= new Rectangle2D.Double(570, 300, 90, 100);
        Shape BelakangDua14 = new Rectangle2D.Double(660, 240, 40, 160);
        Shape BelakangDua15= new Rectangle2D.Double(700, 270, 60, 130);        
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
        Shape AtapG = new Polygon(new int[] {170, 170, 125}, new int[] {200, 220, 220}, 3);
        Dua.setColor(new Color(184, 134, 11));
        Dua.fill(BangunanDepan);
        Dua.fill(AtapG);
        Shape KacaGe = new Rectangle2D.Double(90, 230, 20, 160);
        Shape KacaGe1 = new Rectangle2D.Double(115, 230, 20, 160);
        Shape KacaGe2 = new Rectangle2D.Double(140, 230, 20, 160);
        Dua.setColor(new Color(255, 250, 205));
        Dua.fill(KacaGe);
        Dua.fill(KacaGe1);
        Dua.fill(KacaGe2);
        
        //Bagunan Depan
        Shape BangunanDepan2 = new Rectangle2D.Double(30, 285, 75, 115);
        Dua.setColor(new Color(139, 105, 105));
        Dua.fill(BangunanDepan2);
        Shape KacaDe = new Rectangle.Double(40, 295, 20, 20);
        Shape KacaDe1 = new Rectangle.Double(40, 320, 20, 20);
        Shape KacaDe2 = new Rectangle.Double(40, 345, 20, 20);
        Shape KacaDe3 = new Rectangle.Double(40, 370, 20, 20);
        Dua.setColor(new Color(112, 128, 144));
        Dua.fill(KacaDe);
        Dua.fill(KacaDe1);
        Dua.fill(KacaDe2);
        Dua.fill(KacaDe3);
        
        Shape KacaDep = new Rectangle2D.Double(70, 295, 20, 20);
        Shape KacaDep1 = new Rectangle2D.Double(70, 320, 20, 20);
        Shape KacaDep2 = new Rectangle2D.Double(70, 345, 20, 20);
        Shape KacaDep3 = new Rectangle2D.Double(70, 370, 20, 20);
        Dua.setColor(new Color(255, 250, 205));
        Dua.fill(KacaDep);
        Dua.fill(KacaDep1);
        Dua.fill(KacaDep2);
        Dua.fill(KacaDep3);
        
        //3
        Shape GedungDepan3 = new Rectangle2D.Double(165, 240, 90, 160);
        Dua.setColor(new Color(32, 178, 170));
        Dua.fill(GedungDepan3);
        Shape KacaDepan = new Rectangle2D.Double(175, 250, 30, 20);
        Shape KacaDepan1 = new Rectangle2D.Double(175, 280, 30, 20);
        Shape KacaDepan2 = new Rectangle2D.Double(175, 310, 30, 20);
        //805
        Shape KacaDepan3 = new Rectangle2D.Double(175, 340, 30,20);
        Shape KacaDepan4 = new Rectangle2D.Double(215, 250, 30, 20);
        Shape KacaDepan5 = new Rectangle2D.Double(215, 280, 30, 20);
        Shape KacaDepan6 = new Rectangle2D.Double(215, 310, 30,20);
        Shape KacaDepan7 = new Rectangle2D.Double(215, 340, 30, 20);
        Dua.setColor(new Color(255, 250, 205));
        Dua.fill(KacaDepan);
        Dua.fill(KacaDepan1);
        Dua.fill(KacaDepan2);
        Dua.fill(KacaDepan3);
        Dua.fill(KacaDepan4);
        Dua.fill(KacaDepan5);
        Dua.fill(KacaDepan6);
        Dua.fill(KacaDepan7);
        
        //4
        Shape Bangunan4a = new Rectangle2D.Double(350, 160, 50,240);
        Shape Bangunan4b = new Rectangle2D.Double(400, 220, 50, 180);
        Dua.setColor(new Color(189, 183, 107));
        Dua.fill(Bangunan4a);
        Dua.fill(Bangunan4b);
        Shape p = new Polygon(new int[] {350, 350, 400}, new int[]{130, 160, 160 },3);
        Shape pg = new Polygon(new int[] {450, 450, 400}, new int[] {190, 220, 220}, 3);
        Dua.fill(p);
        Dua.fill(pg);
        
        Shape Kacab41 = new Rectangle2D.Double(360, 170, 10, 220);
        Shape Kacab42 = new Rectangle2D.Double(380, 170, 10, 220);
        Shape Kacab43 = new Rectangle2D.Double(410, 230, 10, 160);
        Shape Kacab44 = new Rectangle2D.Double(430, 230, 10, 160);
//        Shape Kacab45 = new Rectangle2D.Double();
//        Shape Kacab46 = new Rectangle2D.Double();
        Dua.setColor(new Color(238, 233, 233));
        Dua.fill(Kacab41);
        Dua.fill(Kacab42);
        Dua.fill(Kacab43);
        Dua.fill(Kacab44);
        
        Shape BangunanToko = new Rectangle2D.Double(640, 350, 140, 50);
        Shape AtapbToko = new Rectangle2D.Double(640, 330, 140, 70);
        Dua.setColor(new Color(139, 71, 38));
        Dua.fill(BangunanToko);
        Dua.fill(AtapbToko);
        Shape k = new Rectangle2D.Double();
        Shape k1 = new Rectangle2D.Double();
        Shape k2 = new Rectangle2D.Double();
        Shape k3 = new Rectangle2D.Double();
        
        Dua.setColor(new Color(205, 85, 85));
        Dua.fill(k);
        Dua.fill(k1);
        Dua.fill(k2);
        Dua.fill(k3);
        
        Shape u = new Rectangle2D.Double();
        Shape u1 = new Rectangle2D.Double();
        Shape u2 = new Rectangle2D.Double();
        Shape p1 = new Polygon(new int[]{640, 640, 620}, new int[] {340, 350, 350}, 3);
        Shape p2 = new Polygon(new int[] {780, 780, 800}, new int[] {340, 350, 350}, 3);
        Shape pintu = new Rectangle2D.Double(700, 370, 20, 30);
        Dua.setColor(Color.white);
        Dua.fill(u);
        Dua.fill(u1);
        Dua.fill(u2);
        Dua.fill(p1);
        Dua.fill(p2);
        Dua.fill(pintu);
        
        //Bangunan5
        Shape BangunanDepan5 = new Rectangle2D.Double(255, 190, 60, 210);
        Dua.setColor(new Color(46, 139, 37));
        Dua.fill(BangunanDepan5);
        Shape Kacab51 = new Rectangle2D.Double(265, 200, 40, 20);
        Shape Kacab52 = new Rectangle2D.Double(265, 230, 40, 20);
        Shape Kacab53 = new Rectangle2D.Double(265, 260, 40, 20);
        Shape Kacab54 = new Rectangle2D.Double(265, 290, 40, 20);
        Shape Kacab55 = new Rectangle2D.Double(265, 320, 40, 20);
        Dua.setColor(new Color(253, 245, 230));
        Dua.fill(Kacab51);
        Dua.fill(Kacab52);
        Dua.fill(Kacab53);
        Dua.fill(Kacab54);
        Dua.fill(Kacab55);
        
        
        //Bangunan6
        Shape BangunanDepan6 = new Rectangle2D.Double(525, 180, 70, 220);
        Dua.setColor(new Color(135, 206, 235));
        Dua.fill(BangunanDepan6);
        Shape Kacab61 = new Rectangle2D.Double(535, 190, 10, 200);
        Shape Kacab62 = new Rectangle2D.Double(555, 190, 10, 200);
        Shape Kacab63 = new Rectangle2D.Double(575, 190,10, 200);
        Dua.setColor(new Color(253, 245, 230));
        Dua.fill(Kacab61);
        Dua.fill(Kacab62);
        Dua.fill(Kacab63);
        
        //Bangunan7
        Shape BangunanDepan7 = new Rectangle2D.Double(440, 240, 90, 160);
        Dua.setColor(new Color(154, 205, 50));
        Dua.fill(BangunanDepan7);
        Shape Kacab71 = new Rectangle2D.Double(450, 250, 30, 20);
        Shape Kacab72 = new Rectangle2D.Double(450, 280, 30, 20);
        Shape Kacab73 = new Rectangle2D.Double(450, 310, 30, 20);
        Shape Kacab74 = new Rectangle2D.Double(450, 340, 30, 20);
        Shape Kacab75 = new Rectangle2D.Double(490, 350, 30, 20);
        Shape Kacab76 = new Rectangle2D.Double(490, 280, 30, 20);
        Shape Kacab77 = new Rectangle2D.Double(490, 310, 30, 20);
        Shape Kacab78 = new Rectangle2D.Double(490, 340, 30, 20);
        Dua.setColor(new Color(255, 250, 205));
        Dua.fill(Kacab71);
        Dua.fill(Kacab72);
        Dua.fill(Kacab73);
        Dua.fill(Kacab74);
        Dua.fill(Kacab75);
        Dua.fill(Kacab76);
        Dua.fill(Kacab77);
        Dua.fill(Kacab78);
        
        //bl
        Dua.setColor(Color.black);
        Font huruf = new Font ("Chiller", Font.BOLD, 15);
        Dua.setFont(huruf);
        Dua.drawString("Bal", 15, 480);
        
        // ...
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("GambarBangunan");
                Bangun gambar = new Bangun();
                frame.getContentPane().add(gambar);
                frame.pack();
                frame.setSize(new Dimension(800, 500));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
