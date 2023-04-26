package 객사오.네_번째_장.domain;

public class Rabbit {
    protected boolean callWitness = false;

    public void callWitness(Witness witness) {
        if (callWitness) {
            witness.canTestify = true;
        }
    }
}
