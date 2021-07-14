package trabalho;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class amareloAction extends trabalhoCore implements ActionListener{
	
	
public amareloAction(JToggleButton botao) {
		
		this.amarelo = botao;
	}
   

	
	public void actionPerformed(ActionEvent e) {
		
		trabalhoCore p = new trabalhoCore();
		System.out.println("amarelo");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				amarelo.setSelected(true);
				
			try {
				p.playSound("LO_BELL_.WAV");
				piscar(amarelo);
				vetorJogador.add(2);
				validarJogada();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
				
			}
		}).start();
		
	}

			private void piscar(JToggleButton botao) throws InterruptedException {
				
				
				
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
