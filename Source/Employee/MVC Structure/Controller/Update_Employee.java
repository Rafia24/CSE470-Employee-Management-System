/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author User
 */

import java.awt.*;
import java.sql.*;
import javax.swing.*;

import java.awt.event.*;


final class Update_Employee extends Add_Employee implements ActionListener{

    JFrame ff;
    JLabel idd0,idd1,idd2,idd3,idd4,idd5,idd6,idd7,idd8,idd9,idd10,idd11,idd12,idd15,labb0,labb1;
    JTextField tt0,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8,tt9,tt10,tt11;
    JButton bb0,bb1,bb2,bb3; 
    String id_emp;

    Update_Employee(String idaa){
        super(0);
        ff=new JFrame("update Employee details");
        ff.setVisible(true);
        ff.setSize(900,500);
        ff.setLocation(450,250);
        ff.setBackground(Color.white);
        ff.setLayout(null);

        id_emp=idaa;    
        idd15=new JLabel();
        idd15.setBounds(0,0,900,500);
        idd15.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("employee/icons/update.jpg"));
        idd15.setIcon(img);

        idd8 = new JLabel("Update Employee Detail:");
        idd8.setBounds(50,10,500,50);
        idd8.setFont(new Font("serif",Font.ITALIC,40));
        idd8.setForeground(Color.black);
        idd15.add(idd8);
        ff.add(idd15);


        idd1 = new JLabel("Name:");  
        idd1.setBounds(50,100,100,30);
        idd1.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd1);

        tt1=new JTextField();
        tt1.setBounds(200,100,150,30);
        idd15.add(tt1);

        idd2 = new JLabel("Father's Name:");
        idd2.setBounds(400,100,200,30);
        idd2.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd2);

        tt2=new JTextField();
        tt2.setBounds(600,100,150,30);
        idd15.add(tt2);

        idd3= new JLabel("Address:");
        idd3.setBounds(50,150,100,30);
        idd3.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd3);

        tt3=new JTextField();
        tt3.setBounds(200,150,150,30);
        idd15.add(tt3);

        idd4= new JLabel("Mobile No:");
        idd4.setBounds(400,150,100,30);
        idd4.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd4);

        tt4=new JTextField();
        tt4.setBounds(600,150,150,30);   
        idd15.add(tt4);

        idd5= new JLabel("Email Id:");
        idd5.setBounds(50,200,100,30);
        idd5.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd5);

        tt5=new JTextField();
        tt5.setBounds(200,200,150,30);
        idd15.add(tt5);

        idd6= new JLabel("Education:");
        idd6.setBounds(400,200,100,30);
        idd6.setFont(new Font("serif",Font.BOLD,20));    
        idd15.add(idd6);

        tt6=new JTextField();
        tt6.setBounds(600,200,150,30);
        idd15.add(tt6);

        idd7= new JLabel("Job Post:");
        idd7.setBounds(50,250,100,30);
        idd7.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd7);

        tt7=new JTextField();
        tt7.setBounds(200,250,150,30);
        idd15.add(tt7);

        idd9= new JLabel("Code :");
        idd9.setBounds(400,250,100,30);  
        idd9.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd9);

        tt8=new JTextField();
        tt8.setBounds(600,250,150,30);
        idd15.add(tt8);

        idd10= new JLabel("Employee Id:");
        idd10.setBounds(50,300,150,30);
        idd10.setFont(new Font("serif",Font.BOLD,20));
        idd15.add(idd10);
        ff.setVisible(false);
        tt9=new JTextField();
        tt9.setBounds(200,300,150,30);
        idd15.add(tt9);

        bb0=new JButton("update");
        bb0.setBounds(250,400,100,30);
        bb0.addActionListener(this);
        idd15.add(bb0);

        bb1=new JButton("Cancel");
        bb1.setBounds(450,400,100,30);
        bb1.addActionListener(this);
        idd15.add(bb1);

        showData(idaa);
    }

    int i=0;
    String age,dat;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from employee_details where emp_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                ff.setVisible(true);
                i=1;

                tt1.setText(rs.getString(1));
                tt2.setText(rs.getString(2));
                tt3.setText(rs.getString(5));
                tt4.setText(rs.getString(6));
                tt5.setText(rs.getString(7));
                tt6.setText(rs.getString(8));
                tt7.setText(rs.getString(9));
                tt8.setText(rs.getString(10));
                tt9.setText(rs.getString(11));

                age=rs.getString(3);
                dat=rs.getString(4);
            }
            if(i==0)
                JOptionPane.showMessageDialog(null,"Id not found");
            Search_Employee search_Employee = new Search_Employee();
        }catch(HeadlessException | SQLException ex){}
        ff.setVisible(true);
        ff.setSize(900,500);
        ff.setLocation(400,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==bb0 && i==1){
            try{
                conn con = new conn();
                String str = "update employee_details set name='"+tt1.getText()+"',fname='"+tt2.getText()+"',age='"+age+"',dob='"+dat+"',address='"+tt3.getText()+"',phone='"+tt4.getText()+"',email_id='"+tt5.getText()+"',education='"+tt6.getText()+"',post='"+tt7.getText()+"',code='"+tt8.getText()+"',emp_id='"+tt9.getText()+"' where emp_id='"+id_emp+"'";
                con.s.executeUpdate(str);
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                ff.setVisible(false);
                Search_Employee search_Employee;
                search_Employee = new Search_Employee();
            }catch(HeadlessException | SQLException e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==bb1){
            ff.setVisible(false);
            details d=new details();
        }
    }
   

    public static void main(String[] args){
        Update_Employee update_Employee = new Update_Employee("Update Employee");
    }
}
