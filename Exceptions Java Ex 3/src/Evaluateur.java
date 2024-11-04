public class Evaluateur {
    public Evaluateur() {
    }
    public void verifierNote(int number) throws NoteInvalideException{
        if (number<0 || number>20)
        {
            throw new NoteInvalideException(number);
        }
    }
    public static void main(String[] args) throws NoteInvalideException {
        Evaluateur evaluateur=new Evaluateur();
        try {
            evaluateur.verifierNote(25);
        }
        catch (NoteInvalideException e)
        {
            e.printStackTrace();
        }

    }
}
