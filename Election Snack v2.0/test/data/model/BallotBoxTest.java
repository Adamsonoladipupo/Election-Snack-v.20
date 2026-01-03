package data.model;

import exceptions.DuplicateBallotException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallotBoxTest {

    @Test
    public void checkIfBallotBoxIsEmptyTest() {
        BallotBox ballotBox = new BallotBox();
        assertTrue(ballotBox.isEmpty());
    }

    @Test
    public void AddABallotInTheBallotBox() {
        BallotBox ballotBox = new BallotBox();
        assertTrue(ballotBox.isEmpty());
        Ballot ballot = new Ballot();
        ballotBox.castVote(ballot);
        assertFalse(ballotBox.isEmpty());
    }

    @Test
    public void AddOneBallotInTheBallotBoxMoreThanOnceTest(){
        BallotBox ballotBox = new BallotBox();
        assertTrue(ballotBox.isEmpty());
        Ballot ballot = new Ballot();
        ballotBox.castVote(ballot);
        assertFalse(ballotBox.isEmpty());
        assertThrows(DuplicateBallotException.class, ()-> ballotBox.castVote(ballot));
    }
}