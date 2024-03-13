import java.rmi.Remote;
import java.rmi.RemoteException;

/** ReverseInterface */
public interface ReverseInterface extends Remote {
  public String reverse(String s) throws RemoteException;
}

