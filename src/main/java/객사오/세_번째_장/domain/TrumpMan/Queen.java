package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Qu;

public class Queen extends trumpMan {
    public Queen() {
        super();
        this.haveQueen = true;
        this.role = Qu.getEachRole();
    }
}
