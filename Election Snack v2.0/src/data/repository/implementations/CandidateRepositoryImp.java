package data.repository.implementations;

import data.model.Candidate;
import data.repository.interfaces.CandidateRepository;

public class CandidateRepositoryImp implements CandidateRepository {
    @Override
    public Candidate addCandidate(Candidate candidate) {
        return null;
    }

    @Override
    public void removeCandidate(Candidate candidate) {

    }

    @Override
    public Candidate findCandidateByID(String candidateID) {
        return null;
    }

    @Override
    public void deleteAllCandidates() {

    }

    @Override
    public boolean isCandidateExist(String candidateID) {
        return false;
    }
}
