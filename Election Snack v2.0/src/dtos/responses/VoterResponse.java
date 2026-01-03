package dtos.responses;

import data.model.Ballot;
import data.model.Candidate;
import exceptions.EmptyBallotException;
import exceptions.InvalidEmailAddressException;
import exceptions.MulitipleVotingException;

public class VoterResponse {
    private String voterID;
    private String voterName;
    private Ballot ballot;
    private static int counter = 0;
    private boolean voted = false;

    public VoterResponse(){}

    public VoterResponse(String name, String email){
        counter++;
        this.voterName = name;
        this.voterID = generateVoterID();
    }



    public static int getCounter(){
        return counter;
    }

    public String getVoterID() {
        return voterID;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public Ballot getBallot() {
        return ballot;
    }

    public void setBallot(Candidate candidate) {
        Ballot newBallot = new Ballot(candidate);
        this.ballot = newBallot;
    }

    public boolean ballotIsEmpty(){
        return this.ballot == null;
    }

    public void vote(){
        if(isVoted()) throw new MulitipleVotingException("Sorry only one vote is allowed");
        if (ballotIsEmpty()) throw new EmptyBallotException("Empty ballot. please set ballot candidate");
        else this.voted = true;;
    }

    public boolean isVoted(){
        return voted;
    }

    private static String generateVoterID(){
        return counter + "";
    }
}
