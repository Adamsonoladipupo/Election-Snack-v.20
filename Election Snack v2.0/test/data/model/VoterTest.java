package data.model;

import exceptions.EmptyBallotException;
import exceptions.InvalidEmailAddressException;
import exceptions.MulitipleVotingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoterTest {
    Voter voter;

    @BeforeEach
    public void setUp(){

    }

    @Test
    public void confirmOneVoterIsCreated(){
        voter = new Voter ("ola", "ola@gnail.com");
        assertEquals("1", voter.getVoterID());
    }

    @Test
    public void createAnVoterWithAnInvalidEmailTest(){
        assertThrows(InvalidEmailAddressException.class, ()-> voter = new Voter("ola", "ola.com"));
    }

    @Test
    public void creataANewVoterAndCheckIfCandidateBallotIsEmpty(){
        voter = new Voter ("ola", "ola@gnail.com");
        assertEquals("1", voter.getVoterID());
        assertTrue(voter.ballotIsEmpty());
    }

    @Test
    public void createANewVoterAndSetItBallotWithACandidate(){
        voter = new Voter ("ola", "ola@gnail.com");
        //assertEquals(1, Voter.getCounter());
        assertEquals("1", voter.getVoterID());
        assertTrue(voter.ballotIsEmpty());
        //create a candidate
        Candidate candidate = new Candidate("oladipupo");
        voter.setBallot(candidate);
        assertFalse(voter.ballotIsEmpty());
    }

    @Test
    public void createANewVoterAndVoteWithAnEmptyBallotTest(){
        voter = new Voter ("ola", "ola@gnail.com");
        assertEquals("1", voter.getVoterID());
        assertTrue(voter.ballotIsEmpty());
        assertThrows(EmptyBallotException.class, ()-> voter.vote());
        assertFalse(voter.isVoted());
    }

    @Test
    public void creatsANewVoterAndWithVoteTest(){
        voter = new Voter ("ola", "ola@gnail.com");
        assertEquals("1", voter.getVoterID());
        assertTrue(voter.ballotIsEmpty());
        Candidate candidate = new Candidate("adams");
        voter.setBallot(candidate);
        assertFalse(voter.ballotIsEmpty());
        voter.vote();
        assertTrue(voter.isVoted());
    }

    @Test
    public void creatsANewVoterAndWithVoteMoreThanOnceTest(){
        voter = new Voter ("ola", "ola@gnail.com");
        assertEquals("1", voter.getVoterID());
        assertTrue(voter.ballotIsEmpty());
        Candidate candidate = new Candidate("adams");
        voter.setBallot(candidate);
        assertFalse(voter.ballotIsEmpty());
        voter.vote();
        assertThrows(MulitipleVotingException.class, ()-> voter.vote());
    }

}