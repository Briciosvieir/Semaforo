package semaforo;

public enum CoresDoSemaforoeNum {
	VERDE(4000), AMARELO(2000), VERMELHO(2000);
	
	private int tempo;
	

	CoresDoSemaforoeNum(int tempo) {

		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}

	

}
