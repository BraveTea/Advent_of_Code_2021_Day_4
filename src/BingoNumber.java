public class BingoNumber {
    final private int bingoNumber;
    private boolean marked = false;

    public BingoNumber(int bingoNumber) {
        this.bingoNumber = bingoNumber;
    }

    public BingoNumber(int bingoNumber, boolean marked) {
        this.bingoNumber = bingoNumber;
        this.marked = marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public int getBingoNumber() {
        return bingoNumber;
    }

    public boolean isMarked() {
        return marked;
    }

    @Override
    public String toString() {
        return "BingoNumber{" +
                "bingoNumber=" + bingoNumber +
                ", marked=" + marked +
                '}';
    }
}
