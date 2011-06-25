

/**
 * @author HealingAura
 * @version 1.0
 * @created 30-Apr-2011 1:18:14 PM
 */
public class ClientGUI extends WindowGUI {

	public QueriesCreation m_QueriesCreation;
	public DataBaseHandlerClient m_DataBaseHandlerClient;
	public ClientService m_ClientService;

	public ClientGUI(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public void UpdateWindow(String[] files)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void UpdateWindow()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
	 * 
	 * @param user
	 */
	public int ChangeServiceUser(UserInformation user){
		return 0;
	}

}