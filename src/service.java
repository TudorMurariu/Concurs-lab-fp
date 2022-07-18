public class service 
{
    private repo Repo;
    private static int id_count = 1000;

    public service(repo Repo)
    {
        this.Repo = Repo;
    }

    // adauga la final
    public void add(int scor)
    {
        concurent x = new concurent(scor, id_count);
        Repo.add(x);
    }

    // adauga la o pozitie data
    public void add(int scor,int poz)
    {
        concurent x = new concurent(scor, id_count);
        Repo.add(poz,x);
    }
}
