package data.model;

public class Ballot {
    private String ballotID;
    private Candidate candidate;
    private static int counter = 0;

    public Ballot (Candidate candidate){
        counter++;
        this.candidate = candidate;
        this.ballotID = generateBallotID();
    }

    private String generateBallotID(){
        return counter + "";
    }

    public String getBallotID(){
        return this.ballotID;
    }

    public Ballot  (){
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public boolean isEmpty() {
        return this.candidate == null;
    }

}
