import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorEnviar implements ActionListener {
	private JTextField txtMensagem = null;
	private JTextArea txtMensagens = null;
	
	
	public ControladorEnviar(JTextField txtMensagem, JTextArea txtMensagens) {
		super();
		this.txtMensagens = txtMensagens;
		this.txtMensagem = txtMensagem;
}	

		public void actionPerformed(ActionEvent e) {
			txtMensagem.grabFocus();
			
			if (txtMensagem.getText().trim().equals("")){
				txtMensagem.setText("");
				return;
			}
			
			EnvioMensagem.enviar("Você", txtMensagem.getText(),
							txtMensagens);
			txtMensagem.setText("");
		}
}
