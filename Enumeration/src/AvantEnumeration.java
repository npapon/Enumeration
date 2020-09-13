
public class AvantEnumeration {

    public static final int CHEMIN1 = 1;
    public static final int CHEMIN2 = 2;

    public void prendreUnChemin( int chemin ) {

        if ( chemin == CHEMIN1 ) {
            System.out.println( "J'ai pris le chemin 1" );

        }

        else if ( chemin == CHEMIN2 ) {
            System.out.println( "J'ai pris le chemin 2" );
        } else {

            System.out.println( "Je suis perdu" );
        }

    }

    public static void main( String[] args ) {
        AvantEnumeration avantEnumaration = new AvantEnumeration();
        avantEnumaration.prendreUnChemin( AvantEnumeration.CHEMIN1 );

    }

}
