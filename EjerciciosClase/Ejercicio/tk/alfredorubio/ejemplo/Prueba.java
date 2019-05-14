package tk.alfredorubio.ejemplo;

// import java.util.ArrayList;

public class Prueba {
	

	public static void main(String[] args) {

		for (int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		Prueba p = new Prueba();
		p.saluda();


	}

	private void saluda() {
		System.out.println("Hola a todos");
	}

}


