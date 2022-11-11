public class Notas {
	
	private String nombre;
	private int ID;
	private String Materia;
	private double parcial1;
	private double parcial2;
	private double parcial3;
	
	public Notas () {
		nombre = " ";
		ID = 0;
		Materia = " ";
		parcial1= 0;
		parcial2= 0;
		parcial3= 0;
	}
	
	public Notas(String nombre, int ID, String Materia, Double parcial1, Double parcial2, Double parcial3) {
		
		this.nombre = nombre;
		this.ID = ID;
		this.Materia = Materia;
		this.parcial1= parcial1;
		this.parcial2= parcial2;
		this.parcial3= parcial3;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}

	public double getParcial1() {
		return parcial1;
	}

	public void setParcial1(double parcial1) {
		this.parcial1 = parcial1;
	}

	public double getParcial2() {
		return parcial2;
	}

	public void setParcial2(double parcial2) {
		this.parcial2 = parcial2;
	}

	public double getParcial3() {
		return parcial3;
	}

	public void setParcial3(double parcial3) {
		this.parcial3 = parcial3;
	}
}
    

