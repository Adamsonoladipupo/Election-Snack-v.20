package data.model;

public class Ballot {
    private Candidate candidate;

    public Ballot (Candidate candidate){
        this.candidate = candidate;
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
