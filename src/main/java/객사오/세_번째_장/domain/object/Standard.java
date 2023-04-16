package 객사오.세_번째_장.domain.object;

public abstract class Standard {
    protected boolean canLieAndTurn;
    protected boolean canWalk;
    protected boolean canPaint;
    protected boolean haveClover;
    protected boolean haveDiamond;
    protected boolean holdHands;
    protected boolean walkInRow;
    protected boolean haveJack;
    protected boolean haveKing;
    protected boolean haveQueen;
    protected String role;

    protected Standard() {
        this.canLieAndTurn = false;
        this.canWalk = false;
        this.canPaint = false;
        this.haveClover = false;
        this.haveDiamond = false;
        this.holdHands = false;
        this.walkInRow = false;
        this.haveJack = false;
        this.haveKing = false;
        this.haveQueen = false;
    }

    public boolean returnCanLieAndTurn() {
        return canLieAndTurn;
    }

    public boolean returnCanWalk() {
        return canWalk;
    }

    public boolean returnCanPaint() {
        return canPaint;
    }

    public boolean returnHaveClover() {
        return haveClover;
    }

    public boolean returnHaveDiamond() {
        return haveDiamond;
    }

    public boolean returnHoldHands() {
        return holdHands;
    }

    public boolean returnWalkInRow() {
        return walkInRow;
    }

    public boolean returnHaveJack() {
        return haveJack;
    }

    public boolean returnHaveKing() {
        return haveKing;
    }

    public boolean returnHaveQueen() {
        return haveQueen;
    }

    public String getRole() {
        return role;
    }
}
