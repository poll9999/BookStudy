package 객사오.세_번째_장.controller;

import java.io.IOException;
import 객사오.세_번째_장.domain.Rabbit.Rabbit;
import 객사오.세_번째_장.domain.Trump.TrumpCard;
import 객사오.세_번째_장.domain.TrumpMan.Courtier;
import 객사오.세_번째_장.domain.TrumpMan.Gardner;
import 객사오.세_번째_장.domain.TrumpMan.GuestKing;
import 객사오.세_번째_장.domain.TrumpMan.Jack;
import 객사오.세_번째_장.domain.TrumpMan.King;
import 객사오.세_번째_장.domain.TrumpMan.PrinceOrPrincess;
import 객사오.세_번째_장.domain.TrumpMan.Queen;
import 객사오.세_번째_장.domain.TrumpMan.Solider;
import 객사오.세_번째_장.view.View;

public class Controller {
    private static final Rabbit rabbit = new Rabbit();
    private static final TrumpCard card = new TrumpCard();
    private static final Gardner gardner = new Gardner();
    private static final Solider solider = new Solider();
    private static final Courtier courtier = new Courtier();
    private static final PrinceOrPrincess princeOrPrincess = new PrinceOrPrincess();
    private static final GuestKing guestKing = new GuestKing();
    private static final Jack jack = new Jack();
    private static final King king = new King();
    private static final Queen queen = new Queen();
    private static final View view = new View();

    public static void main(String[] args) throws IOException {
        view.youAreAlice();
        firstQuest();
    }


    public static void firstQuest() throws IOException {
        if (view.rabbitOrTrump().equals("X")) {
            view.answer(rabbit.getRole());
            view.rabbitSpecialization(rabbit.returnCanLieAndTurn());
        } else {
            secondQuest();
        }
    }

    public static void secondQuest() throws IOException {
        if (view.trumpOrTrumpMan().equals("X")) {
            view.answer(card.getRole());
            view.cardSpecialization(card.returnCanWalk());
        } else {
            thirdQuest();
        }
    }

    public static void thirdQuest() throws IOException {
        if (view.isGardener().equals("O")) {
            view.answer(gardner.getRole());
            view.gardnerSpecialization(gardner.returnCanPaint());
        } else {
            fourthQuest();
        }
    }

    public static void fourthQuest() throws IOException {
        if (view.isSolider().equals("O")) {
            view.answer(solider.getRole());
            view.soldierSpecialization(solider.returnHaveClover());
        } else {
            fifthQuest();
        }
    }

    public static void fifthQuest() throws IOException {
        if (view.isCourtier().equals("O")) {
            view.answer(courtier.getRole());
            view.courtierSpecialization(courtier.returnHaveDiamond());
        } else {
            sixthQuest();
        }
    }

    public static void sixthQuest() throws IOException {
        if (view.isPrinceOrPrincess().equals("O")) {
            view.answer(princeOrPrincess.getRole());
            view.princeSpecialization(princeOrPrincess.returnHoldHands());
        } else {
            seventhQuest();
        }
    }

    public static void seventhQuest() throws IOException {
        if (view.isGuestKing().equals("O")) {
            view.answer(guestKing.getRole());
            view.GuestSpecialization(guestKing.returnWalkInRow());
        } else {
            eighthQuest();
        }
    }

    public static void eighthQuest() throws IOException {
        if (view.isJack().equals("O")) {
            view.answer(jack.getRole());
            view.JackSpecialization(jack.returnHaveJack());
        } else {
            ninthQuest();
        }
    }

    public static void ninthQuest() throws IOException {
        if (view.isKing().equals("O")) {
            view.answer(king.getRole());
            view.KingSpecialization(king.returnHaveKing());
        } else {
            tenthQuest();
        }
    }

    public static void tenthQuest() throws IOException {
        if (view.isQueen().equals("O")) {
            view.answer(queen.getRole());
            view.QueenSpecialization(queen.returnHaveQueen());
        } else {
            System.out.println("보기 외에 것을 선택하셨습니다.");
            System.exit(0);
        }
    }
}
