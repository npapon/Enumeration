import enumerations.LangagesProgrammation;

public class ApresEnumeration {

    /*
     * ON DEGAGE public static final int CHEMIN1 = 1; public static final int
     * CHEMIN2 = 2;
     */
    public void prendreUnChemin( LangagesProgrammation langageProgrammation ) {

        if ( langageProgrammation == LangagesProgrammation.C ) {
            System.out.println( LangagesProgrammation.C.toString() );

        }

        else if ( langageProgrammation == LangagesProgrammation.JAVA ) {
            System.out.println( LangagesProgrammation.JAVA.toString() );
        } else {

            System.out.println( "Le code c'est trop dur" );
        }

    }

    public static void main( String[] args ) {
        ApresEnumeration apresEnumaration = new ApresEnumeration();
        apresEnumaration.prendreUnChemin( LangagesProgrammation.JAVA );

    }

}
