package 객사오.세_번째_장.domain.Enum;

public enum Role {
    Tru("Trump Card"),
    Rab("Rabbit"),
    Gar("Gardner"),
    Sol("Solider"),
    Cou("Courtier"),
    Pri("Prince or Princess"),
    Gu("Guest King Or Queen"),
    Ja("Heart Jack"),
    Ki("Heart King"),
    Qu("Heart Queen");

    private final String eachRole;

    Role(final String eachRole) {
        this.eachRole = eachRole;
    }

    public String getEachRole() {
        return eachRole;
    }
}
