public class App {
    public static void main(String[] args)
    {
        repo Repo = new repo();
        service srv = new service(Repo);
        console ui = new console(srv);

        ui.start();
    }
}
