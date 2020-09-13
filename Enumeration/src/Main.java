import enumerations.LangagesProgrammation;
import enumerations.LangagesProgrammationAmeliores;

public class Main {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub

        System.out.println( LangagesProgrammation.JAVA.toString() );

        // JAVA

        for ( LangagesProgrammation langage : LangagesProgrammation.values() ) {

            System.out.println( langage.toString() );
            if ( langage.equals( LangagesProgrammation.JAVA ) ) {
                System.out.println( "C'est mon langage préféré" );
            }
        }

        System.out.println( "----------" );

        for ( LangagesProgrammationAmeliores langage : LangagesProgrammationAmeliores.values() ) {

            System.out.println( langage.toString() );
            if ( langage.equals( LangagesProgrammation.JAVA ) ) {
                System.out.println( "C'est mon langage préféré" );
            }
        }

    }

}
