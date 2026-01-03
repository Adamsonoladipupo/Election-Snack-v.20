package data.model;

import exceptions.UnregisteredVoter;

import java.util.ArrayList;

public class PollingUnit {
    private BallotBox ballotBox;
    private ArrayList<Candidate> registeredCandidates = new ArrayList<>();
    private ArrayList<Voter> registeredVoters = new ArrayList<>();
    private int counter;


    public PollingUnit(){
        this.ballotBox = new BallotBox();
    }

    public boolean isBallotBoxEmpty(){
        return this.ballotBox.isEmpty();
    }

    public boolean isRegisteredCandidateEmpty(){
        return this.registeredCandidates.isEmpty();
    }

    public boolean isRegisteredVotersEmpty(){
        return this.registeredVoters.isEmpty();
    }

    public void registerCandidate(Candidate candidate) {
        registeredCandidates.add(candidate);
    }

    public void registerVoter(Voter voter){
        registeredVoters.add(voter);
    }

    public void VoteForCandidate(Voter voter) {
        if (!registeredVoters.contains(voter)) throw new UnregisteredVoter("Voter not register");
        else {
            ballotBox.castVote(voter.getBallot());
            voter.vote();
        }

    }
}
