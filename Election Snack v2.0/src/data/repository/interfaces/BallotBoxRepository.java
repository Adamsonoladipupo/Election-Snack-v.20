package data.repository.interfaces;

import data.model.BallotBox;

public interface BallotBoxRepository {
    BallotBox addBallotBox(BallotBox ballotBox);
    void removeBallotBox(BallotBox ballotBox);

}
