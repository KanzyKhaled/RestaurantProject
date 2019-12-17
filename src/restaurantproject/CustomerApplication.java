/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

/**
 *
 * @author koky
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart.Data;
import javax.swing.JFrame;
import javax.swing.JLabel;
 import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CustomerApplication  extends JFrame implements ActionListener {


public JLabel  titlelable;
public JPanel genralpanel;
public JPanel headpanel;
public JLabel notelabel;
public JLabel userlabel;
public JTextField  usertextfield;
public JLabel  passwordlabel;
public JTextField passwordtextfield;
public JPanel personalpanel;
public JLabel namelabel;
public JTextField  nametextnfiled;
public JLabel addresslabel;
public JTextField  addresstextfield ;
public JLabel mobilelabel;
public JTextField  mobiletextfiled;
public JButton sub ;
public  ButtonGroup   martialstatuebuttongroup;
public  ButtonGroup   sexbuttongroup;
public   GridBagConstraints gridBagConstraints; 
Connection conn;
PreparedStatement pst;
    public CustomerApplication(){
         createandshowGUI();
         this.setVisible(true);
         this.setLocationRelativeTo(null);
    }
        
       private void createandshowGUI() {
         martialstatuebuttongroup =new ButtonGroup();
         sexbuttongroup =new ButtonGroup();
           gridBagConstraints = null;
         //background
        
          
         //1 head panel
         headpanel=new JPanel();
         headpanel.setLayout(new GridBagLayout());
      //background
        // title
         titlelable= new   JLabel ();
         titlelable.setFont(new java.awt.Font("tahoma",1,45)); 
         titlelable.setForeground(new java.awt.Color(0));
         titlelable.setText("Application for customer");
          gridBagConstraints =new java.awt.GridBagConstraints();
         gridBagConstraints.gridx=1;
         gridBagConstraints.gridy=0;
         gridBagConstraints.insets=new java.awt.Insets(60, 100, 0,178);
         headpanel.add(titlelable, gridBagConstraints);
        
        //2 gentral panel
        JPanel genralpanel =new JPanel();
        genralpanel.setLayout (new GridBagLayout());
        //
         notelabel=new JLabel();
        notelabel.setText("please fill out this application clearly:");
        notelabel.setFont(new java.awt.Font("tahoma",1,15));
        gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        gridBagConstraints.gridwidth=2;
        gridBagConstraints.insets=new Insets(1,11,0,0);
         genralpanel.add(notelabel, gridBagConstraints);
     
       //
                 
           userlabel= new   JLabel ();
           userlabel.setText("User_name");
          gridBagConstraints =new java.awt.GridBagConstraints();
         gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=1;
         gridBagConstraints.ipadx=23;
         gridBagConstraints.insets=new java.awt.Insets(18, 18, 0, 0);
        genralpanel.add(userlabel , gridBagConstraints);         
       //
         usertextfield = new   JTextField ();
         gridBagConstraints =new java.awt.GridBagConstraints();
         usertextfield.getText();
         gridBagConstraints.gridx=1;
         gridBagConstraints.gridy=1;
            gridBagConstraints.gridheight=2;
             gridBagConstraints.ipadx=90;
              
         gridBagConstraints.insets=new java.awt.Insets(18, 18, 0, 0);
         genralpanel.add(usertextfield,  gridBagConstraints );
       //
          passwordlabel= new   JLabel ();
          passwordlabel.setText("Password");
          gridBagConstraints =new java.awt.GridBagConstraints();
         gridBagConstraints.gridx=6;
         gridBagConstraints.gridy=1;
          gridBagConstraints.ipadx=10;
          gridBagConstraints.insets=new java.awt.Insets(18, 27, 0, 0);
         genralpanel. add( passwordlabel, gridBagConstraints);         
       //
         passwordtextfield = new   JTextField ();
         gridBagConstraints =new java.awt.GridBagConstraints();
         passwordtextfield.getText();
         gridBagConstraints.gridx=8;
         gridBagConstraints.gridy=1;
         gridBagConstraints.gridheight=2;
         gridBagConstraints.ipadx=90;
         gridBagConstraints.insets=new java.awt.Insets(15, 4, 0, 52);
         genralpanel.add(passwordtextfield, gridBagConstraints);
       //end panel2
      //3 personal panel
      JPanel personalpanel=new JPanel();
      personalpanel.setLayout(new GridBagLayout());
      //
         namelabel=new JLabel();
         namelabel.setText("Fullname");
         gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=1;
         gridBagConstraints.gridwidth=3;
         gridBagConstraints.ipadx=55;
         gridBagConstraints.insets=new java.awt.Insets(9, 11, 0, 0);
        personalpanel.add(namelabel, gridBagConstraints);
                 
         nametextnfiled = new   JTextField ();
         gridBagConstraints =new java.awt.GridBagConstraints();
         nametextnfiled .getText();
         gridBagConstraints.gridx=4;
         gridBagConstraints.gridy=1;
         gridBagConstraints.gridheight=2;
         gridBagConstraints.gridwidth=34;
         gridBagConstraints.ipadx=492;
         gridBagConstraints.insets=new java.awt.Insets(6, 4, 0, 0);
         personalpanel.add(nametextnfiled, gridBagConstraints); 
      //
        addresslabel=new JLabel();
       addresslabel.setText("Adress");
        gridBagConstraints =new java.awt.GridBagConstraints();
       gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=3;
         gridBagConstraints.gridwidth=3;
         gridBagConstraints.ipadx=62;
         gridBagConstraints.insets=new java.awt.Insets(14, 11, 0, 0);
        personalpanel.add(addresslabel, gridBagConstraints);
        
        addresstextfield = new   JTextField ();
         gridBagConstraints =new java.awt.GridBagConstraints();
         addresstextfield.getText();
         gridBagConstraints.gridx=4;
         gridBagConstraints.gridy=3;
         gridBagConstraints.gridheight=2;
         gridBagConstraints.gridwidth=34;
         gridBagConstraints.ipadx=492;
         gridBagConstraints.insets=new java.awt.Insets(11, 4, 0, 0);
         personalpanel.add(addresstextfield, gridBagConstraints); 
       
       //
       
           mobilelabel=new JLabel();
           mobilelabel.setText("Mobile");
        gridBagConstraints =new java.awt.GridBagConstraints();
       gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=5;
         gridBagConstraints.gridwidth=13;
         gridBagConstraints.ipadx=87;
         gridBagConstraints.insets=new java.awt.Insets(21, 11, 0, 0);
        personalpanel.add(mobilelabel, gridBagConstraints);
        
        mobiletextfiled = new   JTextField ();
         gridBagConstraints =new java.awt.GridBagConstraints();
         mobiletextfiled.getText();
         gridBagConstraints.gridx=4;
         gridBagConstraints.gridy=5;
         gridBagConstraints.gridheight=2;
          gridBagConstraints.gridwidth=11;
         gridBagConstraints.ipadx=90;
         gridBagConstraints.insets=new java.awt.Insets(18, 4, 0, 0);
         personalpanel.add(mobiletextfiled, gridBagConstraints); 
    
               //   
        sub = new JButton("Save"); 
        sub.addActionListener(this);
        sub.setFont(new java.awt.Font("tahoma",1,20));
        sub.setBackground(Color.white);
        gridBagConstraints.gridx=28;
         gridBagConstraints.gridy=14;
          gridBagConstraints.gridwidth=2;
          gridBagConstraints.gridheight=6;
          gridBagConstraints.ipadx=20;
          gridBagConstraints.ipady=25;
         gridBagConstraints.insets=new java.awt.Insets(15, 11, 0, 0);
         personalpanel.add( sub, gridBagConstraints); 
    
    
        
    
       //end panel3
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());
   
   
       
       //
         gridBagConstraints =new java.awt.GridBagConstraints();
         gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=0;
         gridBagConstraints.anchor=java.awt.GridBagConstraints.NORTHWEST;
           gridBagConstraints.insets=new java.awt.Insets(0,24, 0, 10);
         getContentPane().add(headpanel, gridBagConstraints); 
        //
        gridBagConstraints =new java.awt.GridBagConstraints();
         gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=1;
         gridBagConstraints.ipadx=2;
         gridBagConstraints.insets=new java.awt.Insets(18, 24, 0, 10);
         getContentPane().add(genralpanel, gridBagConstraints);
         
         gridBagConstraints =new java.awt.GridBagConstraints();
         gridBagConstraints.gridx=0;
         gridBagConstraints.gridy=2;
        gridBagConstraints.insets=new java.awt.Insets(31, 24, 11, 10);
         getContentPane().add(personalpanel, gridBagConstraints);
       pack();
       
       
       
  /*     
          
          String url="jgbc:sqlserver://localhost:1433;databaseName=Restaurant[sa on Default schema]";
          String username="sa";
          String password="123";
          Connection con=DriverManager.getConnection(url, username, password);
          Statement stmt =(Statement) con.createStatement();
          String Query= "INSERT INTO customers( username,password,fullname,adress,mobile,) VALUES ('"+usertextfield.getText()+"',"
           + " '"+passwordtextfield.getText()+"','"+nametextnfiled.getText()+"','"+addresstextfield.getText()+"','"+mobiletextfiled.getText()+"')";
           
           JOptionPane.showMessageDialog(null, "Employee Add To database");
             usertextfield.setText(null);
              passwordtextfield.setText(null);
              nametextnfiled.setText(null);
              addresstextfield.setText(null);
              mobiletextfiled .setText(null);
      } 
      catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }try{
          
          String url="jgbc:sqlserver://localhost:1433;databaseName=Restaurant[sa on Default schema]";
          String username="sa";
          String password="123";
          Connection con=DriverManager.getConnection(url, username, password);
          Statement stmt =(Statement) con.createStatement();
          String Query= "INSERT INTO customers( username,password,fullname,adress,mobile,) VALUES ('"+usertextfield.getText()+"',"
           + " '"+passwordtextfield.getText()+"','"+nametextnfiled.getText()+"','"+addresstextfield.getText()+"','"+mobiletextfiled.getText()+"')";
           
           JOptionPane.showMessageDialog(null, "Employee Add To database");
             usertextfield.setText(null);
              passwordtextfield.setText(null);
              nametextnfiled.setText(null);
              addresstextfield.setText(null);
              mobiletextfiled .setText(null);
      } 
      catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }

   */
  
    
   /* public static void main(String[] args) {
           
           java.awt.EventQueue.invokeLater(new Runnable(){
           public void run(){
           new CustomerApplication().setVisible(true);}});
        
       }*/

    }

    /**
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
       if(event.getActionCommand().equals("Save")){
           try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
              String sql ="Insert into customers (username,password,fullname,address,mobilenum) values('"+usertextfield.getText()+"'," +
                        " '"+passwordtextfield.getText()+"','"+nametextnfiled.getText()+"','"+addresstextfield.getText()+"','"+mobiletextfiled.getText()+"')";   
           
           try{
               pst = conn.prepareStatement(sql);
              
               pst.execute();
               JOptionPane.showMessageDialog(null,"Data Saved Sucessfully");
                  
           }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e);
                   }
       }           
           
    }       
}           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           /*     try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 String url="jdbc:sqlserver://localhost:1433;databaseName=Restaurant [sa on Default schema]"; 
           // String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";

                String username="sa";
                String password="123";
                Connection con=DriverManager.getConnection(url, username, password);
                Statement stmt =(Statement) con.createStatement();
                String sql= "INSERT INTO customers( username,password,fullname,address,mobilenum) VALUES ('"+usertextfield.getText()+"',"
                 + " '"+passwordtextfield.getText()+"','"+nametextnfiled.getText()+"','"+addresstextfield.getText()+"','"+mobiletextfiled.getText()+"')";
                  con.close();
                  JOptionPane.showMessageDialog(null, "Employee Add To database");
                    usertextfield.setText(null);
                    passwordtextfield.setText(null);
                    nametextnfiled.setText(null);
                    addresstextfield.setText(null);
                    mobiletextfiled .setText(null);
            } 
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }     catch (ClassNotFoundException ex) {
                      Logger.getLogger(CustomerApplication.class.getName()).log(Level.SEVERE, null, ex);
                  }
          }

              }*/
          
    
    
    
    