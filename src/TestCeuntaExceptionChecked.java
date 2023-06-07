
public class TestCeuntaExceptionChecked {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		}catch (Exception ex) {
			System.out.println("Exception atrapado");
		}
		
	}
}
