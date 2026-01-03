package data.model;

public class Candidate {
    private String candidateID;
    private String candidateName;
    private int voteCount;
    private static int counter = 0;

    public Candidate (String name){
        counter++;
        this.candidateName = name;
        this.voteCount = 0;
        this.candidateID = generateCandidateID();
    }

    public static int getCounter() {
        return counter;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void beVotedFor(){
        this.voteCount++;
    }

    private static String generateCandidateID(){
        return counter + "";
    }

}
