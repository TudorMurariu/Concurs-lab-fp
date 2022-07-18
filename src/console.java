import java.util.Scanner;
import java.util.ArrayList;

public class console 
{
    private service srv;
    public console(service srv)
    {
        this.srv = srv;
    }

    // starts the UI
    public void start()
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Comenzile sunt:");
        System.out.println("0 - exit");
        System.out.println("1 - adauga la final");
        System.out.println("2 - adauga la pozitia data");
        System.out.println("3 - afiseaza lista");
        //System.out.println();

        while(true)
        {
            System.out.println("Introduceti o comanda:");
            String command = cin.nextLine();

            switch(command)
            {
                case "0":
                    cin.close();
                    return;
                case "1":
                    System.out.println("Scorul de adaugat:");
                    try{
                        int x = cin.nextInt();
                        cin.nextLine();
                        srv.add(x);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case "2":
                System.out.println("Scorul de adaugat:");
                    try{
                        int x = cin.nextInt();
                        cin.nextLine();
                        System.out.println("la pozitia :");
                        int poz = cin.nextInt();
                        cin.nextLine();
                        System.out.println(x + " " + poz);
                        srv.add(poz, x);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case "3":
                    ArrayList<concurent> list = srv.get_list();
                    for(var x : list)
                        System.out.println(x.id + " " + x.scor);
                    break;

            }
        }
    }
}
