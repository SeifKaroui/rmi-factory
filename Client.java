import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
       public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            FabReverseInterface factory = (FabReverseInterface) registry.lookup("ReverseFactory");
            ReverseInterface remoteObject = factory.newReverse();
            System.out.println(remoteObject.reverse("Hello World!"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
