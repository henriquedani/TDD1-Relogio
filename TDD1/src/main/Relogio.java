package main;

public class Relogio {
	private int horas;
	private int minutos;
	private int segundos;

	public Relogio() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	public void configurarRelogio(int horas, int minutos, int segundos) {
		if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		} else {
			this.horas = 0;
			this.minutos = 0;
			this.segundos = 0;
			
		}
	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}
}
