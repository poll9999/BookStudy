package 객사오.네_번째_장.domain;

public enum JudgeRole {
    Queen("여왕"), King("왕");
    private final String eachRole;
    JudgeRole(final String eachRole) {
        this.eachRole = eachRole;
    }

    public String getEachRole() {
        return eachRole;
    }
}