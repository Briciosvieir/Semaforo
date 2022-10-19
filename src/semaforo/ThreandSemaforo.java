package semaforo;

public class ThreandSemaforo implements Runnable{
	
	private CoresDoSemaforoeNum cor;
	private boolean stop;
	private boolean corMudou;
	
	public ThreandSemaforo() {
		this.cor = CoresDoSemaforoeNum.VERMELHO;
		this.stop = false;
		this.corMudou= false;
		
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		
		while (!stop) {
			try {
				Thread.sleep(this.cor.getTempo());
				this.nextColor();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
		

	private synchronized void nextColor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CoresDoSemaforoeNum.VERDE;
			break;

		case AMARELO:
			this.cor = CoresDoSemaforoeNum.VERMELHO;
			break;
			
		case VERDE:
			this.cor = CoresDoSemaforoeNum.AMARELO;
			break;
			
		default:
			break;
		}
		this.corMudou = true;
		notify();
		
	}
	
	public synchronized void esperarCorMudar() {
		
		while (!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {e.printStackTrace();	}
			
			
		}
		
		this.corMudou = false;
	}


	public CoresDoSemaforoeNum getCor() {
		return cor;
	}

	
	
	
	}


