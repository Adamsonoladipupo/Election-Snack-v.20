package data.repository.interfaces;

import data.model.Ballot;

public interface BallotRepository {
    Ballot addBallot(Ballot ballot);
    void removeBallot(Ballot ballot);
    Ballot updateBallot(Ballot ballot);
}
