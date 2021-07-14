package trabalho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class verdeAction extends trabalhoCore implements ActionListener{
	
public verdeAction(JToggleButton botao) {
		
		this.verde = botao;
	} 
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		trabalhoCore p = new trabalhoCore();
		
		System.out.println("Verde");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				verde.setSelected(true);
				
			try {
				p.playSound("SHAKEN_B.WAV");
				piscar(verde);
				vetorJogador.add(0);
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
