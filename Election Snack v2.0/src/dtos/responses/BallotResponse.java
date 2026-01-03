package dtos.responses;

import data.model.Candidate;

public class BallotResponse {
    private Candidate candidate;

    public BallotResponse(Candidate candidate){
        this.candidate = candidate;
    }

    public BallotResponse(){
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
