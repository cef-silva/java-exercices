import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
	public static void main(String[] args)  {
		try {
			ICalculadora calc = new Calculadora();
			String objName = "rmi://localhost/Calc";
			
			System.out.println("Registrando o objeto");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(objName, calc);
			
			System.out.println("Aguardando Clientes!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
