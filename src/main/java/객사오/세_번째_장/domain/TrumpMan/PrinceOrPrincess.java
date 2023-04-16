package 객사오.세_번째_장.domain.TrumpMan;

import static 객사오.세_번째_장.domain.Enum.Role.Pri;

public class PrinceOrPrincess extends trumpMan {
    public PrinceOrPrincess() {
        super();
        this.holdHands = true;
        this.role = Pri.getEachRole();
    }
}
