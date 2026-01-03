package dtos.requests;

import data.model.Ballot;
import data.model.Candidate;
import exceptions.EmptyBallotException;
import exceptions.InvalidEmailAddressException;
import exceptions.MulitipleVotingException;

public class VoterRequest {
    private String voterName;
    private String voterEmail;
    private Ballot ballot;
    private boolean voted = false;

    public VoterRequest(String name, String email){
        this.voterName = name;
        validateEmailAddress(email);
        this.voterEmail = email;
    }



    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterEmail() {
        return voterEmail;
    }

    public void setVoterEmail(String voterEmail) {
        this.voterEmail = voterEmail;
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

    public void validateEmailAddress(String email){
        boolean hasAt = false; boolean hasDot = false;
        for (int check = 0; check < email.length(); check++){
            char character = email.charAt(check);
            if(character == '@') hasAt = true;
            if (character == '.') hasDot = true;
        }
        if(!hasAt || !hasDot) throw new InvalidEmailAddressException("Invalid, please enter a valid email address");
    }

}
