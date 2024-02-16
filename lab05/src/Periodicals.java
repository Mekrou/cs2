public class Periodicals extends Item {
    private short issueNum;
    
    public short getIssueNum() {
        return this.issueNum;
    }

    public void setIssueNum(short issueNum) {
        this.issueNum = issueNum;
    }

    public Periodicals() { }

    public Periodicals(String title, short issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    public String getListing() {
        return "Periodical Title - " + this.getTitle() + 
        "\nIssue # - " + this.getIssueNum();
    }
}
