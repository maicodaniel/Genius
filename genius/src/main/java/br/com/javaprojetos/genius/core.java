package br.com.javaprojetos.genius;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class core implements ActionListener{
	
	static List<Integer> vetorComputador = new ArrayList<Integer>();
	

	static List<Integer> vetorJogador = new ArrayList<Integer>();
	
	
	
	static int fase;
	static int pontos;
	JToggleButton iniciar = null;
	JToggleButton verde = null;
	JToggleButton vermelho = null;
	JToggleButton azul = null;
	JToggleButton amarelo = null;
	
	
	JToggleButton[] vetorBotao = new JToggleButton[4];

	public static void main(String[] args) {
		new core().processar();

	}
	public void processar() {
			
			JPanel painel = new JPanel();
			painel.setBackground(Color.BLACK);
			
			this.iniciar = new JToggleButton("iniciar");
			
			this.amarelo = new JToggleButton("amarelo");
			amarelo.setBackground(Color.YELLOW);
			
			this.verde = new JToggleButton("verde");
			verde.setBackground(Color.GREEN);
			
			this.azul = new JToggleButton("azul");
			azul.setBackground(Color.BLUE);
			
			this.vermelho = new JToggleButton("vermelho");
			vermelho.setBackground(Color.RED);
			
			painel.add(iniciar);
			painel.add(amarelo);
			painel.add(verde);
			painel.add(azul);
			painel.add(vermelho);
			
			painel.setPreferredSize(new Dimension(550, 130));
			iniciar.setPreferredSize(new Dimension(100, 100));
			amarelo.setPreferredSize(new Dimension(100, 100));
			azul.setPreferredSize(new Dimension(100, 100));	
			vermelho.setPreferredSize(new Dimension(100, 100));
			verde.setPreferredSize(new Dimension(100, 100));
			
			JFrame janela =new JFrame("Genius Java");
			janela.add(painel);
			janela.pack();
			janela.setVisible(true);
			janela.setLocationRelativeTo(null);
			this.verde.addActionListener(new verdeAction(this.verde));
			this.vermelho.addActionListener(new vermelhoAction(this.vermelho));
			this.amarelo.addActionListener(new amareloAction(this.amarelo));
			this.azul.addActionListener(new azulAction(this.azul));
			this.iniciar.addActionListener(new iniciarAction(this.vetorBotao));
			this.vetorBotao[0] = this.verde;
			this.vetorBotao[1] = this.vermelho;
			this.vetorBotao[2] = this.amarelo;
			this.vetorBotao[3] = this.azul;
			
			
		}
	
	
	
	
		public void actionPerformed(ActionEvent e) {
			
	
		}
		
		protected void validarJogada() {
			
			if (vetorJogador.size() == vetorComputador.size()) {
				
				for (int i = 0; i < vetorJogador.size(); i++) {
					
					if (vetorJogador.get(i) != vetorComputador.get(i)) {
						JOptionPane.showMessageDialog(null, "Voce marcou " + pontos + " pontos.");
						System.out.println("Errou a sequencia. jogo será encerrado");
						
						System.exit(0);
					}
					System.out.println("Computador [" + i + "]:" + vetorComputador.get(i));
					
					
				}
				
				
				System.out.println("Acertou todas até o momento.");
				JOptionPane.showMessageDialog(null, "Parabens você passou de fase");
				JOptionPane.showMessageDialog(null, "Agora você esta na fase: " + fase);
				
			}	
		}
		
	
	    public void playSound(String soundName) {
	        try {
	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
	            Clip clip = AudioSystem.getClip();
	            clip.open(audioInputStream);
	            clip.start();
	        } catch (Exception ex) {
	            System.out.println("Erro ao executar SOM!");
	            ex.printStackTrace();
	        }
	    }
	
	}
