package data.repository.interfaces;

import data.model.Candidate;

public interface CandidateRepository {
    Candidate addCandidate(Candidate candidate);
    void removeCandidate(Candidate candidate);
    Candidate findCandidateByID(String candidateID);
    void deleteAllCandidates();
    boolean isCandidateExist(String candidateID);

}
