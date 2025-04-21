package Assignment;

public class ATMDatabase {
    public void establishConnection() throws Exception {
        if (!ATMVariables.CONNECTION_STATUS.equals("Available")) {
            throw new Exception("Unable to connect to the server.");
        }
    }
}
