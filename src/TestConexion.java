
public class TestConexion {
	public static void main(String[] args) throws Exception {
		
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		}catch (IllegalStateException ex) {
			System.out.println("Ejecutando el catch");
			ex.printStackTrace();
		}
		
		/*Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch (IllegalStateException ex) {
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
		}finally {
			System.out.println("Se ejecutó el finally");
			if (con != null) {
				con.cerrar();					
			}
		}*/
	}
}
