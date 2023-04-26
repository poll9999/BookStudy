package 객사오.네_번째_장.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import 객사오.네_번째_장.domain.Judge;
import static 객사오.네_번째_장.domain.JudgeRole.Queen;
import static 객사오.네_번째_장.domain.JudgeRole.King;
import static 객사오.네_번째_장.domain.WitnessRole.MadHatter;
import static 객사오.네_번째_장.domain.WitnessRole.Chef;
import static 객사오.네_번째_장.domain.WitnessRole.Alice;

import 객사오.네_번째_장.domain.Rabbit;
import 객사오.네_번째_장.domain.Witness;
import 객사오.네_번째_장.view.View;

import java.io.IOException;

public class Controller {
    private static Judge judge;
    private static final View view = new View();
    private static final Rabbit rabbit = new Rabbit();
    private static final Witness hatter = new Witness(MadHatter.getEachRole());
    private static final Witness chef = new Witness(Chef.getEachRole());
    private static final Witness alice = new Witness(Alice.getEachRole());
    private static final HashMap<Witness, String> witnessList = new HashMap<>();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        putWitnessInTrial();
        view.youAreJudge();
        String judgeRole = br.readLine();
        makeJudge(judgeRole);
        judge.startTrial();
        runTrial(judgeRole);
    }

    private static void runTrial(String judgeRole) throws IOException {
        while (!witnessList.isEmpty()) {
            String witnessRole = view.startTrial(judgeRole, witnessList.values());
            Witness witness = getWitnessByRole(witnessRole);

            judge.callRabbit(rabbit);
            rabbit.callWitness(witness);
            view.callRabbitToTrial(witnessRole);
            handleWitnessStatement(witnessRole);
            handleLikeOrDislike(witnessRole, witness);
        }
        view.noWitness();
        view.endTrial();
    }

    private static Witness getWitnessByRole(String witnessRole) {
        for (Witness key : witnessList.keySet()) {
            if (witnessList.get(key).equals(witnessRole)) {
                return key;
            }
        }
        return null;
    }

    private static void handleWitnessStatement(String witnessRole) {
        if (witnessRole.equals(MadHatter.getEachRole())) {
            view.hatterSay();
        } else if (witnessRole.equals(Chef.getEachRole())) {
            view.chefSay();
        } else {
            view.aliceSay();
        }
    }

    private static void handleLikeOrDislike(String witnessRole, Witness witness) throws IOException {
        String likeOrDislike = view.likeOrDislike(witnessRole);
        String endOrRestart = outOrIn(likeOrDislike, witness);
        view.inTrialNow(witnessList.values());
        judge.callRabbitNo(rabbit);
        if (endOrRestart.equals("Y")) {
            view.endTrial();
            judge.endTrial();
            System.exit(0);
        }
    }

    public static String outOrIn(String likeOrDislike, Witness witness) throws IOException {
        if (likeOrDislike.equals("N")) {
            view.byeByeWitness(witness.getName());
            judge.getOutTrial(witness);
            witnessList.remove(witness);
        }
        return view.OKWitness();
    }

    public static void makeJudge(String role) {
        makeJudgeKing(role);
        makeJudgeQueen(role);
    }

    public static void makeJudgeQueen(String role) {
        if (role.equals("여왕")) {
            judge = new Judge(Queen.getEachRole());
        }
    }

    public static void makeJudgeKing(String role) {
        if (role.equals("왕")) {
            judge = new Judge(King.getEachRole());
        }
    }

    public static void putWitnessInTrial() {
        witnessList.put(hatter, MadHatter.getEachRole());
        witnessList.put(chef, Chef.getEachRole());
        witnessList.put(alice, Alice.getEachRole());
    }
}
