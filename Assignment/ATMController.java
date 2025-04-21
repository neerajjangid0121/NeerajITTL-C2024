package Assignment;

public class ATMController {
    ATMService service;
    ATMDatabase db;

    ATMController(){
        service = new ATMService();
        db = new ATMDatabase();
    }

    public void handleUserRequests(){
        service.displayMessagesForInput();
        service.takeInput();
        try{
            db.establishConnection();
            service.ValidatePin();
            service.processRequest();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
