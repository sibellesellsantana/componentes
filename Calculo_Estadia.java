package estadia_componente_reutilizavel;

public class Calculo_Estadia implements valor_estadia {
	double valorEstadia;
	double totalRefeicao;
	int noites;
	double estadia;
	double imposto;
	double totalLigacao;
	double r;
	Refeicao refeicao = new Refeicao ();
	Ligacao ligacao = new Ligacao ();
	
	
	public void setNoites(int n) {
		this.noites = n;
	}
	
	public void setEstadia(double b) {
		this.estadia = b;
	}
	
	
	public void setImposto(double i) {
		this.imposto = i;
	}

	public int getNoites() {
		return noites;
	
	}
	
	public double getEstadia() {
		return estadia;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void valorTotalRefeicao(double r) {
		refeicao.setRefeicao(r);
		totalRefeicao += refeicao.getRefeicao();
	}
	
	public void valorTotalLigacao(double l) {
		ligacao.setLigacao(l);
		totalLigacao += ligacao.getLigacao();
	}
	
	public double getvalorTotalRefeicao() {
		return totalRefeicao;
	}
	
	public double getvalorTotalLigacao() {
		return totalLigacao;
	}
	
	
	public double calcular() {
		
		valorEstadia = getNoites()*getEstadia()+ getvalorTotalRefeicao() + getvalorTotalLigacao();
		valorEstadia = valorEstadia +(getImposto()/100*valorEstadia);
		return valorEstadia;
	
	}
}
