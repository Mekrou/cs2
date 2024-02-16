public class Periodical extends Item {
    private short issueNum;
    
    public short getIssueNum() {
        return this.issueNum;
    }

    public void setIssueNum(short issueNum) {
        this.issueNum = issueNum;
    }

    public Periodical() { }

    public Periodical(String title, short issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    public String getListing() {
        return "Periodical Title - " + this.getTitle() + 
        "\nIssue # - " + this.getIssueNum();
    }
}
