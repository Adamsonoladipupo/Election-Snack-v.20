package dtos.requests;

public class CandidateRequest {
    private String candidateName;
    private int voteCount;

    public CandidateRequest(String name){
        this.candidateName = name;
        this.voteCount = 0;
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


    public void beVotedFor(){
        this.voteCount++;
    }


}
