package 객사오.네_번째_장.domain;

public enum WitnessRole {
    MadHatter("모자 장수"), Chef("요리사"), Alice("엘리스");
    private final String eachRole;

    WitnessRole(final String eachRole) {
        this.eachRole = eachRole;
    }

    public String getEachRole() {
        return eachRole;
    }
}
