import javax.tools.JavaCompiler;
import java.awt.event.ActionListener;

/**
 * @author HealingAura
 * @version 1.0
 * @created 30-Apr-2011 1:18:15 PM
 */
public class ClientService {

	private UserInformation currentUser;
	private ConcereteFileObserver[] filesObserved;
	public ServiceListener m_ServiceListener;
	public UpdateFileClient m_UpdateFileClient;

	public ClientService(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param file
	 */
	public void AddFile(File file){

	}

	/**
	 * 
	 * @param user
	 */
	public int ChangeUser(UserInformation user){
		return 0;
	}

	/**
	 * 
	 * @param fileChanged
	 */
	private void ClientFileChanged(ActionListener fileChanged){

	}

}