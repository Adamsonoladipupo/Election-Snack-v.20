package data.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidateTest {


    @Test
    public void checkIfACandidateHaveBeenCreatedTest(){
        assertEquals(0, Candidate.getCounter());
    }

    @Test
    public void CreateANewCandidateTest(){
        Candidate candidate1 = new Candidate("Oladipupo");
        assertEquals("1", candidate1.getCandidateID());
        assertEquals(1, Candidate.getCounter());
    }

    @Test
    public void createANewCandidateAndIncreaseItVoteCountBy1Test(){
        Candidate candidate1 = new Candidate("Oladipupo");
        assertEquals(1, Candidate.getCounter());
        candidate1.beVotedFor();
        assertEquals(1, candidate1.getVoteCount());
    }

}