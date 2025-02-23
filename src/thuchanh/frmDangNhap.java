/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuchanh;

import thuchanh.frmDoDai;
//import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import thuchanh.frmKhoiLuong;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



/**
 *
 * @author LENOVO
 */
public class frmDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    
    private double firstValue = 0;
    private String operator = "";
    private boolean resultDisplayed = false;
    
    public frmDangNhap() {
        initComponents();
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        setLocationRelativeTo(null);
        
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
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonchia = new javax.swing.JButton();
        buttonmu2 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonnhan = new javax.swing.JButton();
        buttonphantram = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttoncong = new javax.swing.JButton();
        buttonphanso = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        buttonxoa = new javax.swing.JButton();
        buttontru = new javax.swing.JButton();
        buttonbang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaLichsu = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        buttoncapnhat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                buttonchiaAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });

        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5));

        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1);

        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button2);

        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button3);

        buttonchia.setText("/");
        buttonchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonchiaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonchia);

        buttonmu2.setText("^2");
        buttonmu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmu2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonmu2);

        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button4);

        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button5);

        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button6);

        buttonnhan.setText("*");
        buttonnhan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                buttonnhanStateChanged(evt);
            }
        });
        buttonnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnhanActionPerformed(evt);
            }
        });
        jPanel2.add(buttonnhan);

        buttonphantram.setText("%");
        buttonphantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonphantramActionPerformed(evt);
            }
        });
        jPanel2.add(buttonphantram);

        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button7);

        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button8);

        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button9);

        buttoncong.setText("+");
        buttoncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncongActionPerformed(evt);
            }
        });
        jPanel2.add(buttoncong);

        buttonphanso.setText("1/x");
        buttonphanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonphansoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonphanso);

        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        jPanel2.add(button0);

        jButton9.setText("+/-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        buttonxoa.setText("C");
        buttonxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonxoaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonxoa);

        buttontru.setText("-");
        buttontru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontruActionPerformed(evt);
            }
        });
        jPanel2.add(buttontru);

        buttonbang.setText("=");
        buttonbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbangActionPerformed(evt);
            }
        });
        jPanel2.add(buttonbang);

        jLabel1.setText("Lịch Sử");

        TextAreaLichsu.setColumns(20);
        TextAreaLichsu.setRows(5);
        TextAreaLichsu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextAreaLichsuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TextAreaLichsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaLichsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TextAreaLichsu);

        jButton2.setText("Lưu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttoncapnhat.setText("Cập nhật");
        buttoncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncapnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttoncapnhat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(buttoncapnhat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Đổi Đơn Vị");

        jMenuItem1.setText("Độ dài");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Khối lượng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Phương Trình");

        jMenuItem3.setText("Phương Trình Bậc 2");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        if (resultDisplayed) {
            txtResult.setText("");  
            resultDisplayed = false;
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (resultDisplayed) {
            txtResult.setText("");  
            resultDisplayed = false;
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_button1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if (resultDisplayed) {
            txtResult.setText("");  
            resultDisplayed = false;
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_button4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try {
        String text = txtResult.getText().trim();

        if (text.matches("-?\\d+")) {
            text = text + ".0";
        } else if (text.matches("-?\\d+\\.0")) {
            text = text.substring(0, text.length() - 2);
        }
        
        txtResult.setText(text);
    } catch (Exception e) {
        txtResult.setText("Error");
        e.printStackTrace();
    }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void buttonchiaAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_buttonchiaAncestorMoved
         
    }//GEN-LAST:event_buttonchiaAncestorMoved

    private void buttonbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbangActionPerformed
try {
    String equation = txtResult.getText().trim();
    String[] parts = equation.split("\\s+"); 

    if (parts.length == 0) {
        txtResult.setText("Error");
        return;
    }

    List<Double> numbers = new ArrayList<>();
    List<String> operators = new ArrayList<>();

    for (int i = 0; i < parts.length; i++) {
        if (parts[i].matches("-?\\d+(\\.\\d+)?")) { // Kiểm tra có phải số không
            double num = Double.parseDouble(parts[i]);

            // Nếu số tiếp theo là "^2" thì tính bình phương
            if (i + 1 < parts.length && parts[i + 1].equals("^2")) {
                num = Math.pow(num, 2);
                i++; // Bỏ qua "^2"
            }

            numbers.add(num);
        } else if (parts[i].matches("[+\\-*/]")) { // Nếu là toán tử +, -, *, /
            operators.add(parts[i]);
        } else {
            txtResult.setText("Error"); // Nếu có ký tự lạ
            return;
        }
    }

    // Xử lý nhân và chia trước
    for (int i = 0; i < operators.size(); i++) {
        if (operators.get(i).equals("*") || operators.get(i).equals("/")) {
            double num1 = numbers.get(i);
            double num2 = numbers.get(i + 1);
            double result;

            if (operators.get(i).equals("*")) {
                result = num1 * num2;
            } else {
                if (num2 == 0) {
                    txtResult.setText("Error (Divide by zero)");
                    return;
                }
                result = num1 / num2;
            }
            numbers.set(i, result);
            numbers.remove(i + 1);
            operators.remove(i);
            i--; // Lùi lại để kiểm tra tiếp
        }
    }

    // Xử lý cộng và trừ sau
    while (!operators.isEmpty()) {
        double num1 = numbers.remove(0);
        double num2 = numbers.remove(0);
        String op = operators.remove(0);
        double result = op.equals("+") ? num1 + num2 : num1 - num2;
        numbers.add(0, result);
    }

    double finalResult = numbers.get(0);
    String resultText = (finalResult % 1 == 0) ? String.valueOf((int) finalResult) : String.valueOf(finalResult);
    txtResult.setText(equation + " = " + resultText);
    resultDisplayed = true;

    // Lưu vào lịch sử
    String history = TextAreaLichsu.getText();
    history += equation + " = " + resultText + "\n";
    TextAreaLichsu.setText(history);

} catch (Exception e) {
    txtResult.setText("Error");
}

    }//GEN-LAST:event_buttonbangActionPerformed

    private void buttonnhanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_buttonnhanStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonnhanStateChanged

    private void buttonchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonchiaActionPerformed
         txtResult.setText(txtResult.getText() + " / ");
    }//GEN-LAST:event_buttonchiaActionPerformed

    private void buttonnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnhanActionPerformed
         txtResult.setText(txtResult.getText() + " * ");
    }//GEN-LAST:event_buttonnhanActionPerformed

    private void buttoncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncongActionPerformed
         txtResult.setText(txtResult.getText() + " + ");
    }//GEN-LAST:event_buttoncongActionPerformed

    private void buttontruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontruActionPerformed
        txtResult.setText(txtResult.getText() + " - ");
    }//GEN-LAST:event_buttontruActionPerformed

    private void buttonmu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmu2ActionPerformed
        txtResult.setText(txtResult.getText() + " ^2 ");

    }//GEN-LAST:event_buttonmu2ActionPerformed

    private void buttonphansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonphansoActionPerformed
                 txtResult.setText(txtResult.getText() + " / ");

    }//GEN-LAST:event_buttonphansoActionPerformed

    private void buttonphantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonphantramActionPerformed
        try {
            double value = Double.parseDouble(txtResult.getText());  
            value = value / 100;  
            txtResult.setText(value + " % = " + value);  
            resultDisplayed = true;
            String history = TextAreaLichsu.getText();
            history += value + " % = " + value + "\n";  
            TextAreaLichsu.setText(history);  
        } catch (Exception e) {
            txtResult.setText("Error");  
        }
    }//GEN-LAST:event_buttonphantramActionPerformed

    private void buttonxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonxoaActionPerformed
        txtResult.setText("");
    }//GEN-LAST:event_buttonxoaActionPerformed

    private void TextAreaLichsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaLichsuMouseClicked
        String selectedHistory = TextAreaLichsu.getSelectedText();
    
        if (selectedHistory != null && !selectedHistory.trim().isEmpty()) {
            txtResult.setText(selectedHistory.trim()); 
            resultDisplayed = false;  
        }
    }//GEN-LAST:event_TextAreaLichsuMouseClicked

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("dulieu.txt", false))) {
        String data = TextAreaLichsu.getText().trim();
        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để lưu!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a", Locale.ENGLISH);
        String timestamp = now.format(formatter);

        String[] lines = data.split("\n");
        for (String line : lines) {
            if (!line.matches("^\\[\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2} (AM|PM)] .*")) { 
                // Nếu dòng chưa có timestamp -> Thêm timestamp
                writer.write("[" + timestamp + "] " + line);
            } else {
                // Nếu dòng đã có timestamp -> Ghi nguyên văn
                writer.write(line);
            }
            writer.newLine();
        }
        writer.newLine();
        JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi lưu dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
        Files.write(Paths.get("dulieu.txt"), new byte[0]);
        TextAreaLichsu.setText("");
        JOptionPane.showMessageDialog(this, "Xóa toàn bộ dữ liệu thành công!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttoncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncapnhatActionPerformed
         try {
             var lines = Files.readAllLines(Paths.get("dulieu.txt"));
        TextAreaLichsu.setText(String.join("\n", lines));
        JOptionPane.showMessageDialog(this, "Tải dữ liệu thành công!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_buttoncapnhatActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new frmDoDai().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new frmKhoiLuong().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new frmPhuongTrinhBac2().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void TextAreaLichsuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextAreaLichsuAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAreaLichsuAncestorAdded

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
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaLichsu;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonbang;
    private javax.swing.JButton buttoncapnhat;
    private javax.swing.JButton buttonchia;
    private javax.swing.JButton buttoncong;
    private javax.swing.JButton buttonmu2;
    private javax.swing.JButton buttonnhan;
    private javax.swing.JButton buttonphanso;
    private javax.swing.JButton buttonphantram;
    private javax.swing.JButton buttontru;
    private javax.swing.JButton buttonxoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
