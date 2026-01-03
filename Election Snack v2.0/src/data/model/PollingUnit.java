package data.model;

import exceptions.UnregisteredVoter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class PollingUnit {
    private BallotBox ballotBox;
    private ArrayList<Candidate> registeredCandidates = new ArrayList<>();
    private ArrayList<Voter> registeredVoters = new ArrayList<>();

    private HashMap<String, Object> regVoter = new HashMap<String, Object>();
    private HashMap<String, Object> regCandidate = new HashMap<String, Object>();

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

    public Voter getVoterByID(String voterID){
        for (Voter voter : registeredVoters){
            if (voter.getVoterID().equals(voterID)){
                return voter;
            }
        }
        return null;
    }

    public Candidate getCandidateByID(String candidateID){
        for (Candidate candidate : registeredCandidates){
            if (candidate.getCandidateID().equals(candidateID)){
                return candidate;
            }
        }
        return null;
    }

    public void registerCandidate(Candidate candidate) {
        registeredCandidates.add(candidate);
        regCandidate.put(candidate.getCandidateID(), candidate);
    }

    public void registerVoter(Voter voter){
        registeredVoters.add(voter);
        regVoter.put(voter.getVoterID(), voter);
    }

    public void VoteForCandidate(Voter voter) {
        if (!registeredVoters.contains(voter)) throw new UnregisteredVoter("Voter not register");
        else {
            ballotBox.castVote(voter.getBallot());
            voter.vote();
        }

    }

    public ArrayList<Voter> getRegisteredVoter(){
        return registeredVoters;
    }

    public ArrayList<Candidate> getRegisteredCandidates() {
        return registeredCandidates;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
