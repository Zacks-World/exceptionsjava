public class Vehicule {
    public Vehicule() {
    }
    public void testVitesse(int number) throws TropViteException{

        if (number>90)
            throw  new TropViteException(90);
    }
    public static void main(String[] args) throws TropViteException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vehicule vehicule=new Vehicule();
        vehicule.testVitesse(10);
        vehicule.testVitesse(100);
    }
}
