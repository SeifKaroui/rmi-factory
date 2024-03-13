import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseImpl extends UnicastRemoteObject implements ReverseInterface {
  protected ReverseImpl() throws RemoteException {
    super();
  }

  @Override
  public String reverse(String s) {

    StringBuilder reversed = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      reversed.append(s.charAt(i));
    }
    return reversed.toString();
  }
}
