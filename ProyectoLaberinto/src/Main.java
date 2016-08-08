public class Main {
	public static void main(String[] args) {
		Maze m = new Maze();
		//Salida
		m.getMaze()[1][1] = "X";
		
		// Posicion inicial
		m.solve(14, 1);
		System.out.println(m);
		
	}
}
