import javax.swing.*;

public class JframeHelloWorld{
    public static void main (String[] args){
		// �൱��body
	    JFrame frame = new JFrame("����һ��JFrame");
		// �൱��div
		JPanel panel = new JPanel();
		// �൱������
		JLabel label = new JLabel("helloworld");
		// �����ַ���div��
		panel.add(label);
		// ��div����body��
		frame.setContentPane(panel);
		// ����body���
		frame.setSize(300,200);
		// ����body�ɼ�
		frame.setVisible(true);
	}
}