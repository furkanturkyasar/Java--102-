import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Team> teamList = new ArrayList<>();

        teamList.add(new Team("Galatasaray"));
        teamList.add(new Team("Bursaspor"));
        teamList.add(new Team("Fenerbahçe"));
        teamList.add(new Team("Beşiktaş"));
        teamList.add(new Team("Başakşehir"));
        teamList.add(new Team("Trabzonspor"));

        MatchGenerator matchGenerator = new MatchGenerator();
        matchGenerator.getFixtures(teamList);
        List<List<Match>> all= matchGenerator.getFixtures(teamList);
        matchGenerator.printRound(all);
    }

}
