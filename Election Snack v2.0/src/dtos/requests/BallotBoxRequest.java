package dtos.requests;

import data.model.Ballot;
import exceptions.DuplicateBallotException;

import java.util.ArrayList;

public class BallotBoxRequest {
    private ArrayList<Ballot> ballotBox = new ArrayList<>();
    private int counter;

    public boolean isEmpty(){
        return ballotBox.isEmpty();
    }

    public void castVote(Ballot ballot){
        if (ballotBox.contains(ballot)) throw new DuplicateBallotException("Sorry, only one unique ballot is allowed");
        else {
            ballotBox.add(ballot);
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }

    public ArrayList<Ballot> getBallotBox() {
        return ballotBox;
    }
}
