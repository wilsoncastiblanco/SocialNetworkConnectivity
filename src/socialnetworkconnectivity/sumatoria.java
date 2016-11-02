import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class sumatoria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("sumatoria.in"));
			String linea;
			while((linea=br.readLine())!=null){
				int suma=0;
				String datos[] = linea.split(" ");
				int mayor=Integer.parseInt(datos[0]);
				int menor=Integer.parseInt(datos[0]);
				for(int i=0; i<datos.length; i++){
					suma+=Integer.parseInt(datos[i]);
					if(Integer.parseInt(datos[i])<menor){
						menor=Integer.parseInt(datos[i]);
					}
					if(Integer.parseInt(datos[i])>mayor){
						mayor=Integer.parseInt(datos[i]);
					}
				}
				System.out.println(suma+menor+mayor);								
			}						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
