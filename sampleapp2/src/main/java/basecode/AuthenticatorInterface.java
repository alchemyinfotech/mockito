package basecode;

public interface AuthenticatorInterface {

    /**
     * User authentication method definition.
     *
     * @param username The user name to authenticate.
     * @param password The password to authenticate the user.
     * @return True if the user has been authenticated; false if it has not.
     * @throws EmptyCredentialsException If the received credentials (user name, password) are
     * empty.
     */
	public boolean authenticateUser(String username, String password) throws EmptyCredentialsException;
	
	/**
	 * A dummy method that does nothing.
	 */
	public void foo();

}
