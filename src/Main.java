import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<String, Alumno> map = new HashMap<String, Alumno>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1 para entrar nuevo alumno /n" +
	"2 para buscar alumno por DNI /n 3 para salir del programa /n");
		
		while (true) {
		String s = br.readLine();
		if(s.equals("1"))
		{
			 System.out.println("Nom");
			 System.out.println();
			 String sNom = br.readLine();
			 
			 System.out.println("Cognom /n");
			 System.out.println();
			 String sApellido = br.readLine();
			 
			 System.out.println("DNI /n");
			 System.out.println();
			 String sDNI = br.readLine();
			 
			 Alumno al = new Alumno();
			 al.setNombre(sNom);
			 al.setApellidos(sApellido);
			 al.setDni(sDNI);
			 
			 map.put(sDNI, al);
			 
			 System.out.println("1 para entrar nuevo alumno /n" +
						"2 para buscar alumno por DNI /n 3 para salir del programa /n");
		}
		else if(s.equals("2")){
			System.out.println("Indiqueu DNI: /");
			 String sDNItoSearch = br.readLine();
			 if(map.containsKey(sDNItoSearch)){
				 Alumno alu = map.get(sDNItoSearch);
				 System.out.println("Alumno:" + alu.getNombre() + " " + alu.getApellidos() );
			 }
			 else{
				 System.out.println("Ups! este no está... lo siento ;-)");
			 }
			 System.out.println("DNI: \n");
		}
		else if(s.equals("3")){
			System.exit(1);
		}
		else System.out.println("Esta no es una opción válida... 1,2 o 3 tu elijes!");
		}
	}

}
