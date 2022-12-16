package atvdd;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class JogoDaVelha {
	static Scanner myobj = new Scanner(System.in);
	static String matriz[][] = new String[3][3], ganhador="   ",cString,lString;
	static int c,l, i=0,vezJogador=0;
	static boolean analise[][] = new boolean[3][3];
	static boolean finalizar=false,velha=false;
	
	public static void tabela(){
		JOptionPane.showMessageDialog(null, "        0  "+"        1  "+"         2  "+"\n 0  ( "+matriz[0][0]+" )     ( "+matriz[1][0]+" )     ( "+matriz[2][0]+" )\n 1  ( "+matriz[0][1]+" )     ( "+matriz[1][1]+" )     ( "+matriz[2][1]+" )\n 2  ( "+matriz[0][2]+" )     ( "+matriz[1][2]+" )     ( "+matriz[2][2]+" )");
    }
	public static void main(String[] args) {
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				analise[l][c] = true;
				analise[l][c] = true;
				matriz[l][c] = "   ";
			}
		}
		
		x();
		
		if(!ganhador.equals("   ")) {
			JOptionPane.showMessageDialog(null, ganhador+" VENCEU!!");
		}
		else if(velha == true){
			JOptionPane.showMessageDialog(null, "DEU VELHA!!");
		}
	}
	
	public static void x() {
		tabela();
		fim();
		if(finalizar==false) {
			
				JOptionPane.showMessageDialog(null, "Vez do Jogador X: ");
				cString=JOptionPane.showInputDialog("Digite a Coluna: ") ;
				lString=JOptionPane.showInputDialog("Digite a Linha: ") ;
				
				if(cString == null | lString==null) {
					JOptionPane.showMessageDialog(null, "FIM DO JOGO");
				}
				else {
					l = Integer.parseInt(lString);
					c = Integer.parseInt(cString);
					
					if(analise[c][l]== false|| analise[c][l] == false) {
						JOptionPane.showMessageDialog(null,"Jogada Inválida");
						x();
					}	
					else {
						vezJogador++;
						matriz[c][l]= "X";
						analise[c][l]= false;
						o();
					}
				}	
		}
	}
	public static void o() {
		tabela();
		fim();
		if(finalizar==false) {
				JOptionPane.showMessageDialog(null, "Vez do Jogador O: ");
				cString=JOptionPane.showInputDialog("Digite a Coluna: ") ;
				lString=JOptionPane.showInputDialog("Digite a Linha: ") ;
				
				if(cString == null | lString==null) {
					JOptionPane.showMessageDialog(null, "JOGO CANCELADO!!!");
				}
				else {
					l = Integer.parseInt(lString);
					c = Integer.parseInt(cString);
					
					if(analise[c][l]== false) {
						JOptionPane.showMessageDialog(null,"Jogada Inválida");
						o();
					}	
					else {
						vezJogador++;
						matriz[c][l]= "O";
						analise[c][l]= false;
						x();

					}
				}
		}
				
	}
	
	public static void fim() {
		
		if( !matriz[0][0].equals("   ") & !matriz[0][1].equals("   ") & !matriz[0][2].equals("   ") & !matriz[1][0].equals("   ")& !matriz[1][1].equals("   ")& !matriz[1][2].equals("   ")&  !matriz[2][0].equals("   ")&  !matriz[2][1].equals("   ")&  !matriz[2][2].equals("   ")) {
			velha = true;
			finalizar=true;
		}
			if(matriz[0][0].equals(matriz[1][0]) && matriz[2][0].equals(matriz[0][0]) & !matriz[0][0].equals("   ")){
				ganhador = matriz[0][0];
				finalizar=true;
			}
			if(matriz[0][1].equals(matriz[1][1]) && matriz[2][1].equals(matriz[0][1]) & !matriz[0][1].equals("   ")){
				ganhador = matriz[0][1];
				finalizar=true;
			}
			if(matriz[0][2].equals(matriz[1][2]) && matriz[2][2].equals(matriz[0][2]) & !matriz[0][2].equals("   ")){
				ganhador = matriz[0][2];
				finalizar=true;
			}
			if(matriz[0][0].equals(matriz[0][1]) && matriz[0][2].equals(matriz[0][0]) & !matriz[0][0].equals("   ")){
				ganhador = matriz[0][0];
				finalizar=true;
			}
			if(matriz[1][0].equals(matriz[1][1]) && matriz[1][2].equals(matriz[1][0]) & !matriz[1][0].equals("   ")){
				ganhador = matriz[1][0];
				finalizar=true;
			}
			if(matriz[2][0].equals(matriz[2][1]) && matriz[2][2].equals(matriz[2][0]) & !matriz[2][0].equals("   ")){
				ganhador = matriz[2][0];
				finalizar=true;
			}
			if(matriz[0][0].equals(matriz[1][1]) && matriz[2][2].equals(matriz[0][0]) & !matriz[0][0].equals("   ")){
				ganhador = matriz[0][0];
				finalizar=true;
			}
			if(matriz[2][0].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0]) & !matriz[2][0].equals("   ")){
				ganhador = matriz[2][0];
				finalizar=true;
			}
	}
}
