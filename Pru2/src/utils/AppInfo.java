package utils;

public class AppInfo {

	public static void Info(String appName, String version, String database, String usuario, String server) {
		System.out.println("***************************************************************************************");
		System.out.println("-- Nombre de Aplicaci�n: " + appName);
		System.out.println("-- Versi�n de Aplicaci�n: " + version);
		System.out.println("-- Nombre de la Base de Datos: " + database);
		System.out.println("-- Usuario de Base de Datos: " + usuario); 
		System.out.println("-- Hostname de la Base de Datos: "+ server);
		System.out.println("***************************************************************************************");
	}
}
