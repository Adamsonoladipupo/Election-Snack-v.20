package utils;

import data.model.Voter;
import dtos.requests.VoterRequest;
import dtos.responses.VoterResponse;

public class VoterMapper {
    public static Voter voterMapperRequest(VoterRequest request){
        Voter newVoter = new Voter();
        newVoter.setVoterName(request.getVoterName());
        newVoter.setVoterEmail(request.getVoterEmail());
        return newVoter;
    }

    public static VoterResponse voterMapperResponse(Voter voter){
        VoterResponse response = new VoterResponse();
        response.setVoterName(voter.getVoterName());
        response.setBallot(voter.getBallot().getCandidate());
        return response;
    }
}
