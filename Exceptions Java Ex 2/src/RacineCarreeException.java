public class RacineCarreeException extends Exception {
    public RacineCarreeException(int number){
        super("C'est une exception de type RacineCarreeException. Nombre négatif : " + number + '.');
    }

}
