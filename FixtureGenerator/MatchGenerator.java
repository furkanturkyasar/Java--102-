import java.util.*;

public class MatchGenerator {

    public List<List<Match>> getFixtures(ArrayList<Team> teamList) {
        int numberOfTeams = teamList.size();
        if (numberOfTeams % 2 != 0) {
            teamList.add(new Team("Bay"));
        }
        Collections.shuffle(teamList);

        int totalRound = teamList.size() - 1;
        int perRoundMatch = teamList.size() / 2;
        printTeams(teamList);
        List<List<Match>> rounds = new LinkedList<>();

        for (int i = 0; i < totalRound; i++) {
            List<Match> matches = new LinkedList<>();
            //System.out.println("Round " + (i + 1));
            for (int j = 0; j < perRoundMatch; j++) {
                int homeTeam = (i + j) % (numberOfTeams - 1);
                int awayTeam = (numberOfTeams - 1 - j + i) % (numberOfTeams - 1);

                if (j == 0) {
                    awayTeam = numberOfTeams - 1;
                }
                matches.add(new Match(teamList.get(homeTeam).getTeamName(), teamList.get(awayTeam).getTeamName()));
                //System.out.println(teamList.get(homeTeam).getTeamName() + " vs " + teamList.get(awayTeam).getTeamName());
            }
            rounds.add(matches);
            System.out.println();

        }

        for (int roundNumber = 0; roundNumber < rounds.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Match match = rounds.get(roundNumber).get(0);
                rounds.get(roundNumber).set(0, new Match(match.getAwayTeam(), match.getHomeTeam()));
            }
        }

        List<List<Match>> reverseFixtures = new LinkedList<>();
        for (List<Match> round : rounds) {
            List<Match> reverseRound = new LinkedList<>();
            for (Match match : round) {
                reverseRound.add(new Match(match.getAwayTeam(), match.getHomeTeam()));
            }
            reverseFixtures.add(reverseRound);
        }
        rounds.addAll(reverseFixtures);

        return rounds;

    }

    public void printRound(List<List<Match>> all) {
        int count = 1;
        for (List<Match> round : all) {
            System.out.println("--------" + count + ". Round --------");
            count++;
            for (Match match : round) {
                System.out.println(match.getHomeTeam() + " - " + match.getAwayTeam());
            }
        }
    }

    public void printTeams(ArrayList<Team> teamList) {
        System.out.println("----------Takımlar----------");
        for (Team team : teamList) {
            System.out.println(team.getTeamName());
        }
        System.out.println();
    }
}
