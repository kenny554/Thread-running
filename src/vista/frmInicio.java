package vista;

/*


/**
 *
 * @author Liber
 */
import modelo.carrera;

public class frmInicio extends javax.swing.JFrame {
        public static long tiempoManualC1;
        public static long tiempoManualC2;
        public static long tiempoManualC3;
        public static long tiempoManualC4;

        /**
         * Creates new form frmInicio
         */
        public frmInicio() {
                initComponents();
                setLocationRelativeTo(this);
                setResizable(false);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                lblLinea = new javax.swing.JLabel();
                lblCaballo1 = new javax.swing.JLabel();
                lblCaballo2 = new javax.swing.JLabel();
                lblCaballo3 = new javax.swing.JLabel();
                lblCaballo4 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                lblBandera = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtR = new javax.swing.JTextArea();
                jButton2 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                timepoC1 = new javax.swing.JTextField();
                tiempoC2 = new javax.swing.JTextField();
                tiempoC3 = new javax.swing.JTextField();
                tiempoC4 = new javax.swing.JTextField();
                btncambio1 = new javax.swing.JButton();
                btncambio3 = new javax.swing.JButton();
                btncambio4 = new javax.swing.JButton();
                btncambio5 = new javax.swing.JButton();

                jLabel1.setText("jLabel1");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 0, 51));
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowOpened(java.awt.event.WindowEvent evt) {
                                formWindowOpened(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                lblLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/linea.png"))); // NOI18N

                lblCaballo1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
                lblCaballo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/horse.png"))); // NOI18N

                lblCaballo2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
                lblCaballo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/horse.png"))); // NOI18N

                lblCaballo3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
                lblCaballo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/horse.png"))); // NOI18N

                lblCaballo4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
                lblCaballo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/horse.png"))); // NOI18N

                jButton1.setText("Start");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                lblBandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/bandera.png"))); // NOI18N

                txtR.setEditable(false);
                txtR.setColumns(20);
                txtR.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
                txtR.setRows(5);
                jScrollPane1.setViewportView(txtR);

                jButton2.setText("New");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel3.setText("___________________________________________________________________________________________");

                jLabel5.setText("___________________________________________________________________________________________");

                jLabel6.setText("___________________________________________________________________________________________");

                timepoC1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                timepoC1ActionPerformed(evt);
                        }
                });

                tiempoC2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tiempoC2ActionPerformed(evt);
                        }
                });

                tiempoC3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tiempoC3ActionPerformed(evt);
                        }
                });

                tiempoC4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tiempoC4ActionPerformed(evt);
                        }
                });

                btncambio1.setText("cambio");
                btncambio1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncambio1ActionPerformed(evt);
                        }
                });

                btncambio3.setText("cambio");
                btncambio3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncambio3ActionPerformed(evt);
                        }
                });

                btncambio4.setText("cambio");
                btncambio4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncambio4ActionPerformed(evt);
                        }
                });

                btncambio5.setText("cambio");
                btncambio5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncambio5ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addContainerGap()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                515,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(13, 13, 13)
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(lblCaballo1)
                                                                                                                                                                                .addComponent(lblCaballo2)))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addContainerGap()
                                                                                                                                                                .addComponent(lblCaballo3))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addContainerGap()
                                                                                                                                                                .addComponent(lblCaballo4))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addContainerGap()
                                                                                                                                                                .addComponent(timepoC1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                106,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(btncambio1))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addContainerGap()
                                                                                                                                                                .addComponent(tiempoC2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                106,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(btncambio3))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addContainerGap()
                                                                                                                                                                .addComponent(tiempoC3,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                114,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(btncambio4)))
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(tiempoC4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                106,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(btncambio5)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(lblBandera)
                                                                                                .addContainerGap())
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 63, Short.MAX_VALUE)
                                                                                                .addComponent(lblLinea,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(95, 95, 95)
                                                                                                                                .addComponent(jButton1)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jButton2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                61,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(61, 61, 61))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                213,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addContainerGap()))))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jButton2)
                                                                                                                .addComponent(jButton1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                327,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(timepoC1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(btncambio1))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addComponent(lblCaballo1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                45,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(btncambio3)
                                                                                                                                                                .addGap(13, 13, 13))
                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(tiempoC2,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                24,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                                                                                .addComponent(lblCaballo2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                45,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jLabel3)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(tiempoC3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(btncambio4))
                                                                                                                                .addGap(27, 27, 27)
                                                                                                                                .addComponent(lblCaballo3,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                45,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                14,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(tiempoC4,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(btncambio5))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(lblCaballo4,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                45,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(lblLinea,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                0,
                                                                                                                                Short.MAX_VALUE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblBandera,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                39,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                frmInicio.txtR.setText("->");
                carrera.iniciar();
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                carrera.reiniciar();

                lblCaballo1.setLocation(carrera.losCaballos[0].getCoorX(), carrera.losCaballos[0].getCoorY());
                lblCaballo2.setLocation(carrera.losCaballos[1].getCoorX(), carrera.losCaballos[1].getCoorY());
                lblCaballo3.setLocation(carrera.losCaballos[2].getCoorX(), carrera.losCaballos[2].getCoorY());
                lblCaballo4.setLocation(carrera.losCaballos[3].getCoorX(), carrera.losCaballos[3].getCoorY());

                // Habilitar y deshabilitar botones según sea necesario
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
        }// GEN-LAST:event_jButton2ActionPerformed

        private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
                // TODO add your handling code here:
                jButton2.setEnabled(false);
                carrera.registrarCaballos();
                lblCaballo1.setText(carrera.losCaballos[0].getNombre());
                lblCaballo2.setText(carrera.losCaballos[1].getNombre());
                lblCaballo3.setText(carrera.losCaballos[2].getNombre());
                lblCaballo4.setText(carrera.losCaballos[3].getNombre());
        }// GEN-LAST:event_formWindowOpened

        private void timepoC1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_timepoC1ActionPerformed
                String inputValue = timepoC1.getText();

                // Verificamos que no esté vacío
                if (!inputValue.isEmpty()) {
                        try {
                                long tiempoManual = Long.parseLong(inputValue);

                                frmInicio.tiempoManualC1 = tiempoManual;

                                System.out.println("Tiempo manual para caballo 1 establecido a: "
                                                + frmInicio.tiempoManualC1 + " ms");

                        } catch (NumberFormatException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                        }
                } else {
                        System.out.println("No se ingresó ningún valor.");
                }
        }// GEN-LAST:event_timepoC1ActionPerformed

        private void tiempoC2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tiempoC2ActionPerformed
                String inputValue = tiempoC2.getText();

                if (!inputValue.isEmpty()) {
                        try {
                                long tiempoManual = Long.parseLong(inputValue);

                                frmInicio.tiempoManualC2 = tiempoManual;

                                System.out.println("Tiempo manual para caballo 2 establecido a: "
                                                + frmInicio.tiempoManualC2 + " ms");

                        } catch (NumberFormatException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                        }
                } else {
                        System.out.println("No se ingresó ningún valor.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_tiempoC2ActionPerformed

        private void tiempoC3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tiempoC3ActionPerformed
                String inputValue = tiempoC3.getText();

                if (!inputValue.isEmpty()) {
                        try {
                                long tiempoManual = Long.parseLong(inputValue);

                                frmInicio.tiempoManualC3 = tiempoManual;

                                System.out.println("Tiempo manual para caballo 3 establecido a: "
                                                + frmInicio.tiempoManualC3 + " ms");

                        } catch (NumberFormatException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                        }
                } else {
                        System.out.println("No se ingresó ningún valor.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_tiempoC3ActionPerformed

        private void tiempoC4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tiempoC4ActionPerformed
                String inputValue = tiempoC4.getText();

                if (!inputValue.isEmpty()) {
                        try {
                                long tiempoManual = Long.parseLong(inputValue);

                                frmInicio.tiempoManualC4 = tiempoManual;

                                System.out.println("Tiempo manual para caballo 4 establecido a: "
                                                + frmInicio.tiempoManualC4 + " ms");

                        } catch (NumberFormatException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                        }
                } else {
                        System.out.println("No se ingresó ningún valor.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_tiempoC4ActionPerformed

        private void btncambio1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncambio1ActionPerformed
                try {
                        // Leer el tiempo ingresado por el usuario para el caballo 1
                        frmInicio.tiempoManualC1 = Long.parseLong(timepoC1.getText());
                        System.out.println(
                                        "Tiempo manual para Alexis actualizado a: " + frmInicio.tiempoManualC1 + " ms");
                } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_btncambio1ActionPerformed

        private void btncambio4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncambio4ActionPerformed
                try {
                        // Leer el tiempo ingresado por el usuario para el caballo 1
                        frmInicio.tiempoManualC3 = Long.parseLong(tiempoC3.getText());
                        System.out.println(
                                        "Tiempo manual para Luis actualizado a: " + frmInicio.tiempoManualC3 + " ms");
                } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_btncambio4ActionPerformed

        private void btncambio3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncambio3ActionPerformed
                try {
                        // Leer el tiempo ingresado por el usuario para el caballo 1
                        frmInicio.tiempoManualC2 = Long.parseLong(tiempoC2.getText());
                        System.out.println(
                                        "Tiempo manual para Danito actualizado a: " + frmInicio.tiempoManualC2 + " ms");
                } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_btncambio3ActionPerformed

        private void btncambio5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncambio5ActionPerformed
                try {
                        // Leer el tiempo ingresado por el usuario para el caballo 1
                        frmInicio.tiempoManualC4 = Long.parseLong(tiempoC4.getText());
                        System.out.println(
                                        "Tiempo manual para Josue actualizado a: " + frmInicio.tiempoManualC4 + " ms");
                } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un número válido.");
                } // TODO add your handling code here:
        }// GEN-LAST:event_btncambio5ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btncambio1;
        private javax.swing.JButton btncambio3;
        private javax.swing.JButton btncambio4;
        private javax.swing.JButton btncambio5;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        public static javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        public static javax.swing.JLabel lblBandera;
        public static javax.swing.JLabel lblCaballo1;
        public static javax.swing.JLabel lblCaballo2;
        public static javax.swing.JLabel lblCaballo3;
        public static javax.swing.JLabel lblCaballo4;
        public static javax.swing.JLabel lblLinea;
        private javax.swing.JTextField tiempoC2;
        private javax.swing.JTextField tiempoC3;
        private javax.swing.JTextField tiempoC4;
        private javax.swing.JTextField timepoC1;
        public static javax.swing.JTextArea txtR;
        // End of variables declaration//GEN-END:variables
}
