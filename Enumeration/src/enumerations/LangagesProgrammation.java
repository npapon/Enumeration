package enumerations;

public enum LangagesProgrammation {

    // ATTENTION A BIEN METTRE DANS CE SENS

    C( "Langage de Vieux" ), JAVA( "Mon Langage" ), PYTHON( "Hum le tueur de JAVA" ), SQL( "Mes débuts" );

    private String commentaire;

    LangagesProgrammation( String commentaire ) {
        this.commentaire = commentaire;
    }

    public String toString() {
        return this.name() + " : " + this.commentaire;
    }

}
