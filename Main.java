//criando um baralho
import java.util.Random;

public class Main{
	public static void main(String[] args){

		Baralho baralho = new Baralho();

		baralho.inicializarBaralho();
		baralho.embaralhar();
		baralho.comprarCarta();
	}
}
class Baralho{
	private Carta[] baralho = new Carta[112];


public void inicializarBaralho(){

		int i;

		int index = 0;

		for(i = 0; i<2; i++){ //inicializa cartas do tipo numérica (2 de cada)		
			for(int j = 0; j<10; j++){
				this.baralho[index++] = new Carta(Carta.AZUL, j); //usar o this antes de atributo
				this.baralho[index++] = new Carta(Carta.VERMELHO, j);
				this.baralho[index++] = new Carta(Carta.VERDE, j);
				this.baralho[index++] = new Carta(Carta.AMARELO, j);
				}
		}

		
		for(i = 0; i<2; i++){ //cartas de ação com cor (2 de cada)
			this.baralho[index++] = new Carta(Carta.BLOQ, Carta.AZUL);
			this.baralho[index++] = new Carta(Carta.BLOQ, Carta.VERMELHO);
			this.baralho[index++] = new Carta(Carta.BLOQ, Carta.VERDE);
			this.baralho[index++] = new Carta(Carta.BLOQ, Carta.AMARELO);

			this.baralho[index++] = new Carta(Carta.MAIS2, Carta.AZUL);
			this.baralho[index++] = new Carta(Carta.MAIS2, Carta.VERMELHO);
			this.baralho[index++] = new Carta(Carta.MAIS2, Carta.AMARELO);
			this.baralho[index++] = new Carta(Carta.MAIS2, Carta.VERDE);

			this.baralho[index++] = new Carta(Carta.INVERTE, Carta.AZUL);
			this.baralho[index++] = new Carta(Carta.INVERTE, Carta.VERMELHO);
			this.baralho[index++] = new Carta(Carta.INVERTE, Carta.VERDE);
			this.baralho[index++] = new Carta(Carta.INVERTE, Carta.AMARELO);

		}

		for(i = 0; i<4; i++){ //cartas de ação sem cor(4 de cada)
			this.baralho[index++] = new Carta(Carta.MAIS4);
			this.baralho[index++] = new Carta(Carta.TROCACOR);
		}

		//impressão do baralho (80 cartas numéricas, 24 de ação com cor e 8 de ação sem cor)
		for(i = 0; i<80; i++){
			System.out.println(baralho[i].getNumero()+" "+baralho[i].getCor()+"\n");
		}

		for(i = 80; i<104; i++){
			System.out.println(baralho[i].getAcao()+" "+baralho[i].getCor()+"\n");
		}

		for(i = 104; i<baralho.length; i++){
			System.out.println(baralho[i].getAcao()+"\n");

		}

	}


	public void embaralhar(){

		int i;
		
		int embaralhar[];

		embaralhar = new int[112];

		Random random = new Random();

		for(i=0; i<112; i++){
			embaralhar[i] = random.nextInt(112); //gera números aleatórios até 112
		}

		for(i=0; i<112; i++){ //os numeros gerados viram posições no baralho
			baralho[i] = baralho[embaralhar[i]];
		}

		for(i=0; i<112; i++){
			System.out.println(baralho[i].getAcao()+" "+baralho[i].getCor()+" "+baralho[i].getNumero()); //impressão do baralho embaralhado
		}

	}


	public void comprarCarta(){

		int i;

		Carta compra = baralho[0]; //a carta comprada é a da posição 0 do baralho

		int n = baralho.length;

		for(i=0; i<n-1; i++){ //diminui uma posição do baralho
			baralho[i] = baralho[i+1]; //as cartas se movem uma posição para trás
		}

		n = n-1; // decremento do tamanho do baralho

		System.out.println("\n\n"+compra.getNumero()+" "+compra.getCor()+" "+compra.getAcao()); //impressão da carta comprada
	
	}


	public void ReceberCarta(){ //recebe uma carta descartada novamente na pilha do baralho

	} 
}
