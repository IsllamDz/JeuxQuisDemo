package tp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Classe1 extends quizz {
	boolean joure=true; // true :mode joure //false :mode admin
	int l=0; //indice ta3 
	int foix=0;//ta3 mod pass ch7al man mara ghlat
	int tabquis[]={-1,-1,-1,-1,-1}; //tar9im ta3 las2ila 
	int tabtype[]={-1,-1,-1,-1,-1}; // type 1 oui 2 
	int tabchoix[]={-1,-1,-1}; //ndiro bih  parmitation les reponce
	String choix[]= {"d","dd","ddd"}; //n7ato fihom les choix
	int tru=0;  //conteur ta3 l ijabat s7a7
	Random r=new Random();
	private JFrame frmQuiz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classe1 window = new Classe1();
					window.frmQuiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Classe1() {
		initialize();
	}

    public void rand()
    {
    	   for (int i=0;i<tabquis.length;i++) { //|
   		 tabquis[i]=-1;                         //| inisalisation 3la jal random
   		 tabtype[i]=-1;                         //|
    	   }
    			Random r =new Random();
    			int c;
    			
    			boolean th;
    			for (c=0;c<tabquis.length;c++)
    			{
    				th=true;
    			while (th){
    				th=false;
    			int val=0+r.nextInt(10);
    			int vall=1+r.nextInt(2);
    		
    			for (int co=0;co<tabquis.length;co++)
    			{
    				
    				if (val==tabquis[co])
    				{
    					th=true;
    				}
    			}
    			if (!th)
    			{
    				tabquis[c]=val;
    				tabtype[c]=vall;
    			
    			}
    			}
    			
    			}
    			
    			}
    public void rand3() {
		tabchoix[0]=-1;
		tabchoix[1]=-1; //inistalisation 3la jal rand
		tabchoix[2]=-1;

		Random r =new Random();
		int c;
		boolean th;
		for (c=0;c<tabchoix.length;c++)
		{
			th=true;
		while (th){
			th=false;	
		int valll=0+r.nextInt(3);
		for (int co=0;co<tabchoix.length;co++)
		{
			
			if (valll==tabchoix[co])
			{
				th=true;
			}
		}
		if (!th)
		{
			tabchoix[c]=valll;
		}
		}
		
		}
		
		}
    
    
    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmQuiz = new JFrame();
		frmQuiz.setBackground(Color.WHITE);
		frmQuiz.setTitle("Quiz");
		frmQuiz.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\w-s\\tp\\IMG\\icon.png"));
		frmQuiz.setBounds(200, 200, 800, 420);
		frmQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuiz.setResizable(false);
		
		
		
		JTextField textField_quis1 = new JTextField(); //li naktbo fih quis 1
		ButtonGroup quis1BoRad = new ButtonGroup();    // ijaba 3la laquis
		
		ButtonGroup re_quis1BoRadrb = new ButtonGroup(); //ijaba fl lo3ba hna quis1
		
		JTextField textField_quis2_1 = new JTextField(); // so2al quis 2 
		JTextField textField_quis2_2 = new JTextField(); // i7timal s7i7
		JTextField textField_quis2_3 = new JTextField();  // galt
		JTextField textField_quis2_4 = new JTextField(); //ghalt
		
		JLabel re_quis2_q = new JLabel("quis   "); // hna yataficha so2al 
		
		ButtonGroup r2_quis2BoRadrb = new ButtonGroup(); // hna ta3 ijaba
		
		ButtonGroup domBoRad = new ButtonGroup(); //domain
		
		ButtonGroup difBoRad = new ButtonGroup(); // dif
		
		ButtonGroup typeBoRad = new ButtonGroup(); //type
		
		
		
		
		         //*********admin******//
		JPanel admin = new JPanel();
		frmQuiz.getContentPane().add(admin, BorderLayout.CENTER);
		admin.setLayout(new BorderLayout(0, 0));
		JPanel dom = new JPanel();   //declaration ta3 les panel
		JPanel dif = new JPanel();
		JPanel type = new JPanel();
		JPanel quis1 = new JPanel();
		JPanel re_quis1 = new JPanel();
		JPanel quis2 = new JPanel();
		JPanel re_quis2 = new JPanel();
		JPanel resultat = new JPanel();
		JPanel pass = new JPanel();
		JDialog n = new JDialog(); //jdalog ta3 password 
		
		dif.setVisible(false);  // visibiliti ta3 les pano
		dom.setVisible(false);
		type.setVisible(false);
		quis1.setVisible(false);
		re_quis1.setVisible(false);
		quis2.setVisible(false);
		re_quis2.setVisible(false);
		resultat.setVisible(false);
		
		admin.add(dom);   //zadna les pano 
		admin.add(dif);
		admin.add(type);
		admin.add(quis1);
		admin.add(re_quis1);
		admin.add(quis2);
		admin.add(re_quis2);
		admin.add(resultat);
		
		JPanel acciul = new JPanel();
		admin.add(acciul, BorderLayout.CENTER);
		acciul.setLayout(new BorderLayout(0, 0));
		
		//***********PASSWORD****************
		pass.setLayout(new BorderLayout(0, 0));
		
		JPanel pass_1 = new JPanel();
		pass.add(pass_1, BorderLayout.CENTER);
		pass_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel text = new JLabel("admin");
		pass_1.add(text);
		
		JTextField admine = new JTextField();
		pass_1.add(admine);
		admine.setColumns(10);
		
		JLabel text1 = new JLabel("password");
		pass_1.add(text1);
		
		JPasswordField password = new JPasswordField();
		pass_1.add(password);
		password.setColumns(10);
		
		JPanel pass_2 = new JPanel();
		pass.add(pass_2, BorderLayout.SOUTH);
		pass_2.setLayout(new BorderLayout(0, 0));
		
		JPanel pass_3 = new JPanel();
		pass_2.add(pass_3, BorderLayout.SOUTH);
		
		JButton ok = new JButton("    ok    ");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(admine.getText().equals("admin")&&password.getText().equals("admin"))
				{
					joure=false;
					JOptionPane.showMessageDialog(frmQuiz, "Entrer avec succes en mode administrateur"); //MSG DIALOG 
					n.dispose(); //tna7i fonatre ta3 password
					foix=0; //inistialisation 
				}else {foix=foix+1; //ki yaglat yzid 1
						admine.setText(""); // ki yaglat yfasilo li katbo
						password.setText("");
					   if (foix==5) { //ki yosal l 5 mo7awalat tata9fal 
						   n.dispose();
						   foix=0;
					   }
					
				}
			}
		});
		pass_3.add(ok);
		
		//********ta3 resultat**************

		resultat.setLayout(new BorderLayout(0, 0));
		
		JPanel res1_panel_1 = new JPanel();
		resultat.add(res1_panel_1, BorderLayout.NORTH);
		
		JLabel imgres = new JLabel(new ImageIcon("IMG\\res.png"));
		res1_panel_1.add(imgres);
		
		JPanel res1_panel_2 = new JPanel();
		res1_panel_2.setBackground(Color.WHITE);
		resultat.add(res1_panel_2);
		res1_panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel imgobjes = new JLabel("");
		imgobjes.setHorizontalAlignment(SwingConstants.CENTER);
		res1_panel_2.add(imgobjes, BorderLayout.CENTER);
	
		JLabel res1 = new JLabel("");
		res1.setForeground(Color.RED);
	
		res1.setBackground(Color.WHITE);
		res1.setFont(new Font("Tahoma", Font.BOLD, 20));
		res1.setHorizontalAlignment(SwingConstants.CENTER);
		res1_panel_2.add(res1, BorderLayout.NORTH);
		
		JPanel res1_panel_3 = new JPanel();
		res1_panel_3.setBackground(Color.WHITE);
		resultat.add(res1_panel_3, BorderLayout.SOUTH);
		res1_panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton rejouer = new JButton("Rejouer");
		rejouer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				admin.remove(re_quis1);
				re_quis1.setVisible(false);
				re_quis2.setVisible(false);
				resultat.setVisible(false);
				acciul.setVisible(true);
				admin.add(acciul);
				frmQuiz.setBounds(200, 200, 800, 420);
			}
		});
		res1_panel_3.add(rejouer, BorderLayout.EAST);
		
		JButton start = new JButton(new ImageIcon("IMG\\quis.png"));
		start.setToolTipText("Start");
		acciul.add(start);
		start.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode()==38)
				{
					admine.setText(""); // inistialisation
					password.setText("");
					n.setBounds(400, 400, 450, 146);  //l7ajm ta3 dialog
					n.getContentPane().add(pass, BorderLayout.CENTER);
					n.show(); // bah yataficha dualog
				}
				
			}
		});
		
		start.setFont(new Font("Tahoma", Font.PLAIN, 33));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		acciul.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("A propos");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "Un jeu simple pour tester l'information dans"+"\n"
												  + " quatre domaines  :Sprot ,Informatique ,Culture"+"\n"
												  + " General et Des Capitales des Pays en trois modes :"+"\n"
												  		+ " Faciles ,Moyens et Difficiles");
			}
		});

		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nous ?!");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "Programme par:\n   *Rettab Nour El Isllam \n      *Ben Siah Oussama Akram \n ");
				
			}
		});
	
		
		panel.add(btnNewButton_1);
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				l=0; //inisalisation 
				tru=0; // inisialisation
				
				admin.remove(acciul);
				dom.setVisible(true);
				admin.add(dom);      
				frmQuiz.setBounds(200, 200, 800, 421);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				 start.setIcon(new ImageIcon("IMG\\quis1.png"));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				start.setIcon(new ImageIcon("IMG\\quis.png"));
			}
		});
		
  //*******quis1*****//
		
        quis1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_quis1_0 = new JPanel();
		quis1.add(panel_quis1_0, BorderLayout.CENTER);
		panel_quis1_0.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_quis1_1 = new JPanel();
		panel_quis1_0.add(panel_quis1_1);
		panel_quis1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSelectDificult_quis1 = new JLabel(new ImageIcon("IMG\\quiz+.png"));
		lblSelectDificult_quis1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_quis1_1.add(lblSelectDificult_quis1, BorderLayout.CENTER);
		
		JPanel panel_quis1_2 = new JPanel();
		panel_quis1_0.add(panel_quis1_2);
		panel_quis1_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEntreeQuis = new JLabel(new ImageIcon("IMG\\plus.png"));
		panel_quis1_2.add(lblEntreeQuis, BorderLayout.WEST);
		
		
		textField_quis1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_quis1_2.add(textField_quis1, BorderLayout.CENTER);
		textField_quis1.setColumns(10);
		
		JPanel panel_quis1_3 = new JPanel();
		panel_quis1_3.setBackground(Color.WHITE);
		quis1.add(panel_quis1_3, BorderLayout.SOUTH);
		panel_quis1_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_quis1_4 = new JPanel();
		panel_quis1_4.setBackground(Color.WHITE);
		panel_quis1_3.add(panel_quis1_4, BorderLayout.EAST);
		
		
		JPanel panel_quis1_5 = new JPanel();
		panel_quis1_0.add(panel_quis1_5);
		panel_quis1_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLaRiponceJist = new JLabel(new ImageIcon("IMG\\true.png"));
		panel_quis1_5.add(lblLaRiponceJist, BorderLayout.WEST);
		
		JPanel panel_quis1_6 = new JPanel();
		panel_quis1_5.add(panel_quis1_6, BorderLayout.CENTER);
		panel_quis1_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnPrese_quis1 = new JButton("< Precedent");
		panel_quis1_4.add(btnPrese_quis1);
		
		JButton btnNext_quis1 = new JButton("Sauvgarder");
		btnNext_quis1.setEnabled(false);
		panel_quis1_4.add(btnNext_quis1);
		
		
		JRadioButton quis1BoRad_1 = new JRadioButton(new ImageIcon("IMG\\oui.png"));
		quis1BoRad_1.setText("oui");
		quis1BoRad_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_quis1_6.add(quis1BoRad_1);
		
		
		
		JRadioButton quis1BoRad_2 = new JRadioButton(new ImageIcon("IMG\\non.png"));
		quis1BoRad_2.setText("non");
		quis1BoRad_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_quis1_6.add(quis1BoRad_2);
	
		
		
		quis1BoRad.add(quis1BoRad_1);
		quis1BoRad.add(quis1BoRad_2);
		
				//**************************************************************************
				
		quis1BoRad_1.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
						quis1BoRad_1.setIcon(new ImageIcon("IMG\\oui_ok.png"));
						quis1BoRad_2.setIcon(new ImageIcon("IMG\\non.png"));
						if (!textField_quis1.getText().equals("")) {
						btnNext_quis1.setEnabled(true);

					}
					}
				});
		
		quis1BoRad_2.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
						quis1BoRad_1.setIcon(new ImageIcon("IMG\\oui.png"));
						quis1BoRad_2.setIcon(new ImageIcon("IMG\\non_ok.png"));	
						if (!textField_quis1.getText().equals("")) {			
						btnNext_quis1.setEnabled(true);
					
						}
	}
});
				
	
		textField_quis1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				if ((!textField_quis1.getText().equals("") )&&((quis1BoRad_1.isSelected())||(quis1BoRad_2.isSelected()))) 
				{
					btnNext_quis1.setEnabled(true);
	        	}else btnNext_quis1.setEnabled(false);
			}
		});
		btnNext_quis1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if ((quis1BoRad_1.isSelected()||quis1BoRad_2.isSelected())&&(!textField_quis1.getText().equals(""))) {
				JOptionPane.showMessageDialog(acciul, "Ajoute avec succes");
				admin.remove(quis1);                                      
				quis1.setVisible(false);                                   
				dom.setVisible(true);                                      
				admin.add(dom);
				frmQuiz.setBounds(200, 200, 804, 421);
				
				}
			}
		});
		btnPrese_quis1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				admin.remove(quis1);
				quis1.setVisible(false);
				type.setVisible(true);
				admin.add(type);
				frmQuiz.setBounds(200, 200, 802, 422);
			}
		});
		
		
		
	//*****re_quie1*****//
		
		        re_quis1.setLayout(new BorderLayout(0, 0));
			
				JPanel re_panel_quis1_0 = new JPanel();
				re_quis1.add(re_panel_quis1_0, BorderLayout.CENTER);
				re_panel_quis1_0.setLayout(new GridLayout(0, 1, 0, 0));
				
				JPanel re_panel_quis1_1 = new JPanel();
				re_panel_quis1_0.add(re_panel_quis1_1);
				re_panel_quis1_1.setLayout(new BorderLayout(0, 0));
				
				JLabel re_lblSelectDificult_quis1 = new JLabel(new ImageIcon("IMG\\quiz.png"));
				re_lblSelectDificult_quis1.setHorizontalAlignment(SwingConstants.CENTER);
				re_panel_quis1_1.add(re_lblSelectDificult_quis1, BorderLayout.CENTER);
				
				JPanel re_panel_quis1_2 = new JPanel();
				re_panel_quis1_0.add(re_panel_quis1_2);
				re_panel_quis1_2.setLayout(null);
				
				JLabel re_quis1_q = new JLabel("quis");
				re_quis1_q.setBounds(0, 0, 794, 119);
				re_quis1_q.setFont(new Font("Tahoma", Font.BOLD, 20));
				re_quis1_q.setHorizontalAlignment(SwingConstants.CENTER);
				re_panel_quis1_2.add(re_quis1_q);
				
				JLabel lblNewLabel = new JLabel(new ImageIcon("IMG\\qq1.png"));
				lblNewLabel.setBounds(0, 0, 794, 119);
				re_panel_quis1_2.add(lblNewLabel);
				
				JPanel re_panel_quis1_3 = new JPanel();
				re_panel_quis1_3.setBackground(Color.WHITE);
				re_quis1.add(re_panel_quis1_3, BorderLayout.NORTH);
				re_panel_quis1_3.setLayout(new BorderLayout(0, 0));
				
				JPanel re_panel_quis1_4 = new JPanel();
				re_panel_quis1_4.setBackground(Color.WHITE);
				re_panel_quis1_3.add(re_panel_quis1_4, BorderLayout.EAST);
				
				
				JPanel re_panel_quis1_5 = new JPanel();
				re_panel_quis1_5.setBackground(Color.WHITE);
				re_panel_quis1_0.add(re_panel_quis1_5);
				re_panel_quis1_5.setLayout(new BorderLayout(0, 0));
				
				JPanel re_panel_quis1_6 = new JPanel();
				re_panel_quis1_6.setBackground(Color.WHITE);
				//re_panel_quis1_6.setBackground(new Color(255,255,255));
				re_panel_quis1_5.add(re_panel_quis1_6, BorderLayout.CENTER);
				re_panel_quis1_6.setLayout(new GridLayout(0, 2, 0, 0));
				
				JButton re_btnNext_quis1 = new JButton("Exit X ");
				re_btnNext_quis1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						admin.remove(re_quis1);
						admin.remove(re_quis2);
						re_quis1.setVisible(false);
						re_quis2.setVisible(false);
						acciul.setVisible(true);
						admin.add(acciul);
						frmQuiz.setBounds(200, 200, 800, 420);
					}
				});
			
				re_panel_quis1_4.add(re_btnNext_quis1);
				
				
				JRadioButton re_q1_rbn1 = new JRadioButton(new ImageIcon("IMG\\oui.png"));
				re_q1_rbn1.setText("oui");
				re_q1_rbn1.setHorizontalAlignment(SwingConstants.CENTER);
				re_panel_quis1_6.add(re_q1_rbn1);
				
				
				
				JRadioButton re_q1_rbn2 = new JRadioButton(new ImageIcon("IMG\\non.png"));
				re_q1_rbn2.setText("non");
				re_q1_rbn2.setHorizontalAlignment(SwingConstants.CENTER);
				re_panel_quis1_6.add(re_q1_rbn2);
			
				
				
				re_quis1BoRadrb.add(re_q1_rbn1);
				re_quis1BoRadrb.add(re_q1_rbn2);
		
				
				//******************************************************************************
		JButton r2_btnNext_quis2 = new JButton("Exit X");
		r2_btnNext_quis2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				admin.remove(re_quis1);
				admin.remove(re_quis2);
				re_quis1.setVisible(false);
				re_quis2.setVisible(false);
				acciul.setVisible(true);
				admin.add(acciul);
				frmQuiz.setBounds(200, 200, 800, 420);
				
			}
		});

	//*****quis2******//
	    quis2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_quis2_0 = new JPanel();
		quis2.add(panel_quis2_0, BorderLayout.CENTER);
		panel_quis2_0.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_quis2_1 = new JPanel();
		panel_quis2_0.add(panel_quis2_1);
		panel_quis2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSelectDificult_quis2 = new JLabel(new ImageIcon("IMG\\quiz+.png"));
		lblSelectDificult_quis2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_quis2_1.add(lblSelectDificult_quis2, BorderLayout.CENTER);
		
		JPanel panel_quis2_2 = new JPanel();
		panel_quis2_0.add(panel_quis2_2);
		panel_quis2_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEntreequis2 = new JLabel(new ImageIcon("IMG\\plus.png"));
		panel_quis2_2.add(lblEntreequis2, BorderLayout.WEST);
		
		
		textField_quis2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		panel_quis2_2.add(textField_quis2_1, BorderLayout.CENTER);
		textField_quis2_1.setColumns(10);
		
		JPanel panel_quis2_3 = new JPanel();
		panel_quis2_3.setBackground(Color.WHITE);
		quis2.add(panel_quis2_3, BorderLayout.SOUTH);
		panel_quis2_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_quis2_4 = new JPanel();
		panel_quis2_4.setBackground(Color.WHITE);
		panel_quis2_3.add(panel_quis2_4, BorderLayout.EAST);
		
		
		JPanel panel_quis2_5 = new JPanel();
		panel_quis2_0.add(panel_quis2_5);
		panel_quis2_5.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_quis2_6 = new JPanel();
		panel_quis2_5.add(panel_quis2_6);
		panel_quis2_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_quis2_1 = new JLabel(new ImageIcon("IMG\\true.png"));
		panel_quis2_6.add(lblNewLabel_quis2_1, BorderLayout.WEST);
		
		
		textField_quis2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_quis2_6.add(textField_quis2_2);
		textField_quis2_2.setColumns(10);
		
		JPanel panel_quis2_7 = new JPanel();
		panel_quis2_5.add(panel_quis2_7);
		panel_quis2_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_quis2_2 = new JLabel(new ImageIcon("IMG\\false.png"));
		panel_quis2_7.add(lblNewLabel_quis2_2, BorderLayout.WEST);
		
		
		textField_quis2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_quis2_3.setColumns(10);
		panel_quis2_7.add(textField_quis2_3);
		
		JPanel panel_quis2_8 = new JPanel();
		panel_quis2_5.add(panel_quis2_8);
		panel_quis2_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_quis2_3 = new JLabel(new ImageIcon("IMG\\false.png"));
		panel_quis2_8.add(lblNewLabel_quis2_3, BorderLayout.WEST);
		

		textField_quis2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_quis2_4.setColumns(10);
		panel_quis2_8.add(textField_quis2_4);
		
		JButton btnPrese_quis2 = new JButton("< Precedent");
		panel_quis2_4.add(btnPrese_quis2);
		
		JButton btnNext_quis2 = new JButton("Sauvgarder");
		btnNext_quis2.setEnabled(false);
		panel_quis2_4.add(btnNext_quis2);
		

		//****************************************************************
		btnNext_quis2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if ((!textField_quis2_1.getText().equals("") )&&(!textField_quis2_2.getText().equals(""))&&(!textField_quis2_3.getText().equals(""))&&(!textField_quis2_4.getText().equals(""))) 
						{
					JOptionPane.showMessageDialog(acciul, "Ajoute avec succes");
						
					admin.remove(quis2);
					quis2.setVisible(false);
					dom.setVisible(true);
					admin.add(dom);
					frmQuiz.setBounds(200, 200, 800, 419);
				}
			}
		});
		btnPrese_quis2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				admin.remove(quis2);
				quis2.setVisible(false);
				type.setVisible(true);
				admin.add(type);
			    frmQuiz.setBounds(200, 200, 800, 419);

	          }
		});
		
		textField_quis2_1.addCaretListener(new CaretListener() { //bah nagriziw savgarde
			public void caretUpdate(CaretEvent arg0) {
				if ((!textField_quis2_1.getText().equals("") )&&(!textField_quis2_2.getText().equals(""))&&(!textField_quis2_3.getText().equals(""))&&(!textField_quis2_4.getText().equals(""))) 
				{
					btnNext_quis2.setEnabled(true);
	        	}else btnNext_quis2.setEnabled(false);
			}
		});
		
		textField_quis2_2.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				if ((!textField_quis2_1.getText().equals("") )&&(!textField_quis2_2.getText().equals(""))&&(!textField_quis2_3.getText().equals(""))&&(!textField_quis2_4.getText().equals(""))) 
				{
					btnNext_quis2.setEnabled(true);
	        	}else btnNext_quis2.setEnabled(false);
			}
		});
		
		textField_quis2_3.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				if ((!textField_quis2_1.getText().equals("") )&&(!textField_quis2_2.getText().equals(""))&&(!textField_quis2_3.getText().equals(""))&&(!textField_quis2_4.getText().equals(""))) 
				{
					btnNext_quis2.setEnabled(true);
	        	}else btnNext_quis2.setEnabled(false);
			}
		});
		
		textField_quis2_4.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				if ((!textField_quis2_1.getText().equals("") )&&(!textField_quis2_2.getText().equals(""))&&(!textField_quis2_3.getText().equals(""))&&(!textField_quis2_4.getText().equals(""))) 
				{
					btnNext_quis2.setEnabled(true);
	        	}else btnNext_quis2.setEnabled(false);
			}
		});
		
	//*****re_quie2*****//	
		
	re_quis2.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel r2_panel_quis2_0 = new JPanel();
		re_quis2.add(r2_panel_quis2_0, BorderLayout.CENTER);
		r2_panel_quis2_0.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel r2_panel_quis2_1 = new JPanel();
		r2_panel_quis2_0.add(r2_panel_quis2_1);
		r2_panel_quis2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel r2_lblSelectDificult_quis2 = new JLabel(new ImageIcon("IMG\\quiz.png"));
		r2_panel_quis2_1.add(r2_lblSelectDificult_quis2, BorderLayout.CENTER);
		
		JPanel r2_panel_quis2_2 = new JPanel();
		r2_panel_quis2_0.add(r2_panel_quis2_2);
		r2_panel_quis2_2.setLayout(null); //absoli layout 
		

		re_quis2_q.setBounds(0, 0, 794, 119);
		re_quis2_q.setFont(new Font("Tahoma", Font.BOLD, 20));
		re_quis2_q.setHorizontalAlignment(SwingConstants.CENTER); // t5ali laktiba f nas
		r2_panel_quis2_2.add(re_quis2_q);
		
		JLabel r2_lblNewLabel = new JLabel(new ImageIcon("IMG\\qq1.png"));
		r2_lblNewLabel.setBounds(0, 0, 794, 119);
		r2_panel_quis2_2.add(r2_lblNewLabel);
		
		JPanel r2_panel_quis2_3 = new JPanel();
		r2_panel_quis2_3.setBackground(Color.WHITE);
		re_quis2.add(r2_panel_quis2_3, BorderLayout.NORTH);
		r2_panel_quis2_3.setLayout(new BorderLayout(0, 0));
		
		JPanel r2_panel_quis2_4 = new JPanel();
		r2_panel_quis2_4.setBackground(Color.WHITE);
		r2_panel_quis2_3.add(r2_panel_quis2_4, BorderLayout.EAST);
		
		
		JPanel r2_panel_quis2_5 = new JPanel();
		r2_panel_quis2_0.add(r2_panel_quis2_5);
		r2_panel_quis2_5.setLayout(null);
		
		JRadioButton r2_q2_rbn1 = new JRadioButton();
		r2_q2_rbn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		r2_q2_rbn1.setHorizontalAlignment(SwingConstants.LEFT);
		r2_q2_rbn1.setBounds(36, 21, 334, 23);
		r2_panel_quis2_5.add(r2_q2_rbn1);
		
		JRadioButton r2_q2_rbn2 = new JRadioButton();
		r2_q2_rbn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		r2_q2_rbn2.setHorizontalAlignment(SwingConstants.LEFT);
		r2_q2_rbn2.setBounds(248, 80, 334, 23);
		r2_panel_quis2_5.add(r2_q2_rbn2);
		
		JRadioButton r2_q2_rbn3 = new JRadioButton();
		r2_q2_rbn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		r2_q2_rbn3.setHorizontalAlignment(SwingConstants.LEFT);
		r2_q2_rbn3.setBounds(429, 21, 334, 23);
		r2_panel_quis2_5.add(r2_q2_rbn3);
		
		JLabel r2_lblNewLabel_1 = new JLabel(new ImageIcon("IMG\\qq3.png"));
		r2_lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2_lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		r2_lblNewLabel_1.setBounds(0, 0, 806, 119);
		r2_panel_quis2_5.add(r2_lblNewLabel_1);
		
		
		r2_btnNext_quis2.setEnabled(true);
		r2_panel_quis2_4.add(r2_btnNext_quis2);
		
		r2_quis2BoRadrb.add(r2_q2_rbn1);
		r2_quis2BoRadrb.add(r2_q2_rbn2);
		r2_quis2BoRadrb.add(r2_q2_rbn3);
	

		   //*******domain*****//
		dom.setLayout(new BorderLayout(0, 0));
		JPanel panel_dom_0 = new JPanel();
		dom.add(panel_dom_0, BorderLayout.CENTER);
		panel_dom_0.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_dom_1 = new JPanel();
		panel_dom_0.add(panel_dom_1);
		panel_dom_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSelectDificult_dom = new JLabel(new ImageIcon("IMG\\dom.png"));
		lblSelectDificult_dom.setToolTipText("Selected domiane ");
		lblSelectDificult_dom.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dom_1.add(lblSelectDificult_dom, BorderLayout.CENTER);
		
		JPanel panel_dom_2 = new JPanel();
		panel_dom_0.add(panel_dom_2);
		panel_dom_2.setLayout(new GridLayout(0, 4, 0, 0));
		
		
		JRadioButton domBoRad_1 = new JRadioButton(new ImageIcon("IMG\\DOM\\info.png"));
		domBoRad_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "coming soon");
			}
		});
		domBoRad_1.setToolTipText("Informatique");
		domBoRad_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_dom_2.add(domBoRad_1);
		
		JRadioButton domBoRad_2 = new JRadioButton(new ImageIcon("IMG\\DOM\\sport.png"));
		domBoRad_2.setToolTipText("Sport");
		domBoRad_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dom_2.add(domBoRad_2);
		
		JRadioButton domBoRad_3 = new JRadioButton(new ImageIcon("IMG\\DOM\\culture.png"));
		domBoRad_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "coming soon");
			}
		});
		domBoRad_3.setToolTipText("Culture General");
		domBoRad_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dom_2.add(domBoRad_3);
		
		JRadioButton domBoRad_4 = new JRadioButton(new ImageIcon("IMG\\DOM\\capital.png"));
		domBoRad_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "coming soon");
			}
		});
		domBoRad_4.setToolTipText("Capitales");
		domBoRad_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dom_2.add(domBoRad_4);
		
		JPanel panel_dom_3 = new JPanel();
		panel_dom_3.setBackground(Color.WHITE);
		dom.add(panel_dom_3, BorderLayout.SOUTH);
		panel_dom_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_dom_4 = new JPanel();
		panel_dom_4.setBackground(Color.WHITE);
		panel_dom_3.add(panel_dom_4, BorderLayout.EAST);
		
		JButton btnPrese_dom = new JButton("< Precedent");
		panel_dom_4.add(btnPrese_dom);
		
		domBoRad.add(domBoRad_1);
		domBoRad.add(domBoRad_2);
		domBoRad.add(domBoRad_3);
		domBoRad.add(domBoRad_4);


		

		//*******************************************************
	/*	domBoRad_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//if (domBoRad_1.isSelected()||domBoRad_2.isSelected()||domBoRad_3.isSelected()||domBoRad_4.isSelected()) {
					admin.remove(dom);
					dom.setVisible(false);
					dif.setVisible(true);                                         // mazal ma barmajnahach
					admin.add(dif);
				frame.setBounds(200, 200, 800, 422);
				//}
			}
		});*/
		domBoRad_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					admin.remove(dom);
					dom.setVisible(false);
					dif.setVisible(true);
					admin.add(dif);
				frmQuiz.setBounds(200, 200, 800, 422);
			
			}
		});
	/*	domBoRad_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//if (domBoRad_1.isSelected()||domBoRad_2.isSelected()||domBoRad_3.isSelected()||domBoRad_4.isSelected()) {
					admin.remove(dom);
					dom.setVisible(false);
					dif.setVisible(true);
					admin.add(dif);
				frame.setBounds(200, 200, 800, 422);
				//}
			}
		});*/
	/*	domBoRad_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//if (domBoRad_1.isSelected()||domBoRad_2.isSelected()||domBoRad_3.isSelected()||domBoRad_4.isSelected()) {
					admin.remove(dom);
					dom.setVisible(false);
					dif.setVisible(true);
					admin.add(dif);
				frame.setBounds(200, 200, 800, 422);
				//}
			}
		});*/
		btnPrese_dom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				admin.remove(dom);                                   
				dom.setVisible(false);                               
				admin.add(acciul);
				joure=true;
				dom.setVisible(false);
				frmQuiz.setBounds(200, 200, 802, 420);
			}
		});
		
	//*******dif*****//	
		
		dif.setLayout(new BorderLayout(0, 0));

		JPanel panel_dif_0 = new JPanel();
		dif.add(panel_dif_0, BorderLayout.CENTER);
		panel_dif_0.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_dif_1 = new JPanel();
		panel_dif_0.add(panel_dif_1);
		panel_dif_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSelectDificult_dif = new JLabel(new ImageIcon("IMG\\dif.png"));
		lblSelectDificult_dif.setToolTipText("Selected difficult");
		lblSelectDificult_dif.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dif_1.add(lblSelectDificult_dif, BorderLayout.CENTER);
		
		JPanel panel_dif_2 = new JPanel();
		panel_dif_0.add(panel_dif_2);
		panel_dif_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		
		JRadioButton difBoRad_1 = new JRadioButton(new ImageIcon("IMG\\low.png"));
		difBoRad_1.setToolTipText("Facile");
		difBoRad_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dif_2.add(difBoRad_1);
		
		
		JRadioButton difBoRad_2 = new JRadioButton(new ImageIcon("IMG\\med.png"));
		difBoRad_2.addMouseListener(new MouseAdapter(){
			@Override
			public void  mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "coming soon");
			}
		});
		difBoRad_2.setToolTipText("Moyenne");
		difBoRad_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dif_2.add(difBoRad_2);
		
		JRadioButton difBoRad_3 = new JRadioButton(new ImageIcon("IMG\\high.png"));
		difBoRad_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frmQuiz, "coming soon");
			}
		});
		difBoRad_3.setToolTipText("Difficile");
		difBoRad_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_dif_2.add(difBoRad_3);
		
		
		JPanel panel_dif_3 = new JPanel();
		dif.add(panel_dif_3, BorderLayout.SOUTH);
		panel_dif_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_dif_4 = new JPanel();
		panel_dif_4.setBackground(Color.WHITE);
		panel_dif_3.setBackground(Color.WHITE);
		panel_dif_3.add(panel_dif_4, BorderLayout.EAST);
		
		JButton btnPrese_dif = new JButton("< Precedent");
		panel_dif_4.add(btnPrese_dif);
		
	

		difBoRad.add(difBoRad_1);
		difBoRad.add(difBoRad_2);
		difBoRad.add(difBoRad_3);
		//**************************************************************************

		difBoRad_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					if(!joure) {
						admin.remove(dif);
						dif.setVisible(false);
						type.setVisible(true);
					
						admin.add(type);           //dom
					frmQuiz.setBounds(200, 200, 801, 420);
					}else {
						
					
						rand();

						if(tabquis[l]==1)
						{
                        admin.remove(dif); ////////////////aficher quis 1
						dif.setVisible(false);
						if(domBoRad_1.isSelected()) { 
							 
							//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);      mahomch mprogramyin
						}
						if(domBoRad_2.isSelected()) { //domain sport facil 
							 
								re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
							}
						if(domBoRad_3.isSelected()) { 
							 
							//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
						if(domBoRad_4.isSelected()) { 
							 
							//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
						re_quis1.setVisible(true);
						admin.add(re_quis1);
						frmQuiz.setBounds(200, 200, 803, 420);
						
						}else {
	                        admin.remove(dif); ////////////////aficher quis 2
							dif.setVisible(false);
							if(domBoRad_1.isSelected()) { //domain info facil 

							  /*  rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);*/
						}
							if(domBoRad_2.isSelected()) { //domain sport facil

								    rand3();
							    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
									choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
									choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
									choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
									r2_q2_rbn1.setText(choix[1]);
									r2_q2_rbn2.setText(choix[2]);
									r2_q2_rbn3.setText(choix[0]);
							}
							if(domBoRad_3.isSelected()) { //domain culti facil 

								  /*  rand3();
							    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
									choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
									choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
									choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
									r2_q2_rbn1.setText(choix[1]);
									r2_q2_rbn2.setText(choix[2]);
									r2_q2_rbn3.setText(choix[0]);*/
							}
							if(domBoRad_4.isSelected()) { //domain 

								  /*  rand3();
							    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
									choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
									choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
									choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
									r2_q2_rbn1.setText(choix[1]);
									r2_q2_rbn2.setText(choix[2]);
									r2_q2_rbn3.setText(choix[0]);*/
							}
						
							re_quis2.setVisible(true);
							frmQuiz.setBounds(200, 200, 803, 420);
							admin.add(re_quis2);
	
						}
						
					}

				}
	//		}
		});
		
	/*	difBoRad_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//if (difBoRad_1.isSelected()||difBoRad_2.isSelected()||difBoRad_3.isSelected()) {
					if(!joure) {
						admin.remove(dif);
						
						dif.setVisible(false);
						type.setVisible(true);
					
						admin.add(type);           //dom
					frame.setBounds(200, 200, 801, 420);
					}else {
						
					
						rand();
						r2_btnNext_quis2.setText("Suivant >");
						re_btnNext_quis1.setText("Suivant >");
						if(tabquis[l]==1)
						{
                        admin.remove(dif); ////////////////aficher quis 1
						dif.setVisible(false);
						if(domBoRad_1.isSelected()) { 
							 
							//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
						if(domBoRad_2.isSelected()) { //domain sport facil oui/non
							 
								re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
							}
						if(domBoRad_3.isSelected()) { 
							 
							//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
						if(domBoRad_4.isSelected()) { 
							 
							//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
						re_quis1.setVisible(true);
						admin.add(re_quis1);
						
						}else {
	                        admin.remove(dif); ////////////////aficher quis 2
							dif.setVisible(false);
							if(domBoRad_1.isSelected()) { //domain sport facil oui/non

							    rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);
						}
							if(domBoRad_2.isSelected()) { //domain sport facil oui/non

								    rand3();
							    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
									choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
									choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
									choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
									r2_q2_rbn1.setText(choix[1]);
									r2_q2_rbn2.setText(choix[2]);
									r2_q2_rbn3.setText(choix[0]);
							}
							if(domBoRad_3.isSelected()) { //domain sport facil oui/non

								    rand3();
							    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
									choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
									choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
									choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
									r2_q2_rbn1.setText(choix[1]);
									r2_q2_rbn2.setText(choix[2]);
									r2_q2_rbn3.setText(choix[0]);
							}
							if(domBoRad_4.isSelected()) { //domain sport facil oui/non

								    rand3();
							    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
									choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
									choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
									choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
									r2_q2_rbn1.setText(choix[1]);
									r2_q2_rbn2.setText(choix[2]);
									r2_q2_rbn3.setText(choix[0]);
							}
							//re_quis2_q.setText(TabQuizLowType1Spr[tabquis[l]]);
							re_quis2.setVisible(true);
							admin.add(re_quis2);
	
						}
						
					}

				}
	//		}
		});*/
		
		/*	difBoRad_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			//if (difBoRad_1.isSelected()||difBoRad_2.isSelected()||difBoRad_3.isSelected()) {
				if(!joure) {
					admin.remove(dif);
					
					dif.setVisible(false);
					type.setVisible(true);
				
					admin.add(type);           //dom
				frame.setBounds(200, 200, 801, 420);
				}else {
					
				
					rand();
					r2_btnNext_quis2.setText("Suivant >");
					re_btnNext_quis1.setText("Suivant >");
					if(tabquis[l]==1)
					{
                    admin.remove(dif); ////////////////aficher quis 1
					dif.setVisible(false);
					if(domBoRad_1.isSelected()) { 
						 
						//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
					}
					if(domBoRad_2.isSelected()) { //domain sport facil oui/non
						 
							re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
					if(domBoRad_3.isSelected()) { 
						 
						//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
					}
					if(domBoRad_4.isSelected()) { 
						 
						//re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
					}
					re_quis1.setVisible(true);
					admin.add(re_quis1);
					
					}else {
                        admin.remove(dif); ////////////////aficher quis 2
						dif.setVisible(false);
						if(domBoRad_1.isSelected()) { //domain sport facil oui/non

						    rand3();
					    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
							choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
							choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
							choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
							r2_q2_rbn1.setText(choix[1]);
							r2_q2_rbn2.setText(choix[2]);
							r2_q2_rbn3.setText(choix[0]);
					}
						if(domBoRad_2.isSelected()) { //domain sport facil oui/non

							    rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);
						}
						if(domBoRad_3.isSelected()) { //domain sport facil oui/non

							    rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);
						}
						if(domBoRad_4.isSelected()) { //domain sport facil oui/non

							    rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);
						}
						//re_quis2_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						re_quis2.setVisible(true);
						admin.add(re_quis2);

					}
					
				}

			}
//		}
	});*/
		
		
		btnPrese_dif.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				admin.remove(dif);
				dif.setVisible(false);
				dom.setVisible(true);
				admin.add(dom);
				frmQuiz.setBounds(200, 200, 801, 421);
			}
		});
	//*******TYPE****//
	    type.setLayout(new BorderLayout(0, 0));
	    
		JPanel panel_type_0 = new JPanel();
		type.add(panel_type_0, BorderLayout.CENTER);
		panel_type_0.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_type_1 = new JPanel();
		panel_type_0.add(panel_type_1);
		panel_type_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSelectDificult_type = new JLabel(new ImageIcon("IMG\\type.png"));
		lblSelectDificult_type.setHorizontalAlignment(SwingConstants.CENTER);
		panel_type_1.add(lblSelectDificult_type, BorderLayout.CENTER);
		
		JPanel panel_type_2 = new JPanel();
		panel_type_0.add(panel_type_2);
		panel_type_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton typeBoRad_1 = new JRadioButton(new ImageIcon("IMG\\type_1.png"));
		typeBoRad_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_type_2.add(typeBoRad_1);
		
		JRadioButton typeBoRad_2 = new JRadioButton(new ImageIcon("IMG\\type_2.png"));
		typeBoRad_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_type_2.add(typeBoRad_2);
		
		JPanel panel_type_3 = new JPanel();
		panel_type_3.setBackground(Color.WHITE);
		type.add(panel_type_3, BorderLayout.SOUTH);
		panel_type_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_type_4 = new JPanel();
		panel_type_4.setBackground(Color.WHITE);
		panel_type_3.add(panel_type_4, BorderLayout.EAST);
		
		JButton btnPrese_type = new JButton("< Precedent");
		panel_type_4.add(btnPrese_type);
		
		JButton btnNext_type = new JButton("Suivant >");
		panel_type_4.add(btnNext_type);
		
		btnNext_type.setEnabled(false);
		

		typeBoRad.add(typeBoRad_1);
		typeBoRad.add(typeBoRad_2);
		
		//***********************************************
		typeBoRad_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				btnNext_type.setEnabled(true);
				typeBoRad_1.setIcon(new ImageIcon("IMG\\type_1_ok.png"));
				typeBoRad_2.setIcon(new ImageIcon("IMG\\type_2.png"));
			}
		});
		
		typeBoRad_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				btnNext_type.setEnabled(true);
				typeBoRad_1.setIcon(new ImageIcon("IMG\\type_1.png"));
				typeBoRad_2.setIcon(new ImageIcon("IMG\\type_2_ok.png"));
			}
		});
		
		//*****************************************

		btnNext_type.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
		
				if(typeBoRad_1.isSelected())
				{   
					
					admin.remove(type);   
					type.setVisible(false);
					quis1.setVisible(true);		
					admin.add(quis1);
					frmQuiz.setBounds(200, 200, 800, 424);
	
				}
				
				if(typeBoRad_2.isSelected()) {   

					admin.remove(type);  
					type.setVisible(false);
					quis2.setVisible(true);
					admin.add(quis2);
				frmQuiz.setBounds(200, 200, 801, 425);

				}
			}
		});
		
		btnPrese_type.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				admin.remove(type);
				type.setVisible(false);
				dif.setVisible(true);
				admin.add(dif);
				frmQuiz.setBounds(200, 200, 803, 420);
			}
		});


		//****************************************************************
		r2_q2_rbn1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {

					
					if(l<4)
						
					{
						 
						
						if(r2_q2_rbn1.isSelected()) {
							if (r2_q2_rbn1.getText().equals(TabQuizLowType2_reSpr[tabquis[l]])) {   //test
								tru++;
							}
						}

						r2_quis2BoRadrb.clearSelection();
						l++;

				if (tabquis[l]==1)
				{

					if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non
						re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
					
					admin.remove(re_quis2);
					re_quis2.setVisible(false);
					re_quis1.setVisible(true);
					admin.add(re_quis1);
					frmQuiz.setBounds(200, 200, 800, 421);
	
				}else {

					if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil 

					    rand3();
				    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
						choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
						choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
						choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
						r2_q2_rbn1.setText(choix[1]);
						r2_q2_rbn2.setText(choix[2]);
						r2_q2_rbn3.setText(choix[0]);

				} // REMARQUE programina gir sport facile					

				}
					}else {
						if(r2_q2_rbn1.isSelected()) {
							if (r2_q2_rbn1.getText().equals(TabQuizLowType2_reSpr[tabquis[l]])) {
								tru++;
							}
					
						r2_quis2BoRadrb.clearSelection();
						
						
					
						if (tru<3) {                                                    //resultat
							imgobjes.setIcon(new ImageIcon("IMG\\mal.png"));
							res1.setText("Resultat: "+tru+" essayez a nouveau");
						}else {
							imgobjes.setIcon(new ImageIcon("IMG\\good.png"));
							res1.setText("Resultat du defi: "+tru+" bien fait");
						}
						
						admin.remove(re_quis1);
						re_quis1.setVisible(false);
						re_quis2.setVisible(false);
						resultat.setVisible(true);
						admin.add(resultat);
						frmQuiz.setBounds(200, 200, 801, 422);
						
						
						
						
					}

			
					}}});
		
		
		
		r2_q2_rbn2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {

					
					if(l<4)
						
					{
						 
						
						if(r2_q2_rbn2.isSelected()) {                                                  //test
							if (r2_q2_rbn2.getText().equals(TabQuizLowType2_reSpr[tabquis[l]])) {
								tru++;
							}
						}

						r2_quis2BoRadrb.clearSelection();
						l++;

				if (tabquis[l]==1)
				{

						
					if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non
						re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
					
					admin.remove(re_quis2);
					re_quis2.setVisible(false);
					re_quis1.setVisible(true);
					admin.add(re_quis1);
					frmQuiz.setBounds(200, 200, 800, 421);
	
				}else {

					if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil 

					    rand3();
				    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
						choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
						choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
						choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
						r2_q2_rbn1.setText(choix[1]);
						r2_q2_rbn2.setText(choix[2]);
						r2_q2_rbn3.setText(choix[0]);

				} // REMARQUE programina gir sport facile					

				}
					}else {
						if(r2_q2_rbn2.isSelected()) {
							if (r2_q2_rbn2.getText().equals(TabQuizLowType2_reSpr[tabquis[l]])) {   //test
								tru++;
							}
					
						r2_quis2BoRadrb.clearSelection();
						
						
					
						if (tru<3) {                                                //resultat
							imgobjes.setIcon(new ImageIcon("IMG\\mal.png"));
							res1.setText("Resultat: "+tru+" essayez a nouveau");
						}else {
							imgobjes.setIcon(new ImageIcon("IMG\\good.png"));
							res1.setText("Resultat du defi: "+tru+" bien fait");
						}
						frmQuiz.setBounds(200, 200, 801, 420);
						admin.remove(re_quis1);
						re_quis1.setVisible(false);
						re_quis2.setVisible(false);
						resultat.setVisible(true);
						admin.add(resultat);

					}			
					}}});
		
		r2_q2_rbn3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {

					if(l<4)
						
					{
						
						if(r2_q2_rbn3.isSelected()) {
							if (r2_q2_rbn3.getText().equals(TabQuizLowType2_reSpr[tabquis[l]])) {
								tru++;
							}
						}

						r2_quis2BoRadrb.clearSelection();
						l++;

				if (tabquis[l]==1)
				{

						
					if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non
						re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
					
					admin.remove(re_quis2);
					re_quis2.setVisible(false);
					re_quis1.setVisible(true);
					admin.add(re_quis1);
					frmQuiz.setBounds(200, 200, 800, 421);
	
				}else {

					if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non

					    rand3();
				    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
						choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
						choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
						choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
						r2_q2_rbn1.setText(choix[1]);
						r2_q2_rbn2.setText(choix[2]);
						r2_q2_rbn3.setText(choix[0]);

				} // REMARQUE programina gir sport facile					

				}
					}else {
						if(r2_q2_rbn3.isSelected()) {
							if (r2_q2_rbn3.getText().equals(TabQuizLowType2_reSpr[tabquis[l]])) {
								tru++;
							}
					
						r2_quis2BoRadrb.clearSelection();
						
						
					
						if (tru<3) {
							imgobjes.setIcon(new ImageIcon("IMG\\mal.png"));
							res1.setText("Resultat: "+tru+" essayez a nouveau");
						}else {
							imgobjes.setIcon(new ImageIcon("IMG\\good.png"));
							res1.setText("Resultat du defi: "+tru+" bien fait");
						}
						frmQuiz.setBounds(200, 200, 801, 420);
						admin.remove(re_quis1);
						re_quis1.setVisible(false);
						re_quis2.setVisible(false);
						resultat.setVisible(true);
						admin.add(resultat);
												
					}
			
					}}});
		
		//**************************
		
		re_q1_rbn1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if ((re_q1_rbn2.isSelected())||(re_q1_rbn1.isSelected()))
					
					{
					if(l<4)
					{

						if(re_q1_rbn1.isSelected()) {
							if (re_q1_rbn1.getText().equals(TabQuizLowType1_reSpr[tabquis[l]])) {
								tru++;
							}
						}
						re_quis1BoRadrb.clearSelection();

						
						l++;

					if (tabquis[l]==2)
					{
							
							admin.remove(re_quis1); 
							re_quis1.setVisible(false);
							
							if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non

							    rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);	
						}
							re_quis2.setVisible(true);
							admin.add(re_quis2);
							frmQuiz.setBounds(200, 200, 801, 420);
					}else {
						if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non
							
							re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
					}
						}else {
		
							if(re_q1_rbn1.isSelected()) {
								if (re_q1_rbn1.getText().equals(TabQuizLowType1_reSpr[tabquis[l]])) {
									tru++;
								}
							}
							re_quis1BoRadrb.clearSelection();
							
							if (tru<3) {
								imgobjes.setIcon(new ImageIcon("IMG\\mal.png"));
								res1.setText("Resultat du defi: "+tru+"essayez a nouveau");
							}else {
								imgobjes.setIcon(new ImageIcon("IMG\\good.png"));
								res1.setText("Resultat du defi: "+tru+" bien fait");
							}
							frmQuiz.setBounds(200, 200, 801, 420);
							admin.remove(re_quis1);
							re_quis1.setVisible(false);
							re_quis2.setVisible(false);
							resultat.setVisible(true);
							admin.add(resultat);
							
						}
				}
				}
			});
	
	
		re_q1_rbn2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if ((re_q1_rbn2.isSelected())||(re_q1_rbn1.isSelected()))
					
					{
					if(l<4)
					{

						if(re_q1_rbn2.isSelected()) {
							if (re_q1_rbn2.getText().equals(TabQuizLowType1_reSpr[tabquis[l]])) {
								tru++;
							}
						}
						re_quis1BoRadrb.clearSelection();

						
						l++;

					if (tabquis[l]==2)
					{
							
							admin.remove(re_quis1); 
							re_quis1.setVisible(false);
							
							if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non

							    rand3();
						    	re_quis2_q.setText(TabQuizLowType2Spr[tabquis[l]]);
								choix[tabchoix[0]]=TabQuizLowType2_reSpr[tabquis[l]];
								choix[tabchoix[1]]=TabQuizLowType2_choix1Spr[tabquis[l]];
								choix[tabchoix[2]]=TabQuizLowType2_choix2Spr[tabquis[l]];
								r2_q2_rbn1.setText(choix[1]);
								r2_q2_rbn2.setText(choix[2]);
								r2_q2_rbn3.setText(choix[0]);	
						}
							re_quis2.setVisible(true);
							admin.add(re_quis2);
							frmQuiz.setBounds(200, 200, 801, 420);
					}else {
						if(difBoRad_1.isSelected()&&domBoRad_2.isSelected()) { //domain sport facil oui/non
							
							re_quis1_q.setText(TabQuizLowType1Spr[tabquis[l]]);
						}
					}
						}else {
		
							if(re_q1_rbn2.isSelected()) {
								if (re_q1_rbn2.getText().equals(TabQuizLowType1_reSpr[tabquis[l]])) {
									tru++;
								}
							}
							re_quis1BoRadrb.clearSelection();

							if (tru<3) {
								imgobjes.setIcon(new ImageIcon("IMG\\mal.png"));
								res1.setText("Resultat du defi: "+tru+" essayez a nouveau");
							}else {
								imgobjes.setIcon(new ImageIcon("IMG\\good.png"));
								res1.setText("Resultat du defi: "+tru+" bien fait");
							}
							frmQuiz.setBounds(200, 200, 801, 420);
							admin.remove(re_quis1);
							re_quis1.setVisible(false);
							re_quis2.setVisible(false);
							resultat.setVisible(true);
							admin.add(resultat);
							
						}
				}
				}
			});
	}
	}




