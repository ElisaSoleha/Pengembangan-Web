
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PerbaikanGui extends JFrame {
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField inputField;
    private JLabel PesanLabel;
    private JTextField outputField; // Menggunakan JTextField sebagai output
    private JButton okeButton;

    private ArrayList<String> daftar = new ArrayList<>();
    private ArrayList<String> daftarBenar = new ArrayList<>();
    private int sekali = 0;

    public PerbaikanGui() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perbaikan Tba");

        jLabel1 = new JLabel("Input");
        jLabel2 = new JLabel("Output");
        jLabel3 = new JLabel("Pesan: ");
        PesanLabel = new JLabel();
        inputField = new JTextField(20);
        outputField = new JTextField(20); // Menggunakan JTextField sebagai output
        okeButton = new JButton("Oke");
        
        okeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(inputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(26, 26, 26)
                    .addComponent(outputField) // Menggunakan JTextField sebagai output
                    .addGap(24, 24, 24))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(PesanLabel)
                    .addContainerGap(400, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(okeButton)
                    .addContainerGap())
        );

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(inputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(outputField)) // Menggunakan JTextField sebagai output
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(PesanLabel))
                    .addGap(20, 20, 20)
                    .addComponent(okeButton)
                    .addContainerGap())
        );
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });
        pack();
    }
    private void jButton1ActionPerformed(ActionEvent evt) {
        String input = inputField.getText();
        // daftar.clear();
        outputField.setText(""); // Menghapus teks dari outputField
        if (sekali == 0 && input.equals("saya") || sekali == 1 && (input.equals("makan") || input.equals("memasak")) || sekali == 2 && input.equals("nasi")) {
            PesanLabel.setText(" Input diterima");
            daftar.add(input);
            daftarBenar.add(input);
            sekali++;
        } 
        // else if(input.equals("saya makan nasi")){
        //     if(!daftar.contains(input)){
        //         PesanLabel.setText("Bahasa tersedia");
        //         daftar.add(input);
        //         daftarBenar.add(input);
        //     }
        //     if(daftarBenar.contains("saya makan nasi")){
        //         PesanLabel.setText("Program Terpenuhi, Selesai");
        //         okeButton.setEnabled(false);
        //     }
        // }
        // else if(input.equals("saya memasak nasi")){
        //     if(!daftar.contains(input)){
        //         PesanLabel.setText("Bahasa tersedia");
        //         daftar.add(input);
        //         daftarBenar.add(input);
        //     }
        //     if(daftarBenar.contains("saya memasak nasi")){
        //         PesanLabel.setText("Program Terpenuhi, Selesai");
        //         okeButton.setEnabled(false);
        //     }
        // }
         else {
            PesanLabel.setText("input tidak diterima");
            inputField.setText("");
        }
        if (sekali == 3) {
            PesanLabel.setText("Final State Berhasil");
            okeButton.setEnabled(false);
        }
        daftarBenar.clear();
        daftarBenar.addAll(daftar);
        inputField.setText(String.join(" ", daftarBenar));
        outputField.setText(String.join(" ", daftarBenar)); // Mengatur teks di outputField
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerbaikanGui().setVisible(true);
            }
        });
    }
}

// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;
// // import java.awt.event.KeyEvent;
// // import java.awt.event.KeyListener;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JLabel scanningLabel;
// //     private JTextField scanningField;
// //     private StringBuilder scanningBuffer;

// //     public PerbaikanGui() {
// //         initComponents();
// //         getContentPane().setBackground(new Color(0, 128, 0)); // Warna latar belakang hijau tua
// //     }

// //     private void initComponents() {
// //         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
// //         setTitle("Perbaikan Tba");

// //         nameLabel = new JLabel("Nama:");
// //         nimLabel = new JLabel("Nim:");
// //         scanningLabel = new JLabel("Scanning Karakter Diterima:");
// //         nameField = new JTextField(20);
// //         nimField = new JTextField(20);
// //         scanningField = new JTextField(20);
// //         scanningField.setEditable(false); // Agar tidak bisa diedit
// //         scanningBuffer = new StringBuilder();

// //         nameField.addKeyListener(new KeyListener() {
// //             @Override
// //             public void keyTyped(KeyEvent e) {
// //                 char inputChar = e.getKeyChar();
// //                 if (Character.isLetterOrDigit(inputChar)) {
// //                     scanningBuffer.append(inputChar);
// //                     scanningField.setText(scanningBuffer.toString());
// //                 }
// //             }

// //             @Override
// //             public void keyPressed(KeyEvent e) {
// //                 // Tidak digunakan
// //             }

// //             @Override
// //             public void keyReleased(KeyEvent e) {
// //                 // Tidak digunakan
// //             }
// //         });

// //         nimField.addKeyListener(new KeyListener() {
// //             @Override
// //             public void keyTyped(KeyEvent e) {
// //                 char inputChar = e.getKeyChar();
// //                 if (Character.isDigit(inputChar)) {
// //                     scanningBuffer.append(inputChar);
// //                     scanningField.setText(scanningBuffer.toString());
// //                 }
// //             }

// //             @Override
// //             public void keyPressed(KeyEvent e) {
// //                 // Tidak digunakan
// //             }

// //             @Override
// //             public void keyReleased(KeyEvent e) {
// //                 // Tidak digunakan
// //             }
// //         });

// //         GroupLayout layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(layout);
// //         layout.setAutoCreateContainerGaps(true);
// //         layout.setAutoCreateGaps(true);

// //         layout.setHorizontalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                         .addComponent(nameLabel)
// //                         .addComponent(nimLabel)
// //                     )
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                         .addComponent(nameField)
// //                         .addComponent(nimField)
// //                     )
// //                     .addComponent(scanningLabel)
// //                     .addComponent(scanningField)
// //                 )
// //         );

// //         layout.setVerticalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                         .addComponent(nameLabel)
// //                         .addComponent(nameField)
// //                         .addComponent(scanningLabel)
// //                         .addComponent(scanningField)
// //                     )
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                         .addComponent(nimLabel)
// //                         .addComponent(nimField)
// //                     )
// //                 )
// //         );

// //         pack();
// //     }

// //     public static void main(String args[]) {
// //         try {
// //             for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
// //                 if ("Nimbus".equals(info.getName())) {
// //                     UIManager.setLookAndFeel(info.getClassName());
// //                     break;
// //                 }
// //             }
// //         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         }

// //         EventQueue.invokeLater(new Runnable() {
// //             public void run() {
// //                 new PerbaikanGui().setVisible(true);
// //             }
// //         });
// //     }
// // }



// // import javax.swing.*;
// // import javax.swing.text.AbstractDocument;
// // import javax.swing.text.AttributeSet;
// // import javax.swing.text.BadLocationException;
// // import javax.swing.text.DocumentFilter;
// // import java.awt.*;
// // import java.awt.event.KeyEvent;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JLabel scanningLabel;
// //     private JTextField scanningField;
// //     private StringBuilder scanningBuffer;

// //     public PerbaikanGui() {
// //         initComponents();
// //         getContentPane().setBackground(new Color(0, 128, 0)); // Warna latar belakang hijau tua
// //     }

// //     private void initComponents() {
// //         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
// //         setTitle("Perbaikan Tba");

// //         nameLabel = new JLabel("Nama:");
// //         nimLabel = new JLabel("Nim:");
// //         scanningLabel = new JLabel("Scanning Karakter Diterima:");
// //         nameField = new JTextField(20);
// //         nimField = new JTextField(20);
// //         scanningField = new JTextField(20);
// //         scanningField.setEditable(false); // Agar tidak bisa diedit
// //         scanningBuffer = new StringBuilder();

// //         ((AbstractDocument) nameField.getDocument()).setDocumentFilter(new DocumentFilter() {
// //             @Override
// //             public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
// //                 StringBuilder builder = new StringBuilder();
// //                 builder.append(nameField.getText());
// //                 builder.insert(offset, text);

// //                 if (isValidName(builder.toString())) {
// //                     super.insertString(fb, offset, text, attr);
// //                     updateScanningBuffer(text);
// //                 }
// //             }

// //             @Override
// //             public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
// //                 StringBuilder builder = new StringBuilder();
// //                 builder.append(nameField.getText());
// //                 builder.replace(offset, offset + length, text);

// //                 if (isValidName(builder.toString())) {
// //                     super.replace(fb, offset, length, text, attrs);
// //                     updateScanningBuffer(text);
// //                 }
// //             }
// //         });

// //         ((AbstractDocument) nimField.getDocument()).setDocumentFilter(new DocumentFilter() {
// //             @Override
// //             public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
// //                 StringBuilder builder = new StringBuilder();
// //                 builder.append(nimField.getText());
// //                 builder.insert(offset, text);

// //                 if (isValidNim(builder.toString())) {
// //                     super.insertString(fb, offset, text, attr);
// //                     updateScanningBuffer(text);
// //                 }
// //             }

// //             @Override
// //             public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
// //                 StringBuilder builder = new StringBuilder();
// //                 builder.append(nimField.getText());
// //                 builder.replace(offset, offset + length, text);

// //                 if (isValidNim(builder.toString())) {
// //                     super.replace(fb, offset, length, text, attrs);
// //                     updateScanningBuffer(text);
// //                 }
// //             }
// //         });

// //         GroupLayout layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(layout);
// //         layout.setAutoCreateContainerGaps(true);
// //         layout.setAutoCreateGaps(true);

// //         layout.setHorizontalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                         .addComponent(nameLabel)
// //                         .addComponent(nimLabel)
// //                     )
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                         .addComponent(nameField)
// //                         .addComponent(nimField)
// //                     )
// //                     .addComponent(scanningLabel)
// //                     .addComponent(scanningField)
// //                 )
// //         );

// //         layout.setVerticalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                         .addComponent(nameLabel)
// //                         .addComponent(nameField)
// //                         .addComponent(scanningLabel)
// //                         .addComponent(scanningField)
// //                     )
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                         .addComponent(nimLabel)
// //                         .addComponent(nimField)
// //                     )
// //                 )
// //         );

// //         pack();
// //     }

// //     private boolean isValidName(String name) {
// //         // Validasi sesuai dengan kebutuhan Anda
// //         return !name.isEmpty();
// //     }

// //     private boolean isValidNim(String nim) {
// //         // Validasi sesuai dengan kebutuhan Anda
// //         return !nim.isEmpty();
// //     }

// //     private void updateScanningBuffer(String text) {
// //         scanningBuffer.append(text);
// //         scanningField.setText(scanningBuffer.toString());
// //     }

// //     public static void main(String args[]) {
// //         try {
// //             for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
// //                 if ("Nimbus".equals(info.getName())) {
// //                     UIManager.setLookAndFeel(info.getClassName());
// //                     break;
// //                 }
// //             }
// //         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         }

// //         EventQueue.invokeLater(() -> new PerbaikanGui().setVisible(true));
// //     }
// // }


// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.KeyAdapter;
// // import java.awt.event.KeyEvent;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JLabel scanningLabel;
// //     private JTextField scanningField;

// //     public PerbaikanGui() {
// //         initComponents();
// //         getContentPane().setBackground(new Color(0, 128, 0)); // Warna latar belakang hijau tua
// //     }

// //     private void initComponents() {
// //         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
// //         setTitle("Perbaikan Tba");

// //         nameLabel = new JLabel("Nama:");
// //         nimLabel = new JLabel("Nim:");
// //         scanningLabel = new JLabel("Scanning Karakter Diterima:");
// //         nameField = new JTextField(20);
// //         nimField = new JTextField(20);
// //         scanningField = new JTextField(20);
// //         scanningField.setEditable(false); // Agar tidak bisa diedit

// //         // Menambahkan KeyListener untuk NameField
// //         nameField.addKeyListener(new KeyAdapter() {
// //             @Override
// //             public void keyTyped(KeyEvent e) {
// //                 super.keyTyped(e);
// //                 updateScanningField();
// //             }

// //             @Override
// //             public void keyReleased(KeyEvent e) {
// //                 super.keyReleased(e);
// //                 updateScanningField();
// //             }
// //         });

// //         // Menambahkan KeyListener untuk NimField
// //         nimField.addKeyListener(new KeyAdapter() {
// //             @Override
// //             public void keyTyped(KeyEvent e) {
// //                 super.keyTyped(e);
// //                 updateScanningField();
// //             }

// //             @Override
// //             public void keyReleased(KeyEvent e) {
// //                 super.keyReleased(e);
// //                 updateScanningField();
// //             }
// //         });

// //         GroupLayout layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(layout);
// //         layout.setAutoCreateContainerGaps(true);
// //         layout.setAutoCreateGaps(true);

// //         layout.setHorizontalGroup(
// //                 layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                         .addGroup(layout.createSequentialGroup()
// //                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                                         .addComponent(nameLabel)
// //                                         .addComponent(nimLabel)
// //                                 )
// //                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                                         .addComponent(nameField)
// //                                         .addComponent(nimField)
// //                                 )
// //                                 .addComponent(scanningLabel)
// //                                 .addComponent(scanningField)
// //                         )
// //         );

// //         layout.setVerticalGroup(
// //                 layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                         .addGroup(layout.createSequentialGroup()
// //                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                                         .addComponent(nameLabel)
// //                                         .addComponent(nameField)
// //                                         .addComponent(scanningLabel)
// //                                         .addComponent(scanningField)
// //                                 )
// //                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                                         .addComponent(nimLabel)
// //                                         .addComponent(nimField)
// //                                 )
// //                         )
// //         );

// //         pack();
// //     }

// //     private void updateScanningField() {
// //         String nameText = nameField.getText();
// //         String nimText = nimField.getText();
// //         scanningField.setText(nameText + nimText);
// //     }

// //     public static void main(String args[]) {
// //         try {
// //             for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
// //                 if ("Nimbus".equals(info.getName())) {
// //                     UIManager.setLookAndFeel(info.getClassName());
// //                     break;
// //                 }
// //             }
// //         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         }

// //         EventQueue.invokeLater(new Runnable() {
// //             public void run() {
// //                 new PerbaikanGui().setVisible(true);
// //             }
// //         });
// //     }
// // }


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;

// public class PerbaikanGui extends JFrame {
//     private JLabel nameLabel;
//     private JLabel nimLabel;
//     private JTextField nameField;
//     private JTextField nimField;
//     private JLabel scanningLabel;
//     private JTextField scanningField;

//     public PerbaikanGui() {
//         initComponents();
//         getContentPane().setBackground(new Color(0, 128, 0)); // Warna latar belakang hijau tua
//     }

//     private void initComponents() {
//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setTitle("Perbaikan Tba");

//         nameLabel = new JLabel("Nama:");
//         nimLabel = new JLabel("Nim:");
//         scanningLabel = new JLabel("Final State Status:");

//         nameField = new JTextField(20);
//         nimField = new JTextField(20);
//         scanningField = new JTextField(20);
//         scanningField.setEditable(false);

//         nameField.addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyReleased(KeyEvent e) {
//                 updateScanningField();
//             }
//         });

//         nimField.addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyReleased(KeyEvent e) {
//                 updateScanningField();
//             }
//         });

//         GroupLayout layout = new GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setAutoCreateContainerGaps(true);
//         layout.setAutoCreateGaps(true);

//         layout.setHorizontalGroup(
//                 layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                         .addGroup(layout.createSequentialGroup()
//                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                         .addComponent(nameLabel)
//                                         .addComponent(nimLabel)
//                                 )
//                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                         .addComponent(nameField)
//                                         .addComponent(nimField)
//                                 )
//                                 .addComponent(scanningLabel)
//                                 .addComponent(scanningField)
//                         )
//         );

//         layout.setVerticalGroup(
//                 layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                         .addGroup(layout.createSequentialGroup()
//                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                         .addComponent(nameLabel)
//                                         .addComponent(nameField)
//                                 )
//                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                         .addComponent(nimLabel)
//                                         .addComponent(nimField)
//                                 )
//                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                         .addComponent(scanningLabel)
//                                         .addComponent(scanningField)
//                                 )
//                         )
//         );

//         pack();
//     }

//     private void updateScanningField() {
//         String nameText = nameField.getText();
//         String nimText = nimField.getText();
        
//         // Contoh kondisi untuk menerima atau menolak
//         if ("Elisa".equalsIgnoreCase(nameText) && "2207".equals(nimText)) {
//             scanningField.setText(" Diterima");
//         } else {
//             scanningField.setText(" Ditolak");
//         }
//     }

//     public static void main(String[] args) {
//         EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new PerbaikanGui().setVisible(true);
//             }
//         });
//     }
// }
