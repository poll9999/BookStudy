package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Cou;

public class Courtier extends trumpMan {
    public Courtier() {
        super();
        this.haveDiamond = true;
        this.role = Cou.getEachRole();
    }
}
