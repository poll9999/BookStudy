package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Gar;

public class Gardner extends trumpMan {
    public Gardner() {
        super();
        this.canPaint = true;
        this.role = Gar.getEachRole();
    }
}
