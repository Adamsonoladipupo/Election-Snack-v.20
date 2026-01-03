package data.repository.interfaces;

import data.model.Voter;

public interface VoterRepository {
    Voter addVoter(Voter voter);
    void removeVoter(Voter voter);
    Voter findVoterByID(String voterID);
    Voter updateVoter(Voter voter);
    void deleteAllVoters(Voter voter);
}

