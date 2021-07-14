package trabalho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class azulAction extends trabalhoCore implements ActionListener{
	
public azulAction(JToggleButton botao) {
		
		this.azul = botao;
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		

		trabalhoCore p = new trabalhoCore();
		System.out.println("azul");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				azul.setSelected(true);
				
			try {
				p.playSound("HI_SWISS.WAV");
				piscar(azul);
				vetorJogador.add(3);
				validarJogada();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
				
			}
		}).start();
		
	}

			private static void piscar(JToggleButton botao) throws InterruptedException {
				
				
				
				botao.setSelected(false);
				Thread.sleep(100);
				botao.setSelected(true);
				Thread.sleep(100);
				botao.setSelected(false);
				Thread.sleep(100);
				botao.setSelected(true);
				Thread.sleep(100);
				botao.setSelected(false);
				Thread.sleep(100);
				
			
			}

}
