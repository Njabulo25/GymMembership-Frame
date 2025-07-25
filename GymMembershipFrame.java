
package gymMembershipFrame.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class GymMembershipFrame extends JFrame
{
    //Declare all components.
    
    //Declare 14 Panels.
    private JPanel mainPnl;
    private JPanel headingPnl;
    private JPanel headingAndClientDetailsPnl;
    private JPanel clientDetailsPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractOptionsPnl;
    private JPanel typeOfContractPnl;
    private JPanel personalTrainerPnl;
    private JPanel contractOptionsAndCommentsPnl;
    private JPanel commentsPnl;
    private JPanel btnPnl;
    
    //Declare Labels.
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel idNoLabel;
    private JLabel genderLabel;
    private JLabel typeOfContarctLabel;
    private JLabel personalTrainerLabel;
    
    //Declare Fields.
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField idNoFields;
    
    //Declare ComboBox.
    private JComboBox genderCombobox;
    
    //Declare 3 Radio Buttons and buttonGroup.
    private JRadioButton monthToMontRdBtn;
    private JRadioButton sixMonthsRdBtn;
    private JRadioButton annualRdBtn;
    private ButtonGroup btnGroup;
    
    //Declare checkbox.
    private JCheckBox personalTrainerChckBx;
    
    //Declare textArea and JScrollPane.
    private JTextArea commentArea;
    private JScrollPane commentScroll;
    
    //Declare Button.
    private JButton applyBtn;

    public GymMembershipFrame()
    {
        //Frame settings.
        setTitle("Gym Membership");
        setSize(500, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        
        //Initialize Panels.
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        headingAndClientDetailsPnl = new JPanel(new BorderLayout());
        
        clientDetailsPnl = new JPanel(new GridLayout(4,1,1, 1));
        clientDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,1),"Client details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractOptionsPnl =  new JPanel(new GridLayout(2,1,1,1));
        contractOptionsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,1),"Contract options"));
        typeOfContractPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractOptionsAndCommentsPnl = new JPanel(new GridLayout(2,1));
        commentsPnl = new JPanel(new GridLayout());
        commentsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,1),"Comments"));
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        mainPnl = new JPanel(new BorderLayout());
        
        //Initialize Labels
        headingLabel = new JLabel("Membership Form");
        headingLabel.setFont(new Font(Font.SANS_SERIF,Font.BOLD + Font.ITALIC,20));
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLabel = new JLabel("Name: ");
        surnameLabel = new JLabel("Surname: ");;
        idNoLabel = new JLabel("id no: ");;
        genderLabel = new JLabel("gender: ");;
        typeOfContarctLabel = new JLabel("Tpe of contract: ");;
        personalTrainerLabel = new JLabel("Select the checkbox if you need personal trainer ");;
        
        //Initialize Fields.
        nameField = new JTextField(15);
        nameField.setFocusable(true);
        
        surnameField = new JTextField(15);
        surnameField.setFocusable(true);
        
        idNoFields = new JTextField(15);
        idNoFields.setFocusable(true);
    
        //Initialize ComboBox.
        genderCombobox = new JComboBox();
        genderCombobox.addItem("Male");
        genderCombobox.addItem("Female");
    
        //Initialize 3 Radio Buttons and buttonGroup.
        monthToMontRdBtn = new JRadioButton("Month-to-Month");
        sixMonthsRdBtn = new JRadioButton("Six Months");
        annualRdBtn = new JRadioButton("Annual");
        
        btnGroup = new ButtonGroup();
        btnGroup.add(monthToMontRdBtn);
        btnGroup.add(sixMonthsRdBtn);
        btnGroup.add(annualRdBtn);
    
        //Initialize checkbox.
        personalTrainerChckBx = new JCheckBox();
    
        //Initialize textArea and JScrollPane.
        commentArea = new JTextArea(30, 50);
        commentScroll = new JScrollPane(commentArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
        //Initialize Button.
        applyBtn = new JButton("Apply");
        
        //Add components.
        //Nort Panel
        headingPnl.add(headingLabel);
        
        namePnl.add(nameLabel);
        namePnl.add(nameField);
        
        surnamePnl.add(surnameLabel);
        surnamePnl.add(surnameField);
        
        idNoPnl.add(idNoLabel);
        idNoPnl.add(idNoFields);
        
        genderPnl.add(genderLabel);
        genderPnl.add(genderCombobox);
        
        clientDetailsPnl.add(namePnl);
        clientDetailsPnl.add(surnamePnl);
        clientDetailsPnl.add(idNoPnl);
        clientDetailsPnl.add(genderPnl);
       
        headingAndClientDetailsPnl.add(headingPnl, BorderLayout.NORTH);
        headingAndClientDetailsPnl.add(clientDetailsPnl,BorderLayout.CENTER); // --- end of First north Panel.

        typeOfContractPnl.add(typeOfContarctLabel); // ---Start of Second Center Panel.
        typeOfContractPnl.add(monthToMontRdBtn);
        typeOfContractPnl.add(sixMonthsRdBtn);
        typeOfContractPnl.add(annualRdBtn);
        
        personalTrainerPnl.add(personalTrainerLabel);
        personalTrainerPnl.add(personalTrainerChckBx);
        
        contractOptionsPnl.add(typeOfContractPnl);
        contractOptionsPnl.add(personalTrainerPnl);
        
        commentsPnl.add(commentScroll);
        
        contractOptionsAndCommentsPnl.add(contractOptionsPnl);
        contractOptionsAndCommentsPnl.add(commentsPnl); // --- end of Second Center Panel
        
        btnPnl.add(applyBtn); // -- Last Sout Panel
        
        mainPnl.add(headingAndClientDetailsPnl, BorderLayout.NORTH);
        mainPnl.add(contractOptionsAndCommentsPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add to the frame
        add(mainPnl);
        
        //Frame settings
        setVisible(true); 
    }
    
}
