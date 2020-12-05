
public class Personaje {
	private String nombre;
	private int vida;
	private int dano;
	
	public Personaje(String nombre, int vida, int dano) {
		this.nombre = nombre;
		this.vida=vida;
		this.dano=dano;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
	
	public void recibirDano(int danoFinal){
		vida-=danoFinal;
		
	}
	
	public int atacar(){
		int danoFinal=dano;
		
		int random = (int) Math.floor(Math.random()*(11-1)+1);
		
		if(random<=3) {
			
			danoFinal*=2;
		
		}
		
		return danoFinal;
		
	}
	
	public boolean vivo(int vida) { 
		boolean muerto=false;
		
		if(vida<0){
			
			muerto=true;
			
		}
		
		return muerto;
		
	}
	
	
}
	
	
