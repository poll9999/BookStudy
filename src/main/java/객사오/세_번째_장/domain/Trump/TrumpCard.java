package 객사오.세_번째_장.domain.Trump;

import static 객사오.세_번째_장.domain.Enum.Role.Tru;

import 객사오.세_번째_장.domain.object.Standard;

public class TrumpCard extends Standard {
    public TrumpCard() {
        super();
        this.canLieAndTurn = true;
        this.role = Tru.getEachRole();
    }
}
