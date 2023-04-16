package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Ki;

public class King extends trumpMan {
    public King() {
        super();
        this.haveKing = true;
        this.role = Ki.getEachRole();
    }
}
