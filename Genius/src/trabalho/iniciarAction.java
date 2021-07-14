package trabalho;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JToggleButton;

public class iniciarAction extends trabalhoCore implements ActionListener{

JToggleButton[] vetorBotao = null;
	
	public iniciarAction(JToggleButton[] botao) {
		
		this.vetorBotao = botao;
	} 
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("iniciar");
		new Thread(new Runnable() {
			
			
			
			@Override
			public void run() {
				
				

					
				
				
			try {
				
							
				
				if  (vetorComputador.size() == 9) {
					
					vetorComputador.add(1);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
				
				
				
				if  (vetorComputador.size() == 8) {
					
					vetorComputador.add(0);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[0]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
				
				
				if  (vetorComputador.size() == 7) {
					
					vetorComputador.add(2);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[2]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
				
				
				if  (vetorComputador.size() == 6) {
					
					
					vetorComputador.add(0);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[0]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
				
				
				if  (vetorComputador.size() == 5) {
					
					vetorComputador.add(2);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[2]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
				
				
				
				if  (vetorComputador.size() == 4) {
					
				
					
					vetorComputador.add(3);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					piscar(vetorBotao[3]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
				if  (vetorComputador.size() == 3) {
					
				
					
					vetorComputador.add(3);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					piscar(vetorBotao[3]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
			

				
				if  (vetorComputador.size() == 2) {
					
				
					
					vetorComputador.add(2);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					piscar(vetorBotao[2]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				if  (vetorComputador.size() == 1) {
					
				
					
					vetorComputador.add(1);
					piscar(vetorBotao[0]);
					piscar(vetorBotao[1]);
					pontos = pontos + 1;
					fase = fase +1;
				}
				
			

				
				if  (vetorComputador.size() == 0) {
					
				
					
					vetorComputador.add(0);
					piscar(vetorBotao[0]);
					fase = 2;
				}
				
			
				vetorJogador = new ArrayList<>();
				for (int j = 0; j < vetorComputador.size(); j++) {
						System.out.println("Computador[" +j+ "]:" + vetorComputador.get(j));
				}
				
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
		}	
			
		}).start();
		
	}
	
	


			private void piscar(JToggleButton botao) throws InterruptedException {
				
				
				
				botao.setSelected(false);
				Thread.sleep(200);
				botao.setSelected(true);
				Thread.sleep(200);
				botao.setSelected(false);
				Thread.sleep(200);
				botao.setSelected(true);
				Thread.sleep(200);
				botao.setSelected(false);
				Thread.sleep(200);
				
			}
}
