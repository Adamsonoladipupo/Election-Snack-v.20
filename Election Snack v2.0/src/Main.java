import data.model.Candidate;
import data.model.PollingUnit;
import data.model.Voter;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        PollingUnit pollingUnit = new PollingUnit();

        HashMap <String, Objects> candidate000 = new HashMap<String, Objects>();
        HashMap <String, Objects> voter000 = new HashMap<String, Objects>();

        String userInput = "10";
        while (!userInput.equalsIgnoreCase("0")){
            String menu1 = """
                Welcome to E-voting
                1. Add Candidates
                2. Add Voters
                3. Get ballot
                4. Vote for candidate
                5. See all voters
                6. see all candidates
                
                 
                """;
            System.out.print(menu1);
            System.out.print("proceed with a selection: ");
            userInput = inputCollector.nextLine();
            switch (userInput){
                case "1"-> {
                    System.out.print("Enter Candidate name: ");
                    String candidateName = inputCollector.nextLine();
                    Candidate candidate = new Candidate(candidateName);
                    pollingUnit.registerCandidate(candidate);
                    System.out.printf("Candidate id is: %s\n", candidate.getCandidateID());
                }
                case "2"-> {
                    System.out.print("Enter voter's name: ");
                    String voterName = inputCollector.nextLine();
                    System.out.println("Enter voter's email address: ");
                    String voterEmail = inputCollector.nextLine();
                    Voter voter = new Voter(voterName, voterEmail);
                    pollingUnit.registerVoter(voter);
                    System.out.printf("Congratulation!. Your voter's ID is: %s\n", voter.getVoterID());
                }
                case "3"-> {
                    System.out.print("Enter your voterID: ");
                    String voterID = inputCollector.nextLine();
                    Voter voter = pollingUnit.getVoterByID(voterID);
                    System.out.print("Enter your preferred candidateID: ");
                    String candidateID = inputCollector.nextLine();
                    Candidate candidate = pollingUnit.getCandidateByID(candidateID);
                    voter.setBallot(candidate);
                    System.out.print("Successfully set");
                }
                case "4"-> {
                    System.out.print("Enter your voterID: ");
                    String voterID = inputCollector.nextLine();
                    pollingUnit.VoteForCandidate(pollingUnit.getVoterByID(voterID));
                }

                case "5"-> {
                    for (Voter voter : pollingUnit.getRegisteredVoter()){
                        System.out.println("-----------------------------");
                        System.out.printf("VoterID: %s\n", voter.getVoterID());
                        System.out.printf("Voter's Name: %s\n", voter.getVoterName());
                        System.out.printf("Has voted: %s\n", voter.hasVoted());
                        System.out.println("-----------------------------");
                    }
                }
                case "6"-> {

                    for (Candidate candidate : pollingUnit.getRegisteredCandidates()){
                        System.out.println("-----------------------------");
                        System.out.printf("CandidateID: %s\n",candidate.getCandidateID());
                        System.out.printf("Candidate Name: %s\n", candidate.getCandidateName());
                        System.out.printf("Vote Count: %d\n", candidate.getVoteCount());
                        System.out.println("-----------------------------");
                    }
                }
                default -> {System.out.print("Invalid input: ");}
            }
        }



    }
}