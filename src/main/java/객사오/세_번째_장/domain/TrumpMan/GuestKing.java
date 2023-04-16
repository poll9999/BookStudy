package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Gu;

public class GuestKing extends trumpMan {
    public GuestKing() {
        super();
        this.walkInRow = true;
        this.role = Gu.getEachRole();
    }
}
