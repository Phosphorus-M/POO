package tp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Probador {

	static String br = System.getProperty("line.separator");

	private String[] entradas;
	private String[] salidasEsperadas;
	private ArrayList<String> salidasObtenidas = new ArrayList<String>();

	/**
	 * @return the entradas
	 */
	public String[] getEntradas() {
		return entradas;
	}

	/**
	 * @param entradas the entradas to set
	 */
	public void setEntradas(String[] entradas) {
		this.entradas = entradas;
	}

	/**
	 * @return the salidasEsperadas
	 */
	public String[] getSalidasEsperadas() {
		return salidasEsperadas;
	}

	/**
	 * @param salidasEsperadas the salidasEsperadas to set
	 */
	public void setSalidasEsperadas(String[] salidasEsperadas) {
		this.salidasEsperadas = salidasEsperadas;
	}

	/**
	 * @return the salida
	 */
	public ArrayList<String> getSalida() {
		return salidasObtenidas;
	}

	/**
	 * @param salida the salida to set
	 */
	public void setSalida(String salida) {
		this.salidasObtenidas.add(salida);
	}

	public void reiniciar() {
		this.salidasObtenidas = new ArrayList<String>();
	}

	public Probador(){
		this.cargarEntradasYSalidas();
	}

	private void cargarEntradasYSalidas(){
		this.setEntradas(new String[8]);
		this.setSalidasEsperadas(new String[8]);

		Scanner sc;

		try{
			for (int i = 0; i < 8; i++) {
				this.getEntradas()[i] = "";
				sc = new Scanner(new File(".//Entradas//entrada" + (i+1) + ".in"));
				while (sc.hasNextLine()) {
					this.getEntradas()[i] += sc.nextLine();
					if (sc.hasNextLine()) this.getEntradas()[i] += br;
				}
				sc.close(); sc = null;

				this.getSalidasEsperadas()[i] = "";

				sc = new Scanner(new File(".//Salidas//salida" + (i+1) + ".out"));
				while (sc.hasNextLine()) {
					this.getSalidasEsperadas()[i] += sc.nextLine();
					if (sc.hasNextLine()) this.getSalidasEsperadas()[i] += br;
				}
				sc.close(); sc = null;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public void probar(String pathExe, char letra){

		for (int i = 0; i<this.getEntradas().length; i++){
			this.generarEntrada(i);
			this.ejecutarExe(pathExe);
			this.leerSalida();

		}
		this.guardarResultado(pathExe, letra);


	}

	private void generarEntrada(int numeroEntrada){
		try{
			System.out.println("Generando entrada " + numeroEntrada);
			BufferedWriter fw = new BufferedWriter(new FileWriter("entrada.in"));
			fw.write(this.getEntradas()[numeroEntrada]);
			fw.close();
			System.out.println("Entrada generada" + numeroEntrada);
		}catch(Exception e){
			System.out.println(e);
		}

	}

	private void ejecutarExe(String pathExe){
		try{
			System.out.println("Ejecutando " + pathExe);
			Process p = Runtime.getRuntime().exec(pathExe);
			p.waitFor();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Finalizada la ejecucion de " + pathExe);
	}

	private void leerSalida(){
		try{
			System.out.println("Leyendo salida ");
			String salida = "";
			Scanner sc = new Scanner(new File("salida.out"));
			while (sc.hasNextLine()) {
				salida += sc.nextLine();
				if (sc.hasNextLine()) salida += br;
			}

			this.setSalida(salida);
			sc.close();
			System.out.println(this.getSalida());
		}catch(Exception e){
			System.out.println(e);
		}
	}

	private void guardarResultado(String pathExe, char letra){
		String htr = "		<tr>";
		String htrC = "		</tr>";
		String htd = "				<td>";
		String htDC = "				</td>";
		try{
			System.out.println("Generando resultado ");


			Path path = Paths.get(".//Templates//template.html");
			List<String> lista = Files.readAllLines(path, StandardCharsets.UTF_8);
			int indice = lista.indexOf(new String("          <!-- Generacion -->"));
			lista.add(indice++, htr);
			lista.add(indice++, "        <td  rowspan=\""+ this.getEntradas().length +"\"> " + pathExe +htDC);
			lista.add(indice++, htd + new String(this.getEntradas()[0]).replaceAll(br, "</br>") + htDC);
			lista.add(indice++, htd + new String(this.getSalidasEsperadas()[0]).replaceAll(br, "</br>") + htDC);
			lista.add(indice++, htd + this.getSalida().get(0).replaceAll(br, "</br>") + htDC);
			lista.add(indice++, "        <td  rowspan=\""+ this.getEntradas().length +"\"> " + "<!-- Completar -->" + htDC);
			lista.add(indice++, htrC);

			for (int i = 1; i < this.getEntradas().length; i++) {
				lista.add(indice++, htr);
				lista.add(indice++, htd + new String(this.getEntradas()[i]).replaceAll(br, "</br>") + htDC);
				lista.add(indice++, htd + new String(this.getSalidasEsperadas()[i]).replaceAll(br, "</br>") + htDC);
				lista.add(indice++, htd + this.getSalida().get(i).replaceAll(br, "</br>") + htDC);
				lista.add(indice++, htrC);
			}

			Path salidas = Paths.get(".//Analisis/Resultados de " + letra +".html");
			Files.write(salidas, lista, StandardCharsets.UTF_8);

			System.out.println("Resultado generado");
			this.reiniciar();
		}catch(Exception e){
			System.out.println(e);
		}
	}





}
