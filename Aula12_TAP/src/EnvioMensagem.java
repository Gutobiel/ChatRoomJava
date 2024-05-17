import java.util.Calendar;

import javax.swing.JTextArea;

public class EnvioMensagem {
	public static void enviar(String remetente,
								String mensagem,
								JTextArea txtMensagens) {
		
		Calendar objCalendario = Calendar.getInstance();
		String instante =
					objCalendario.get(Calendar.HOUR_OF_DAY) + ":" +
		objCalendario.get(Calendar.MINUTE) + ":" +
							objCalendario.get(Calendar.SECOND);
		txtMensagens.setText(instante + " " +
							remetente + " disse:\n" +
							mensagem + "\n\n" +
							txtMensagens.getText());
		txtMensagens.setCaretPosition(0);
	}
}
