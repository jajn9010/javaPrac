//*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEventMain { // OutterClass

	public static void main(String[] args) {

		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // Frame(화면) 만들기
		Button btn = new Button("It's Me!! Button!!");

		// 2.
		btn.addActionListener(new ActionListener() {  // 익명(무명) class
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("ActionEvent 발생했습니다. 222");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
				
			}
		}); // button에 event를 추가함.
		
		// 3.
		frame.addWindowListener(new WindowAdapter() { // 익명(무명) class

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
			
		});

		frame.add(btn); // add를 통해서 button 등을 넣어줄 수 있음. 단 panel을 쓰지 않으면 Frame 전체 화면을 잡아먹음.
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setLocation(300, 150);
	}
}
//*/

/*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain { // OutterClass

	public static void main(String[] args) {

		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // Frame(화면) 만들기
		Button btn = new Button("It's Me!! Button!!");

		// 2.
		btn.addActionListener(new ActionListener() {  // 익명(무명) class
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("ActionEvent 발생했습니다. 222");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
				
			}
		}); // button에 event를 추가함.

		frame.add(btn); // add를 통해서 button 등을 넣어줄 수 있음. 단 panel을 쓰지 않으면 Frame 전체 화면을 잡아먹음.
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setLocation(300, 150);
	}
}
//*/


/*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain { // OutterClass

	class EventHandler implements ActionListener { // InnerClass

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("ActionEvent 발생했습니다.");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
			
		}

	} // Inner Class end

	public static void main(String[] args) {

		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // Frame(화면) 만들기
		Button btn = new Button("It's Me!! Button!!");

		// 1.
		EventHandler handler = new InnerEventMain().new EventHandler();
		btn.addActionListener(handler); // button에 event를 추가함.

		frame.add(btn); // add를 통해서 button 등을 넣어줄 수 있음. 단 panel을 쓰지 않으면 Frame 전체 화면을 잡아먹음.
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setLocation(300, 150);
	}
}
//*/