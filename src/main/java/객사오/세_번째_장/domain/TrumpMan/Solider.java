package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Sol;

public class Solider extends trumpMan {
    public Solider() {
        super();
        this.haveClover = true;
        this.role = Sol.getEachRole();
    }
}
