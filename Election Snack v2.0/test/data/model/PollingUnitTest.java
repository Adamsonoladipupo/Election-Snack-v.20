package data.model;

import exceptions.UnregisteredVoter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PollingUnitTest {
    PollingUnit pollingUnit;

    @BeforeEach
    public void setUp(){
        pollingUnit = new PollingUnit();
    }

    @Test
    public void checkIfNoCandidateIsRegisteredTest(){
        assertTrue(pollingUnit.isRegisteredCandidateEmpty());
    }

    @Test
    public void registerANewCandidateTest(){
        Candidate candidate = new Candidate("OlaAdams");
        pollingUnit.registerCandidate(candidate);
        assertFalse(pollingUnit.isRegisteredCandidateEmpty());
    }


    @Test
    public void checkIFNoVoterIsRegisteredTest(){
        assertTrue(pollingUnit.isRegisteredVotersEmpty());
    }

    @Test
    public void registerANewVoterTest(){
        Voter voter = new Voter("Adams", "adams@gmail.com");
        pollingUnit.registerVoter(voter);
        assertFalse(pollingUnit.isRegisteredVotersEmpty());
    }

    @Test
    public void checkIfPollingUnitBallotBoxIsEmpty(){
        assertTrue(pollingUnit.isBallotBoxEmpty());
    }

    @Test
    public void createAVoterAndCastItVoteInThePollingUnitTest(){
        Voter voter = new Voter("Adams", "adams@gmail.com");

        Candidate candidate = new Candidate("Ola");

        voter.setBallot(candidate);

        pollingUnit.registerVoter(voter);
        assertFalse(pollingUnit.isRegisteredVotersEmpty());
        pollingUnit.VoteForCandidate(voter);
        assertFalse(pollingUnit.isBallotBoxEmpty());
    }

    @Test
    public void castAVoteOfAVoterThatIsNotRegisteredTest(){
        Voter voter = new Voter("Adams", "adams@gmail.com");

        Candidate candidate = new Candidate("Ola");

        voter.setBallot(candidate);
        assertThrows(UnregisteredVoter.class, ()-> pollingUnit.VoteForCandidate(voter));
        assertTrue(pollingUnit.isBallotBoxEmpty());
    }
    

}