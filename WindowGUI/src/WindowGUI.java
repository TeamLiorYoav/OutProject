

/**
 * @author HealingAura
 * @version 1.0
 * @created 30-Apr-2011 1:18:16 PM
 */
public abstract class WindowGUI {

	public ShowFiles m_ShowFiles;
	public UserAuthentication m_UserAuthentication;

	public WindowGUI(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param files
	 */
	public abstract void UpdateWindow(String[] files);

	public abstract void UpdateWindow();

}