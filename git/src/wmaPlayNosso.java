import problema1.wmaPlay;

public class wmaPlayNosso extends wmaPlay implements FormatoAudio {

	@Override
	public void abrir(String string) {
		setFile(string);
		open();
		setLocation(0);
	}

	@Override
	public void reproduzir() {
		play();
	}

	@Override
	public void pausar() {
		stop();
	}

	@Override
	public void parar() {
		stop();
		stop();		
	}

	@Override
	public void avancar(int valor) {
		setLocation(getLocation() + valor); 		
	}

	@Override
	public void retornar(int valor) {
		setLocation(getLocation() - valor); 
		
	}

	@Override
	public void liberar() {}
}