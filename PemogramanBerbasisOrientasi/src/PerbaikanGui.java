// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JLabel scanningLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JTextField scanningField;
// //     private JButton okButton;

// //     private String expectedInput = "saya makan nasi";
// //     private String currentInput = "";
// //     private int currentState = 0;

// //     public PerbaikanGui() {
// //         initComponents();
// //     }

// //     private void initComponents() {
// //         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
// //         setTitle("Perbaikan Tba");

// //         nameLabel = new JLabel("Nama:");
// //         nimLabel = new JLabel("Nim:");
// //         scanningLabel = new JLabel("Scanning Karakter Diterima:");
// //         nameField = new JTextField(15);
// //         nimField = new JTextField(15);
// //         scanningField = new JTextField(15);
// //         okButton = new JButton("Oke");
// //         okButton.addActionListener(new ActionListener() {
// //             public void actionPerformed(ActionEvent evt) {
// //                 jButton1ActionPerformed(evt);
// //             }
// //         });

// //         GroupLayout jPanel1Layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(jPanel1Layout);
// //         jPanel1Layout.setAutoCreateContainerGaps(true);
// //         jPanel1Layout.setAutoCreateGaps(true);

// //         jPanel1Layout.setHorizontalGroup(
// //             jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(jPanel1Layout.createSequentialGroup()
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nameLabel)
// //                         .addComponent(nimLabel)
// //                     )
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nameField)
// //                         .addComponent(nimField)
// //                     )
// //                     .addComponent(scanningLabel)
// //                     .addComponent(scanningField)
// //                     .addComponent(okButton)
// //                 )
// //         );

// //         jPanel1Layout.setVerticalGroup(
// //             jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(jPanel1Layout.createSequentialGroup()
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nameLabel)
// //                         .addComponent(nameField)
// //                     )
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nimLabel)
// //                         .addComponent(nimField)
// //                     )
// //                     .addComponent(scanningLabel)
// //                     .addComponent(scanningField)
// //                     .addComponent(okButton)
// //                 )
// //         );

// //         pack();
// //     }

// //     private void jButton1ActionPerformed(ActionEvent evt) {
       
// //     }

// //     public static void main(String args[]) {
// //         try {
// //             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
// //                 if ("Nimbus".equals(info.getName())) {
// //                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
// //                     break;
// //                 }
// //             }
// //         } catch (ClassNotFoundException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (InstantiationException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (IllegalAccessException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         }

// //         java.awt.EventQueue.invokeLater(new Runnable() {
// //             public void run() {
// //                 new PerbaikanGui().setVisible(true);
// //             }
// //         });
// //     }
// // }

// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JLabel scanningLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JTextField scanningField;
// //     private JButton okButton;

// //     private String expectedInput = "saya makan nasi";
// //     private String currentInput = "";
// //     private int currentState = 0;

// //     public PerbaikanGui() {
// //         initComponents();
// //     }

// //     private void initComponents() {
// //         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
// //         setTitle("Perbaikan Tba");

// //         nameLabel = new JLabel("Nama:");
// //         nimLabel = new JLabel("Nim:");
// //         scanningLabel = new JLabel("Scanning Karakter Diterima:");
// //         nameField = new JTextField(15);
// //         nimField = new JTextField(15);
// //         scanningField = new JTextField(15);
// //         okButton = new JButton("Oke");
// //         okButton.addActionListener(new ActionListener() {
// //             public void actionPerformed(ActionEvent evt) {
// //                 jButton1ActionPerformed(evt);
// //             }
// //         });

// //         GroupLayout jPanel1Layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(jPanel1Layout);
// //         jPanel1Layout.setAutoCreateContainerGaps(true);
// //         jPanel1Layout.setAutoCreateGaps(true);

// //         jPanel1Layout.setHorizontalGroup(
// //             jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(jPanel1Layout.createSequentialGroup()
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nameLabel)
// //                         .addComponent(nimLabel)
// //                     )
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nameField)
// //                         .addComponent(nimField)
// //                     )
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(scanningLabel)
// //                         .addComponent(scanningField)
// //                     )
// //                     .addComponent(okButton)
// //                 )
// //         );

// //         jPanel1Layout.setVerticalGroup(
// //             jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(jPanel1Layout.createSequentialGroup()
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nameLabel)
// //                         .addComponent(nameField)
// //                         .addComponent(scanningLabel)
// //                     )
// //                     .addGroup(jPanel1Layout.createParallelGroup()
// //                         .addComponent(nimLabel)
// //                         .addComponent(nimField)
// //                         .addComponent(scanningField)
// //                     )
// //                     .addComponent(okButton)
// //                 )
// //         );

// //         pack();
// //     }

// //     private void jButton1ActionPerformed(ActionEvent evt) {
       
// //     }

// //     public static void main(String args[]) {
// //         try {
// //             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
// //                 if ("Nimbus".equals(info.getName())) {
// //                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
// //                     break;
// //                 }
// //             }
// //         } catch (ClassNotFoundException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (InstantiationException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (IllegalAccessException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         }

// //         java.awt.EventQueue.invokeLater(new Runnable() {
// //             public void run() {
// //                 new PerbaikanGui().setVisible(true);
// //             }
// //         });
// //     }
// // }

// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JLabel scanningLabel;
// //     private JTextField scanningField;
// //     private JButton okButton;

// //     private String expectedInput = "saya makan nasi";
// //     private String currentInput = "";
// //     private int currentState = 0;

// //     public PerbaikanGui() {
// //         initComponents();
// //         setBackground(Color.GREEN);
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
// //         okButton = new JButton("Oke");
// //         okButton.addActionListener(new ActionListener() {
// //             public void actionPerformed(ActionEvent evt) {
// //                 jButton1ActionPerformed(evt);
// //             }
// //         });

// //         JPanel panel = new JPanel(new GridLayout(3, 2));
// //         panel.add(nameLabel);
// //         panel.add(nameField);
// //         panel.add(nimLabel);
// //         panel.add(nimField);

// //         GroupLayout layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(layout);
// //         layout.setAutoCreateContainerGaps(true);
// //         layout.setAutoCreateGaps(true);

// //         layout.setHorizontalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addComponent(panel)
// //                     .addComponent(scanningLabel)
// //                     .addComponent(scanningField)
// //                     .addComponent(okButton)
// //                 )
// //         );

// //         layout.setVerticalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                         .addComponent(panel)
// //                         .addComponent(scanningLabel)
// //                         .addComponent(scanningField)
// //                         .addComponent(okButton)
// //                     )
// //                 )
// //         );

// //         pack();
// //     }

// //     private void jButton1ActionPerformed(ActionEvent evt) {
       
// //     }

// //     public static void main(String args[]) {
// //         try {
// //             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
// //                 if ("Nimbus".equals(info.getName())) {
// //                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
// //                     break;
// //                 }
// //             }
// //         } catch (ClassNotFoundException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (InstantiationException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (IllegalAccessException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
// //             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
// //         }

// //         java.awt.EventQueue.invokeLater(new Runnable() {
// //             public void run() {
// //                 new PerbaikanGui().setVisible(true);
// //             }
// //         });
// //     }
// // }

// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;

// // public class PerbaikanGui extends JFrame {
// //     private JLabel nameLabel;
// //     private JLabel nimLabel;
// //     private JTextField nameField;
// //     private JTextField nimField;
// //     private JLabel scanningLabel;
// //     private JTextField scanningField;
// //     private JButton okButton;

// //     private String expectedInput = "saya makan nasi";
// //     private String currentInput = "";
// //     private int currentState = 0;

// //     public PerbaikanGui() {
// //         initComponents();
// //         getContentPane().setBackground(Color.GREEN); // Atur warna latar belakang frame
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
// //         okButton = new JButton("Oke");

// //         okButton.addActionListener(new ActionListener() {
// //             public void actionPerformed(ActionEvent evt) {
// //                 jButton1ActionPerformed(evt);
// //             }
// //         });

// //         JPanel panel = new JPanel(new GridLayout(3, 2));
// //         panel.add(nameLabel);
// //         panel.add(nameField);
// //         panel.add(nimLabel);
// //         panel.add(nimField);

// //         GroupLayout layout = new GroupLayout(getContentPane());
// //         getContentPane().setLayout(layout);
// //         layout.setAutoCreateContainerGaps(true);
// //         layout.setAutoCreateGaps(true);

// //         layout.setHorizontalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addComponent(panel)
// //                     .addComponent(scanningLabel)
// //                     .addComponent(scanningField)
// //                     .addComponent(okButton)
// //                 )
// //         );

// //         layout.setVerticalGroup(
// //             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
// //                 .addGroup(layout.createSequentialGroup()
// //                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// //                         .addComponent(panel)
// //                         .addComponent(scanningLabel)
// //                         .addComponent(scanningField)
// //                         .addComponent(okButton)
// //                     )
// //                 )
// //         );

// //         pack();
// //     }

// //     private void jButton1ActionPerformed(ActionEvent evt) {
// //         // Isi dengan tindakan yang ingin Anda lakukan saat tombol "Oke" ditekan
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
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class PerbaikanGui extends JFrame {
//     private JLabel nameLabel;
//     private JLabel nimLabel;
//     private JTextField nameField;
//     private JTextField nimField;
//     private JLabel scanningLabel;
//     private JTextField scanningField;
    

//     private String expectedInput = "saya makan nasi";
//     private String currentInput = "";
//     private int currentState = 0;

//     public PerbaikanGui() {
//         initComponents();
//         getContentPane().setBackground(Color.GREEN); // Warna latar belakang hijau
//     }

//     private void initComponents() {
//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setTitle("Perbaikan Tba");

//         nameLabel = new JLabel("Nama:");
//         nimLabel = new JLabel("Nim:");
//         scanningLabel = new JLabel("Scanning Karakter Diterima:");
//         nameField = new JTextField(20);
//         nimField = new JTextField(20);
//         scanningField = new JTextField(20);
//         // okButton = new JButton("Oke");

//         nameField.setBackground(new Color(0, 128, 0)); // Warna hijau tua
//         nimField.setBackground(new Color(0, 128, 0)); // Warna hijau tua

//         // okButton.addActionListener(new ActionListener() {
//         //     public void actionPerformed(ActionEvent evt) {
//         //         jButton1ActionPerformed(evt);
//         //     }
//         // });

//         GroupLayout layout = new GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setAutoCreateContainerGaps(true);
//         layout.setAutoCreateGaps(true);

//         layout.setHorizontalGroup(
//             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                 .addGroup(layout.createSequentialGroup()
//                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                         .addComponent(nameLabel)
//                         .addComponent(nimLabel)
//                     )
//                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                         .addComponent(nameField)
//                         .addComponent(nimField)
//                     )
//                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                         .addComponent(scanningLabel)
//                     )
//                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                         .addComponent(scanningField)
//                     )
//                 )
//                 // .addGroup(layout.createSequentialGroup()
//                 //     .addComponent(okButton)
//                 // )
//         );

//         layout.setVerticalGroup(
//             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                 .addGroup(layout.createSequentialGroup()
//                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                         .addComponent(nameLabel)
//                         .addComponent(nameField)
//                         .addComponent(scanningLabel)
//                         .addComponent(scanningField)
//                     )
//                     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                         .addComponent(nimLabel)
//                         .addComponent(nimField)
//                         // .addComponent(okButton)
//                     )
//                 )
//         );

//         pack();
//     }

//     private void jButton1ActionPerformed(ActionEvent evt) {
//         // Isi dengan tindakan yang ingin Anda lakukan saat tombol "Oke" ditekan
//     }

//     public static void main(String args[]) {
//         try {
//             for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }

//         EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new PerbaikanGui().setVisible(true);
//             }
//         });
//     }
// }


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
//         scanningLabel = new JLabel("Scanning Karakter Diterima:");
//         nameField = new JTextField(20);
//         nimField = new JTextField(20);
//         scanningField = new JTextField(20);
//         scanningField.setEditable(false); // Agar tidak bisa diedit

//         // Menambahkan KeyListener untuk NameField
//         nameField.addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyTyped(KeyEvent e) {
//                 super.keyTyped(e);
//                 updateScanningField();
//             }

//             @Override
//             public void keyReleased(KeyEvent e) {
//                 super.keyReleased(e);
//                 updateScanningField();
//             }
//         });

//         // Menambahkan KeyListener untuk NimField
//         nimField.addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyTyped(KeyEvent e) {
//                 super.keyTyped(e);
//                 updateScanningField();
//             }

//             @Override
//             public void keyReleased(KeyEvent e) {
//                 super.keyReleased(e);
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
//                                         .addComponent(scanningLabel)
//                                         .addComponent(scanningField)
//                                 )
//                                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                         .addComponent(nimLabel)
//                                         .addComponent(nimField)
//                                 )
//                         )
//         );

//         pack();
//     }

//     private void updateScanningField() {
//         String nameText = nameField.getText();
//         String nimText = nimField.getText();
        
//         // Hanya jika nama dan nim sesuai, update field scanning
//         if (nameText.equals("Elisa ") && nimText.equals("2207")) {
//             scanningField.setText(nameText + nimText);
//         } else {
//             scanningField.setText("Input nama Elisa dan Nim 220711");
//         }
//     }

//     public static void main(String args[]) {
//         try {
//             for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }

//         EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new PerbaikanGui().setVisible(true);
//             }
//         });
//     }
// }








import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PerbaikanGui extends JFrame {
    private JLabel nameLabel;
    private JLabel nimLabel;
    private JTextField nameField;
    private JTextField nimField;
    private JLabel scanningLabel;
    private JTextField scanningField;
    private JLabel pesanLabel;
    private JTextField pesanField;

    public PerbaikanGui() {
        initComponents();
        getContentPane().setBackground(new Color(0, 128, 0)); // Warna latar belakang hijau tua
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perbaikan Tba");

        nameLabel = new JLabel("Nama:");
        nimLabel = new JLabel("Nim:");
        scanningLabel = new JLabel("Scanning Karakter Diterima:");
        pesanLabel = new JLabel("Pesan:");
        nameField = new JTextField(20);
        nimField = new JTextField(20);
        scanningField = new JTextField(20);
        pesanField = new JTextField(20);
        scanningField.setEditable(false); // Agar tidak bisa diedit

        // Menambahkan DocumentListener ke NameField
        nameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateScanningField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateScanningField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateScanningField();
            }
        });

        // Menambahkan DocumentListener ke NimField
        nimField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateScanningField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateScanningField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateScanningField();
            }
        });

        // Mengatur tata letak menggunakan GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Baris 1
        add(nameLabel, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(nameField, gbc);

        gbc.gridx = 2;
        add(scanningLabel, gbc);
        gbc.gridx = 3;
        add(scanningField, gbc);

        // Baris 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(nimLabel, gbc);
        gbc.gridx = 1;
        add(nimField, gbc);

        gbc.gridx = 2;
        add(pesanLabel, gbc);
        gbc.gridx = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(pesanField, gbc);

        pack();
    }

    private void updateScanningField() {
        String nameText = nameField.getText();
        String nimText = nimField.getText();
        scanningField.setText(nameText + " " + nimText);
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerbaikanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerbaikanGui().setVisible(true);
            }
        });
    }
}
