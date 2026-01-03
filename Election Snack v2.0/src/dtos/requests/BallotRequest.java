package dtos.requests;

import data.model.Candidate;

public class BallotRequest {
    private Candidate candidate;

    public BallotRequest(Candidate candidate){
        this.candidate = candidate;
    }

    public BallotRequest(){
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
