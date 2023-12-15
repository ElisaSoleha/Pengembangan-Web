package com.mycompany.projekakhir;

/**
 *
 * @author Sitir
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjekAkhir extends javax.swing.JFrame {
    private boolean[] kunciKelasS1 = new boolean[6]; // Indeks 0 tidak digunakan
    private boolean[] kunciKelasD3 = new boolean[6]; // Indeks 0 tidak digunakan
    private boolean[] kunciKelasTI = new boolean[6]; // Indeks 0 tidak digunakan
    private boolean[] infrastrukturInfocus = new boolean[6]; // Indeks 0 tidak digunakan
    private boolean[] infrastrukturCokSambung = new boolean[6];

    public ProjekAkhir() {
        initComponents();
        
        for (int i = 1; i <= 5; i++) {
            kunciKelasS1[i] = true;
            kunciKelasD3[i] = true;
            kunciKelasTI[i] = true;
            infrastrukturInfocus[i] = true;
            infrastrukturCokSambung[i] = true;
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonShowUsedClassrooms = new javax.swing.JButton();
        jButtonShowUsedInfrastructures = new javax.swing.JButton();
        jPanelStatus = new javax.swing.JPanel();
        jScrollPaneClassrooms = new javax.swing.JScrollPane();
        jListClassrooms = new javax.swing.JList<>();
        jScrollPaneInfrastructures = new javax.swing.JScrollPane();
        jListInfrastructures = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peminjaman Infrastruktur dan Pengambilan Absen Jurusan Teknik Elektro Universitas Riau");

        jLabel1.setText("Pilih Program Studi:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Program Studi Elektro S1", "Program Studi Elektro D3", "Program Studi Teknik Informatika" }));

        jButton1.setText("Lanjutkan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        // Inisialisasi panel status kunci kelas dan infrastruktur
        jPanelStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status Kunci Kelas dan Infrastruktur"));

        jListClassrooms.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"RC1TI1", "RC1TI2", "RC1TI3", "RC1TI4", "RC1TI5"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneClassrooms.setViewportView(jListClassrooms);

        jListInfrastructures.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Inf1", "Inf2", "Inf3", "Inf4", "Inf5", "CS1", "CS2", "CS3", "CS4", "CS5"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
        jScrollPaneInfrastructures.setViewportView(jListInfrastructures);

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneClassrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneInfrastructures, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneClassrooms)
                    .addComponent(jScrollPaneInfrastructures))
                .addContainerGap())
        );

        pack();
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String selectedProdi = jComboBox1.getSelectedItem().toString();
        if (selectedProdi.equals("Program Studi Elektro S1")) {
            showOptionsDialog();
        } else if (selectedProdi.equals("Program Studi Elektro D3")) {
            showOptionsDialog();
        } else if (selectedProdi.equals("Program Studi Teknik Informatika")) {
            showOptionsDialog();
        }
    }

    public void showOptionsDialog() {
        Object[] options = {"Peminjaman Infrastruktur", "Pengambilan Absen"};
        int choice = JOptionPane.showOptionDialog(this,
                "Silakan pilih salah satu opsi:",
                "Pilih Opsi",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if (choice == 0) {
            showPinjamInfrastrukturDialog();
        } else if (choice == 1) {
            showPengambilanAbsenDialog();
        }
    }

    public void showPinjamInfrastrukturDialog() {
        Object[] options = {"Pengambilan Kunci Kelas", "Peminjaman Infrastruktur", "Pengembalian Infrastruktur", "Kelas Terpakai"};
        int choice = JOptionPane.showOptionDialog(this,
                "Silakan pilih salah satu opsi:",
                "Pilih Opsi",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);

        if (choice == 0) {
            // Pengambilan Kunci Kelas
            String[] kelasOptions = {"Kelas RC1TI", "Kelas C314", "Kelas C315", "Lab. Jarkom", "Lab. Telkom", "Lab. DTE"};
            String selectedKelas = (String) JOptionPane.showInputDialog(this,
                    "Pilih kelas:",
                    "Pengambilan Kunci Kelas",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    kelasOptions,
                    kelasOptions[0]);
            if (selectedKelas != null) {
                JOptionPane.showMessageDialog(this, "Anda telah mengambil kunci kelas " + selectedKelas);
            }
        } else if (choice == 1) {
            // Peminjaman Infrastruktur
            String[] infrastrukturOptions = {"Infocus (Inf1)", "Infocus (Inf2)", "Infocus (Inf3)", "Infocus (Inf4)", "Infocus (Inf5)",
                    "Cok Sambung (CS1)", "Cok Sambung (CS2)", "Cok Sambung (CS3)", "Cok Sambung (CS4)", "Cok Sambung (CS5)"};
            String selectedInfrastruktur = (String) JOptionPane.showInputDialog(this,
                    "Pilih infrastruktur yang ingin dipinjam:",
                    "Peminjaman Infrastruktur",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    infrastrukturOptions,
                    infrastrukturOptions[0]);
            if (selectedInfrastruktur != null) {
                JOptionPane.showMessageDialog(this, "Anda telah meminjam " + selectedInfrastruktur +
                        "\nBerikan KTM anda sebagai jaminan infrastruktur yang telah dipinjam!");
            }
        } else if (choice == 2) {
            // Pengembalian Infrastruktur
            // Handle pengembalian infrastruktur di sini
            JOptionPane.showMessageDialog(this, "Silakan kembalikan infrastruktur yang telah dipinjam.");
        } else if (choice == 3) {
          
        }
    }
     
    private void showUsedInfrastructuresDialog() {
        StringBuilder usedInfrastructures = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            if (!infrastrukturInfocus[i]) {
                usedInfrastructures.append("Infocus (Inf").append(i).append(")\n");
            }
            if (!infrastrukturCokSambung[i]) {
                usedInfrastructures.append("Cok Sambung (CS").append(i).append(")\n");
            }
        }

        JOptionPane.showMessageDialog(this, "Infrastruktur yang sudah terpakai:\n" + usedInfrastructures.toString());
    }
    
    private String getLabName(int index) {
        switch (index) {
            case 1:
                return "Jarkom";
            case 2:
                return "Telkom";
            case 3:
                return "DTE";
            case 4:
                return "Lab4";
            case 5:
                return "Lab5";
            default:
                return "";
        }
    }

    public void showPengambilanAbsenDialog() {
       String kelasMahasiswa = JOptionPane.showInputDialog(this, "Masukkan Kelas Mahasiswa yang ingin mengambil absen:");
        if (kelasMahasiswa != null && !kelasMahasiswa.isEmpty()) {
            String mataKuliah = JOptionPane.showInputDialog(this, "Masukkan Mata Kuliah:");
            if (mataKuliah != null && !mataKuliah.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Absen telah diambil untuk kelas: " + kelasMahasiswa + "\nMata Kuliah: " + mataKuliah);
            } else {
                JOptionPane.showMessageDialog(this, "Pengambilan absen dibatalkan.");
            }
            // Perbarui list kunci kelas dan infrastruktur setelah pengambilan absen
            updateClassroomStatusList();
            updateInfrastructuresStatusList();
        } else {
            JOptionPane.showMessageDialog(this, "Pengambilan absen dibatalkan.");
        }
    }
    
    private void updateClassroomStatusList() {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (int i = 1; i <= 5; i++) {
            model.addElement("RC1TI" + i);
        }
        jListClassrooms.setModel(model);
    }

    private void updateInfrastructuresStatusList() {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (int i = 1; i <= 5; i++) {
            model.addElement("Inf" + i);
            model.addElement("CS" + i);
        }
        jListInfrastructures.setModel(model);
    }
    
     public boolean isValidClassNumber(String classNumber) {
        try {
            int number = Integer.parseInt(classNumber);
            return number >= 1 && number <= 5;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjekAkhir().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButtonShowUsedClassrooms;
    private javax.swing.JButton jButtonShowUsedInfrastructures;
    private javax.swing.JList jListInfrastructures;
    private javax.swing.JList jListClassrooms;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPaneClassrooms;
    private javax.swing.JScrollPane jScrollPaneInfrastructures ;
}




