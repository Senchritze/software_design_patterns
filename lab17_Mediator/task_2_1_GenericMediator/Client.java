public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague ui = new UserInterface("UI");
        Colleague service = new BusinessLogic("Service");
        Colleague db = new Database("Database");

        mediator.registerColleague(ui);
        mediator.registerColleague(service);
        mediator.registerColleague(db);

        System.out.println("Mediator pattern demo:");
        System.out.println();

        ui.sendMessage("Request user data", "Service");
        service.sendMessage("SELECT * FROM users", "Database");
        db.sendMessage("User data is ready", "Service");
        service.sendMessage("Show user data on screen", "UI");
    }
}
