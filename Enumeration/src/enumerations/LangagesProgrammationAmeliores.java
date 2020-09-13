package enumerations;

public enum LangagesProgrammationAmeliores {

    C( "Langage de vieu", "Code block" ), JAVA( "Mon langage", "Eclipse" ), PYTHON( "Le tueure de JAVA", "Visual Studio" );

    private String commentaire = "";
    private String IDE         = "";

    LangagesProgrammationAmeliores( String commentaire, String IDE ) {
        this.commentaire = commentaire;
        this.IDE = IDE;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String getIDE() {
        return IDE;
    }

    public String toString() {
        return getCommentaire() + " - " + getIDE();
    }
}
