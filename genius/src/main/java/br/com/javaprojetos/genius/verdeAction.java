package br.com.javaprojetos.genius;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class verdeAction extends core implements ActionListener {

	public verdeAction(JToggleButton botao) {
			
			this.verde = botao;
		} 
		
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			final core p = new core();
			
			System.out.println("Verde");
			
			new Thread(new Runnable() {
				
				public void run() {
					
					verde.setSelected(true);
					
				try {
					p.playSound("alarme.wav");
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
