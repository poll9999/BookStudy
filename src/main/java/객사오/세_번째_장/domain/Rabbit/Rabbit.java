package 객사오.세_번째_장.domain.Rabbit;

import static 객사오.세_번째_장.domain.Enum.Role.Rab;
import 객사오.세_번째_장.domain.object.Standard;

public class Rabbit extends Standard {
    public Rabbit() {
        super();
        this.role = Rab.getEachRole();
    }
}
