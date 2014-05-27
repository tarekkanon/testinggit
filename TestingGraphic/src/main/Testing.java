package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Testing {
	
	public enum LicenseStatus{
		
		/**
		 * expired value 3
		 */
		Expd(3),
		
		/**
		 *  value 2 
		 */
		Warning(2),
		
		/**
		 * value 1
		 */
		Avaliable(1);
		
		int code;
		
		private LicenseStatus(int c) {
			code = c;
		}
		
		@Override
		public String toString() {
			
			return ""+code;
		}
		
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		LicenseStatus as = LicenseStatus.Expd;
		System.out.println(as);
		
		switch (as) {
		case Warning:
			
			break;

		case Avaliable:
			
			break;
			
		default:
			break;
		}
		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Testing window = new Testing();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 */
	public Testing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JButton btnTest = new JButton("test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (new File("D:/logo/kiasfas").exists()) {
					JOptionPane.showMessageDialog(frame, "Exists");
				}
				else
				{
					JFileChooser choose = new JFileChooser();
					choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					choose.showDialog(frame, "Select");
				}
				
				
				
			}
		});
		
		
		frame.getContentPane().add(btnTest, BorderLayout.CENTER);
		
	}

}
