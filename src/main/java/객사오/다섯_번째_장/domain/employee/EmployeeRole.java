package 객사오.다섯_번째_장.domain.employee;

public enum EmployeeRole {
    ASSISTANT("대리"),
    GM("부장"),
    INTERN("인턴"),
    MANAGER("과장");

    private final String eachRole;

    EmployeeRole(final String role) {
        this.eachRole = role;
    }

    public String getRole() {
        return eachRole;
    }
}
