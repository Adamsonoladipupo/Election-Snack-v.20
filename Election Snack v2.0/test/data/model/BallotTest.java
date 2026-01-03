package data.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BallotTest {

    @Test
    public void createANewEmptyBallotTest(){
        Ballot ballot = new Ballot();
        assertTrue(ballot.isEmpty());
    }

    @Test
    public void CreateANewBallotAndSetItCandidate(){
        Ballot ballot = new Ballot();
        assertTrue(ballot.isEmpty());
        // create a new candidate to set a candidate to the ballot
        Candidate candidate = new Candidate("Adamson");
        ballot.setCandidate(candidate);
        assertFalse(ballot.isEmpty());
    }

}