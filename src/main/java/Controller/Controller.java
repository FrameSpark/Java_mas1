package Controller;

public class Controller {
    public void print(String request)
    {
        System.out.println(request);
    }
    public void printMenu()
    {
        print("1 - Get a size");
        print("2 - Add an element");
        print("3 - Delete an element by index");
        print("4 - Change an element by index");
        print("5 - Show an array");
        print("6- Show element by index");
        print("0 - Exit");
        print("Press action: ");
    }
}
