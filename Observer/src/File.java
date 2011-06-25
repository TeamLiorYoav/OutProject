

/**
 * @author HealingAura
 * @version 1.0
 * @created 30-Apr-2011 1:18:15 PM
 */
public class File {

	protected int fileID;
	private FileObserver[] observers;

	public File(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param obs1
	 */
	public void Attach(FileObserver obs1){

	}

	/**
	 * 
	 * @param obs
	 */
	public void Detach(FileObserver obs){

	}

	public void Notify(){

	}

}