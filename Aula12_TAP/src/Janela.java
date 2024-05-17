import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField txtMensagem = new JTextField();
	private JButton btnEnviar = new JButton("Enviar");
	private JTextArea txtMensagens = new JTextArea();
	private JScrollPane jspMensagens = new JScrollPane(txtMensagens);
	
	public static void main(String[] args) {
		new Janela().setVisible(true);
	}
	public Janela() {
		setTitle("Java Multthread ChatRoom");
		setSize(350,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		txtMensagem.setBounds(10,10,240,20);
		add(txtMensagem);
		
		btnEnviar.setBounds(255,10,70,19);
		add(btnEnviar);
		btnEnviar.addActionListener(new ControladorEnviar(txtMensagem, txtMensagens));
		
		jspMensagens.setBounds(10,40, 315, 320);
		add(jspMensagens);
		txtMensagens.setLineWrap(true);
		
		new RepositorioMensagens();
		
		new Participante("Pedrão", txtMensagens).start();
		new Participante("Gordin", txtMensagens).start();
		new Participante("Amor", txtMensagens).start();
		new Participante("Paulo", txtMensagens).start();
		new Participante("Alts", txtMensagens).start();
	}
}
