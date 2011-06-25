import javax.xml.crypto.Data;
import java.sql.Date;

/**
 * @author HealingAura
 * @version 1.0
 * @created 30-Apr-2011 1:18:15 PM
 */
public class ConcereteFileObserver extends FileObserver {

	private File file;
	private Date observerState;
	public ServerService m_ServerService;

	public ConcereteFileObserver(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public void Update()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
	 * 
	 * @param file
	 */
	public void Update(Data file){

	}

}