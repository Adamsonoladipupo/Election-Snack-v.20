package utils;

import data.model.Candidate;
import dtos.requests.CandidateRequest;
import dtos.responses.CandidateResponse;

public class CandidateMapper {

    public static Candidate candidateRequestMapper(CandidateRequest request){
        Candidate newCandidate = new Candidate(request.getCandidateName());
        return newCandidate;

    }

    public static CandidateResponse candidateResponseMapper (Candidate candidate){
        CandidateResponse response = new CandidateResponse(candidate.getCandidateName());
        return response;
    }
}
