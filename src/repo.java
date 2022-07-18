import java.util.ArrayList;

public class repo 
{
    private ArrayList<concurent> concurenti;

    public repo(){}

    public void add(concurent x)
    {
        concurenti.add(x);
    }

    // overload
    public void add(int poz,concurent x)
    {
        concurenti.add(poz, x);
    }

    
}
