import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppServer {
     public static void main(String[] args) {
        try {
            FabReverseImpl factory = new FabReverseImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ReverseFactory", factory);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
