//criando uma carta (exemplo professor)

//por mais que conseguimos escrever mais de uma classe por arquivo, isso não é interessante > cada classe com seu arquivo
//camelCase começar com maiusculo
//nada no plural
//toda classe é publica (raro privado)

public class Carta{
	//definir aqui as caracteristicas que a carta tem
	//conjunto de informações sobre as cartas
	public final static String MAIS2 = "+2";//todas as instancias de carta precisam conhecer essa função, ela não altera de acordo com o objeto
	public final static String MAIS4 = "+4";
	public final static String BLOQ = "bloqueia";
	public final static String INVERTE = "reverso";
	public final static String TROCACOR = "trocaCor";

	public final static String AZUL = "azul";
	public final static String VERDE = "verde";
	public final static String VERMELHO = "vermelho";
	public final static String AMARELO = "amarelo";

	//atributos privados. não posso acessa-los diretamente -> preciso construir um metodo que me de acesso a ele (get e set)
	private String cor; //nesse momento será representado como string
	private int numero;
	//pode construir herança. como?
	private String acao; //preciso expressar ação mesmo que as cartas em si não expressem ação

	//definir o construtor da carta(quais as infos que eu preciso para instanciar um objeto do tipo carta)
	public Carta(String c, int num){//cor e numero. maioria das cartas
		this.cor = c; //this = esse objeto
		this.numero = num;
		this.acao = null; //cartas de numero não tem ação

	}

	public Carta(String c, String ac){//carta especial com cor. recebe com e ação.
		this.cor = c;
		this.acao = ac;
		this.numero = -1;

	}

	public Carta(String ac){//carta especial sem cor
		this.cor = null;
		this.acao = ac;
		this.numero = -1;

	}
	public String getCor(){
		return this.cor;
	}
	public String getAcao(){
		return this.acao;
	}
	public int getNumero(){
		return this.numero;
	}

	public void setCor(String c){
		this.cor = c;
	}
	public void setAcao(String ac){
		this.acao = ac;
	}
	public void setNumero(int num){
		this.numero = num;
	}

}
