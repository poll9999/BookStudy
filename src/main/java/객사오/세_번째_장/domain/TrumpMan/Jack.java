package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Ja;

public class Jack extends trumpMan {
    public Jack() {
        super();
        this.haveJack = true;
        this.role = Ja.getEachRole();
    }
}
