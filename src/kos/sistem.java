/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author IKHWAN
 */
public class sistem extends javax.swing.JFrame {

    /**
     * Creates new form sistem
     */
    public sistem() {
        initComponents();
         tampilkan();
        kosong();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jharga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jalamat = new javax.swing.JComboBox<>();
        jnamakos = new javax.swing.JTextField();
        jfasilitas = new javax.swing.JTextField();
        jpemilik = new javax.swing.JTextField();
        jtelp = new javax.swing.JTextField();
        jtipekos = new javax.swing.JComboBox<>();
        jtambah = new javax.swing.JButton();
        jedit = new javax.swing.JButton();
        jhapus = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jcaridata = new javax.swing.JTextField();
        jcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jexit = new javax.swing.JButton();
        jnext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kos/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Uni Sans Thin CAPS", 1, 36)); // NOI18N
        jLabel2.setText("KOST-KOSTAN SYSTEM MANAGEMENT");

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));

        jPanel3.setBackground(new java.awt.Color(75, 119, 190));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DATA KOS-KOSAN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(208, 208, 208))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(75, 119, 190));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("INPUT DATA KOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Pondokan :");

        jharga.setBackground(new java.awt.Color(31, 58, 147));
        jharga.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Alamat               :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Type Kos            :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Harga/Thn         :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Fasilitas              :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Telepon              :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nama Pemilik      :");

        jalamat.setBackground(new java.awt.Color(75, 119, 190));
        jalamat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gg Juwita", "Gg Melati", "Gg Setia", "Gg Lurah" }));
        jalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalamatActionPerformed(evt);
            }
        });

        jnamakos.setBackground(new java.awt.Color(31, 58, 147));
        jnamakos.setForeground(new java.awt.Color(255, 255, 255));

        jfasilitas.setBackground(new java.awt.Color(31, 58, 147));
        jfasilitas.setForeground(new java.awt.Color(255, 255, 255));

        jpemilik.setBackground(new java.awt.Color(31, 58, 147));
        jpemilik.setForeground(new java.awt.Color(255, 255, 255));

        jtelp.setBackground(new java.awt.Color(31, 58, 147));
        jtelp.setForeground(new java.awt.Color(255, 255, 255));

        jtipekos.setBackground(new java.awt.Color(75, 119, 190));
        jtipekos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standart", "Elite", "Super Elite" }));
        jtipekos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtipekosActionPerformed(evt);
            }
        });

        jtambah.setBackground(new java.awt.Color(51, 255, 51));
        jtambah.setText("TAMBAH");
        jtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtambahActionPerformed(evt);
            }
        });

        jedit.setBackground(new java.awt.Color(255, 255, 0));
        jedit.setText("EDIT");
        jedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditActionPerformed(evt);
            }
        });

        jhapus.setBackground(new java.awt.Color(255, 0, 0));
        jhapus.setText("HAPUS");
        jhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhapusActionPerformed(evt);
            }
        });

        jreset.setBackground(new java.awt.Color(102, 255, 204));
        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        jcaridata.setBackground(new java.awt.Color(228, 241, 254));
        jcaridata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcaridataMouseReleased(evt);
            }
        });
        jcaridata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcaridataActionPerformed(evt);
            }
        });

        jcari.setBackground(new java.awt.Color(241, 169, 160));
        jcari.setText("CARI");
        jcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcariMouseClicked(evt);
            }
        });
        jcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcariActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jexit.setBackground(new java.awt.Color(0, 0, 255));
        jexit.setText("MENU");
        jexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jexitMouseClicked(evt);
            }
        });
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        jnext.setBackground(new java.awt.Color(0, 0, 255));
        jnext.setText("NEXT");
        jnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jnextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jharga)
                            .addComponent(jalamat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jnamakos)
                            .addComponent(jfasilitas)
                            .addComponent(jpemilik)
                            .addComponent(jtelp)
                            .addComponent(jtipekos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jexit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jnext))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jreset)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcari))
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnamakos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtipekos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jfasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jpemilik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtambah)
                            .addComponent(jedit)
                            .addComponent(jhapus)
                            .addComponent(jreset)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jalamatActionPerformed

    private void jtipekosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtipekosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtipekosActionPerformed

    private void jtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtambahActionPerformed
        try {
            String sql = "INSERT INTO data VALUES ('"+jnamakos.getText()+"','"+jalamat.getSelectedItem()+"','"+jtipekos.getSelectedItem()+"','"+jharga.getText()+"','"+jfasilitas.getText()+"','"+jtelp.getText()+"','"+jpemilik.getText()+"')";
            java.sql.Connection conn=(Connection)KoneksiInput.ConnectDb();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan();
        kosong();      
    
    }//GEN-LAST:event_jtambahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int baris = jTable1.rowAtPoint(evt.getPoint());
        String namakos =jTable1.getValueAt(baris, 1).toString();
        jnamakos.setText(namakos);
        String alamat = jTable1.getValueAt(baris, 2).toString();
        jalamat.setSelectedItem(alamat);
        String tipe=jTable1.getValueAt(baris, 3).toString();
        jtipekos.setSelectedItem(tipe);
        String harga = jTable1.getValueAt(baris, 4).toString();
        jharga.setText(harga);
        String fasilitas = jTable1.getValueAt(baris, 5).toString();
        jfasilitas.setText(fasilitas);
        String telp = jTable1.getValueAt(baris, 6).toString();
        jtelp.setText(telp);
        String pemilik = jTable1.getValueAt(baris, 7).toString();
        jpemilik.setText(pemilik);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhapusActionPerformed
       try {
            // TODO add your handling code here:
            String sql ="delete from data where nama='"+jnamakos.getText()+"'";
            java.sql.Connection conn=(Connection)KoneksiInput.ConnectDb();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Telah Di Hapus");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan();
        kosong();
    }//GEN-LAST:event_jhapusActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
       reset();
    }//GEN-LAST:event_jresetActionPerformed

    private void jeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditActionPerformed
        try {
            String sql3 ="UPDATE data SET nama = '"+jnamakos.getText()+"', alamat = '"+jalamat.getSelectedItem()+"', tipe = '"+jtipekos.getSelectedItem()+"', harga= '"+jharga.getText()+"',fasilitas='"+jfasilitas.getText()+"', telepon = '"+jtelp.getText()+"', pemilik = '"+jpemilik.getText()+"' WHERE nama = '"+jnamakos.getText()+"'";
            java.sql.Connection conn=(Connection)KoneksiInput.ConnectDb();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql3);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        tampilkan();
        kosong();
    }//GEN-LAST:event_jeditActionPerformed

    private void jcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcariActionPerformed
    
    }//GEN-LAST:event_jcariActionPerformed

    private void jcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcariMouseClicked
        
            
    }//GEN-LAST:event_jcariMouseClicked

    private void jcaridataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcaridataActionPerformed
        
    }//GEN-LAST:event_jcaridataActionPerformed

    private void jcaridataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcaridataMouseReleased
       jcaridata.getDocument().addDocumentListener(new DocumentListener() {
            TableRowSorter rowSorter = new TableRowSorter(jTable1.getModel());
            public void insertUpdate(DocumentEvent e) {
                String text = jcaridata.getText();
                    jTable1.setRowSorter(rowSorter);
                rowSorter.setRowFilter(RowFilter.regexFilter(jcaridata.getText()));
            }
 
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jcaridata.getText();
                   jTable1.setRowSorter(rowSorter);
                rowSorter.setRowFilter(RowFilter.regexFilter(jcaridata.getText()));
 
            }
 
            @Override
            public void changedUpdate(DocumentEvent e) {
                String text = jcaridata.getText();
                   
                jTable1.setRowSorter(rowSorter);
                rowSorter.setRowFilter(RowFilter.regexFilter(jcaridata.getText()));
            }
       });  
    }//GEN-LAST:event_jcaridataMouseReleased

    private void jnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnextMouseClicked
        // TODO add your handling code here:
         cek_kamar rgf = new  cek_kamar();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   
    }//GEN-LAST:event_jnextMouseClicked

    private void jexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jexitMouseClicked
        // TODO add your handling code here:
        utama rgf = new  utama();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_jexitMouseClicked

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jalamat;
    private javax.swing.JButton jcari;
    private javax.swing.JTextField jcaridata;
    private javax.swing.JButton jedit;
    private javax.swing.JButton jexit;
    private javax.swing.JTextField jfasilitas;
    private javax.swing.JButton jhapus;
    private javax.swing.JTextField jharga;
    private javax.swing.JTextField jnamakos;
    private javax.swing.JButton jnext;
    private javax.swing.JTextField jpemilik;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jtambah;
    private javax.swing.JTextField jtelp;
    private javax.swing.JComboBox<String> jtipekos;
    // End of variables declaration//GEN-END:variables

private void tampilkan() {
        DefaultTableModel model = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
        return false;
    }
        };
        model.addColumn("NO");
        model.addColumn("NAMA");
        model.addColumn("ALAMAT");
        model.addColumn("TIPE");
        model.addColumn("HARGA");
        model.addColumn("FASILITAS");
        model.addColumn("TELEPON");
        model.addColumn("PEMILIK");

        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql2 = "select * from data";
            java.sql.Connection conn=(Connection)KoneksiInput.ConnectDb();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql2);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
             jTable1.setModel(model);
        } catch (Exception e) {
        }
        }
    
private void reset(){
           jnamakos.setText("");
           jharga.setText("");
           jfasilitas.setText("");
           jtelp.setText("");
           jpemilik.setText("");
    }
private void kosong(){
           jnamakos.setText(null);
           jharga.setText(null);
           jfasilitas.setText(null);
           jtelp.setText(null);
           jpemilik.setText(null);

    }
}