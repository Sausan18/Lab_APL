class Main
{
    public static void main(String[] args) {
        Bebek pelari = new BebekPelari();
        Kucing britania = new Britania();
        Kucing kucingBebek =  new KucingBersuaraBebek(pelari);

        System.out.println("Kucing Britania bersuara ");
        britania.suara();

        System.out.println("Bebek Pelari bersuara");
        pelari.suara();

        System.out.println("Kucing Bersuara Bebek bersuara ");
        kucingBebek.suara();
    }
}