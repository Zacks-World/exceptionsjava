public class Calculateur {
    public Calculateur() {
    }
    public void testRacineCarre(int number) throws RacineCarreeException{
        if (number<0)
            throw new RacineCarreeException(number);
    }
    public static void main(String[] args ) throws RacineCarreeException {
        Calculateur calculateur = new Calculateur();
        try{
            calculateur.testRacineCarre(25);
        }
        catch (RacineCarreeException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            calculateur.testRacineCarre(-5);
        }
        catch (RacineCarreeException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
