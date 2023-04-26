package 객사오.네_번째_장.domain;

public class Judge {
    public boolean readyToTrial = false;
    protected String name;

    public Judge(String role) {
        this.name = role;
    }

    public void startTrial() {
        this.readyToTrial = true;
    }

    public void callRabbit(Rabbit rabbit) {
        rabbit.callWitness = true;
    }
    public void callRabbitNo(Rabbit rabbit) {
        rabbit.callWitness = false;
    }

    public void getOutTrial(Witness witness) {
        witness.inTrial = false;
    }

    public void endTrial() {
        this.readyToTrial = false;
    }
}
