import javax.swing.*; // for Jframe
//import javax.swing.event.*;
import java.awt.*; // for Font 
//Abstract Window Toolkit (AWT) is Java's original platform-dependent windowing, graphics, and user-interface widget toolkit preceding Swing
import java.awt.event.*; // for window adapter  
import java.sql.*; // for resultSet, Connection, Statement 
import java.io.*; 
class FrameS extends JFrame  implements ActionListener
{
 	JLabel label=new JLabel("Employee Payroll System");


	Font headingFont=new Font("Times",Font.BOLD,34); // main headings import java.awt.*;
       Font boxFont=new Font("Times",Font.BOLD,20); // box headings
	Font myNameFont=new Font("Times",Font.BOLD,15);
	
	JLabel labelid,labelname,labelcity,labelsex,labelsal,labelsubmit,labelEmployee;  //  labels 
 	 JTextField txtid,txtname,txtcity,txtsal; // Name of text fields
       JRadioButton rbmale,rbfemale;
       JButton btnadd,btnsave,btnupdate,btndelete,btnexit,btnnext,btnprev,btnlast,btnfirst; // button names
        
       String gen;
       ResultSet rs=null;  // import java.sql.*;
       Connection con=null; // null because next will depends on as declare
       Statement stmt=null;

	FrameS()
       {
       // this is display in a Frame titlebar.
      // super("Employees Information Details");  // calling immidiate parent class
	    
	 addWindowListener(new WindowAdapter(){ //import java.awt.event.*;
                public void windowClosing(WindowEvent we)
                {
                System.exit(0); // for window close when cross the window
                }
       });

	// for my name button start
   	 setLayout(null); // this is for below information is set for setBounds
	//labelEmployee=new JLabel("Developed By : Samad Bhuiyan"); 
	labelEmployee=new JLabel("MEL Group"); 
       add(labelEmployee);
       labelEmployee.setBounds(20,540,350,15); // left, top, right, bottom
	 labelEmployee.setFont(myNameFont);
	// for my name button end

	// for heading button start
	add(label); // a label defined below will add to the window
	label.setFont(headingFont); // font for emploee Payroll System
	label.setBounds(200,50,500,30);  // this is for emploee Payroll System
	// for heading button end
	
	// for first button ID
	labelid=new JLabel("ID"); // NAME Declare
	labelid.setBounds(200,140,100,20); // position declare for ID only
	labelid.setFont(boxFont); // box font type
	add(labelid); // add the box in window
	txtid=new JTextField(20); // text at the setbox  for writing
	txtid.setBounds(300,140,100,20); // text box size
	add(txtid);
	
	// for first button Name
	labelname=new JLabel("Name"); // NAME Declare
	labelname.setBounds(200,180,100,20); // position declare for Name only
	labelname.setFont(boxFont); // box font type
	add(labelname); // add the box in window
	txtname=new JTextField(20); // text at the setbox  for writing
	txtname.setBounds(300,180,100,20); // text box size
	add(txtname);
	
	// for first button City
	labelcity=new JLabel("City"); // NAME Declare
	labelcity.setBounds(200,220,100,20); // position declare for City only
	labelcity.setFont(boxFont); // box font type
	add(labelcity); // add the box in window
	txtcity=new JTextField(20); // text at the setbox  for writing
	txtcity.setBounds(300,220,100,20); // text box size
	add(txtcity);

	

	// for first button Salary
	labelsal=new JLabel("Salary"); // NAME Declare
	labelsal.setBounds(200,260,100,20); // position declare for Salary only
	labelsal.setFont(boxFont); // box font type
	add(labelsal); // add the box in window
	txtsal=new JTextField(20); // text at the setbox  for writing
	txtsal.setBounds(300,260,100,20); // text box size
	add(txtsal);

	
       // for first button Sex
	labelsex=new JLabel("Sex"); // NAME Declare
	labelsex.setBounds(200,300,100,20); // position declare for Sex only
	labelsex.setFont(boxFont); // box font type
	add(labelsex); // add the box in window
	//txtsex=new JTextField(20); // text at the setbox  for writing
	//txtsex.setBounds(300,300,100,20); // text box size
	//add(txtsex);
	
	// for male button
	rbmale=new JRadioButton("Male"); // NAME Declare
	rbmale.setBounds(400,300,70,20); // position declare for male only
	add(rbmale); // add the male button
	ButtonGroup buttonGroup=new ButtonGroup(); // create a button group for radio button
	buttonGroup.add(rbmale); // add button to group
	 rbmale.addActionListener(this); // register radio button
       
	// for female button
        rbfemale=new JRadioButton("Female"); // NAME Declare	
        rbfemale.setBounds(480,300,70,20); // position declare for male only	
        add(rbfemale); // add the female button
	buttonGroup.add(rbfemale); // add button to group
	rbfemale.addActionListener(this); // register radio button
	
	// for  add button
	btnadd=new JButton("Add"); // initializa button with its caption
	 btnadd.setBounds(200,400,100,30); // set a particular position on a Frame
	 add(btnadd); // add button on a frame
	btnadd.addActionListener(this); // register  the button

	// for save button
	 btnsave=new JButton("Save"); // initializa button with its caption
	 btnsave.setBounds(310,400,100,30); // set a particular position on a Frame
	add(btnsave);	 // add button on a frame
	 btnsave.addActionListener(this); // register  the button
	
	// for update button
	 btnupdate=new JButton("Update"); // initializa button with its caption
	 btnupdate.setBounds(420,400,100,30); // set a particular position on a Frame
	 add(btnupdate);  // add button on a frame
	 btnupdate.addActionListener(this); // register  the button

	// for Delete button
	btndelete=new JButton("Delete"); // initializa button with its caption
	 btndelete.setBounds(530,400,100,30); // set a particular position on a Frame
	  add(btndelete); // add button on a frame
	 btndelete.addActionListener(this); // register  the button

	// for First button
	btnfirst=new JButton("First"); // initializa button with its caption
	btnfirst.setBounds(200,440,100,30); // set a particular position on a Frame
	add(btnfirst);	// add button on a frame
	btnfirst.addActionListener(this); // register  the button

	
	// for Next button
	 btnnext=new JButton("Next"); // initializa button with its caption
	btnnext.setBounds(310,440,100,30); // set a particular position on a Frame
	 add(btnnext); // add button on a frame
	 btnnext.addActionListener(this); // register  the button

	
	// for Previous button
	btnprev=new JButton("Previous"); // initializa button with its caption
	 btnprev.setBounds(420,440,100,30); // set a particular position on a Frame
	add(btnprev);// add button on a frame
	 btnprev.addActionListener(this); // register  the button
	
	// for Last button
	 btnlast=new JButton("Last"); // initializa button with its caption
	 btnlast.setBounds(530,440,100,30); // set a particular position on a Frame
	add(btnlast); // add button on a frame
	 btnlast.addActionListener(this);// register  the button


	// for Exit button
	 btnexit=new JButton("Exit"); // initializa button with its caption
       btnexit.setBounds(360,480,100,30); // set a particular position on a Frame
       add(btnexit); // add button on a frame
      btnexit.addActionListener(this);
        dbOpen();
	
	}

public void actionPerformed(ActionEvent ae)
	{
		try
		{
			
	 		if(ae.getActionCommand()=="Add")
			{
				txtid.setText("");
				txtname.setText("");
				txtcity.setText("");
				txtsal.setText("");
			}
			if(ae.getActionCommand()=="Update")
			{
				stmt.executeUpdate("UPDATE employee SET name='" + txtname.getText() + "',city='" + txtcity.getText() + "',sal=" + txtsal.getText() + ",sex='"+gen+"' WHERE id=" + txtid.getText() + "");
				dbClose();
				dbOpen();
			}
			if(ae.getActionCommand()=="Delete")
			{
				stmt.executeUpdate("DELETE FROM employee WHERE id=" + txtid.getText() + "");			
				dbClose();
				dbOpen();
			}	
			if(ae.getActionCommand()=="Save")
			{
				stmt.executeUpdate("INSERT INTO employee VALUES('" + txtid.getText() + "','" + txtname.getText() + "','" + txtcity.getText() + "'," + txtsal.getText() + ",'"+gen+"')");
				dbClose();
				dbOpen();
			}
			if(ae.getActionCommand()=="Next")
			{
				if(rs.next())
				{
					setText();
                 			setText();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You are At Already Last Record", "Message", JOptionPane.ERROR_MESSAGE);	
                  		}
			}
			if(ae.getActionCommand()=="Previous")
			{
				if(rs.previous())
				{
                  			setText();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You Are At Already First Record", "Message", JOptionPane.ERROR_MESSAGE);
                  		}
			}
			if (ae.getActionCommand()=="First")
			{
				if(rs.first())
				{
					setText();
				}
			}
			if (ae.getActionCommand()=="Last")
			{
				if(rs.last())
				{
					setText();
				}
			}
			if(ae.getActionCommand()=="Exit")
			{
			System.exit(0);		
			}
			if(ae.getActionCommand()=="Female")
			 {
				gen="Female";
			 }
			 else
			 {
				gen="Male";
			 }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


public void dbOpen()
    {
	
   try
       {
	   System.out.println("Registering JDBC driver...");
	   Class.forName("com.mysql.jdbc.Driver");
	   
	   System.out.println("Connecting to database...");
	   con = DriverManager.getConnection("jdbc:mysql://localhost/PAYROLLS", "root", "Tahmina0");
	    System.out.println("Creating statement...");
	   stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   rs = stmt.executeQuery("Select * from employee");
	   if(rs.next())
	       setText();
       }catch(Exception e){}
    }
    public void dbClose()
    {
	try{stmt.close();
	    rs.close();
	    con.close();
	}catch(Exception e){}
    }
    public void setText(){
	try{
	    txtid.setText(rs.getString(1));
	    txtname.setText(rs.getString(2));
	    txtcity.setText(rs.getString(3));
	    txtsal.setText(rs.getString(4));
	    if(rs.getString(5).equals("Male")) 
		{	
		    rbmale.setSelected(true);
		}	
	    else
		{
		    rbfemale.setSelected(true);
		}
	}catch(Exception ex){}		
    }
    
}


public class payrollS
{
    public static void main(String ar[])throws Exception
    {
	
        // create a object of FrameS class in main method
        FrameS fs=new FrameS();
	
        // set frame size
        fs.setSize(800,600);
	
        // set frame visible true
        fs.setVisible(true);
        //set look and feel for frame
	UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    }
}
