package BinaryTree.Downloads;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class BTReeGUI extends JFrame {

  private JPanel contentPane;
  private JTextField textField;
  private JLabel lblNewLabel;
  private JLabel lblNewLabel_1;
  private JLabel lblNewLabel_2;
  private JLabel lblNewLabel_3;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          BTReeGUI frame = new BTReeGUI();
          frame.setVisible(true);
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public BTReeGUI() {
    setTitle("B-Tree Application (Beta)");
    BTreeMain1<Integer> t = new BTreeMain1<>();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JButton btnNewButton = new JButton("INSERT");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          Integer data = Integer.parseInt(textField.getText());
          t.insert(data);
          textField.setText("");
          textField.requestFocus();
          JOptionPane.showMessageDialog(null, data + " is added to the Tree!");
        } catch (Exception e1) {
          JOptionPane.showMessageDialog(null, "Please enter a valid integer!");
        }
      }
    });
    btnNewButton.setBounds(10, 213, 89, 23);
    contentPane.add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("DELETE");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          Integer data = Integer.parseInt(textField.getText());
          t.delete(data);
          textField.setText("");
          textField.requestFocus();
          JOptionPane.showMessageDialog(null, data + " is deleted to the Tree!");
        } catch (Exception e1) {
          JOptionPane.showMessageDialog(null, "Please enter a valid integer!");
        }
      }
    });
    btnNewButton_1.setBounds(173, 213, 89, 23);
    contentPane.add(btnNewButton_1);
    
    JButton btnNewButton_2 = new JButton("VIEW");
    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        lblNewLabel.setText(t.preOrder());
        lblNewLabel_1.setText(t.inOrder());
        lblNewLabel_2.setText(t.postOrder());
        lblNewLabel_3.setText(t.levelOrder());
      }
    });
    btnNewButton_2.setBounds(335, 213, 89, 23);
    contentPane.add(btnNewButton_2);
    
    textField = new JTextField();
    textField.setBounds(173, 176, 86, 20);
    contentPane.add(textField);
    textField.setColumns(10);
    
    lblNewLabel = new JLabel("PreOrder Traversal of the Tree");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBackground(Color.LIGHT_GRAY);
    lblNewLabel.setBounds(10, 11, 414, 31);
    contentPane.add(lblNewLabel);
    
    lblNewLabel_1 = new JLabel("InOrder Traversal of the Tree");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setBackground(Color.GRAY);
    lblNewLabel_1.setBounds(10, 53, 414, 31);
    contentPane.add(lblNewLabel_1);
    
    lblNewLabel_2 = new JLabel("PostOrder Traversal of the Tree");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setBackground(Color.DARK_GRAY);
    lblNewLabel_2.setBounds(10, 95, 414, 31);
    contentPane.add(lblNewLabel_2);
    
    lblNewLabel_3 = new JLabel("");
    lblNewLabel_3.setBounds(186, 151, 46, 14);
    contentPane.add(lblNewLabel_3);
  }

}
