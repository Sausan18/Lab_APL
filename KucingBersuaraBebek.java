public class KucingBersuaraBebek implements Kucing {
    private Bebek bebek;
    
    public KucingBersuaraBebek(Bebek bebek)
    {
        this.bebek = bebek;
    }

    @Override
    public void suara()
    {
        bebek.suara();
    }
    
}
