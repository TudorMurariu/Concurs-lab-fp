import java.util.ArrayList;

public class repo 
{
    private ArrayList<concurent> concurenti;

    public repo()
    {
        concurenti = new ArrayList<concurent>();
    }

    public void add(concurent x)
    {
        concurenti.add(x);
    }

    // overload
    public void add(int poz,concurent x)
    {
        concurenti.add(poz, x);
    }

    // returns the list
    public ArrayList<concurent> get_list()
    {
        return this.concurenti;
    }
}
