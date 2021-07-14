package trabalho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class vermelhoAction extends trabalhoCore implements ActionListener{

	
public vermelhoAction(JToggleButton botao) {
		
		this.vermelho = botao;
	} 
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		trabalhoCore p = new trabalhoCore();
		
		System.out.println("Vermelho");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				vermelho.setSelected(true);
				
			try {
				p.playSound("LO_SWISS.WAV");
				piscar(vermelho);
				vetorJogador.add(1);
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
