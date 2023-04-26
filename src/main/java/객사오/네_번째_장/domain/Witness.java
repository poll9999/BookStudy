package 객사오.네_번째_장.domain;

public class Witness {
    public boolean canTestify = false;
    public boolean inTrial = true;
    public String name;

    public Witness(String role) {
        this.name = role;
    }

    public String getName() {
        return this.name;
    }
}
