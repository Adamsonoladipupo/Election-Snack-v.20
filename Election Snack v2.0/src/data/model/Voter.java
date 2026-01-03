package data.model;

import exceptions.EmptyBallotException;
import exceptions.InvalidEmailAddressException;
import exceptions.MulitipleVotingException;

public class Voter {
    private String voterID;
    private String voterName;
    private String voterEmail;
    private Ballot ballot;
    private static int counter = 0;
    private boolean voted = false;

    public Voter (String name, String email){
        counter++;
        this.voterName = name;
        validateEmailAddress(email);
        this.voterEmail = email;
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

    private static String generateVoterID(){
        return counter + "";
    }
}
