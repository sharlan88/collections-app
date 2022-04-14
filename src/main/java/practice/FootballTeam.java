package practice;

import java.util.*;

public class FootballTeam extends Team<FootballPlayer> {
    private static Map<String, Collection<FootballPlayer>> mapOfFootballTeams = new HashMap<>();

    public FootballTeam(int budget, String teamName, String headCoachName) {
        super(budget, teamName, headCoachName);
        if(getPlayers() != null && getPlayers().size() > 0){
            mapOfFootballTeams.put(teamName, getPlayers());
        }
    }

    @Override
    public FootballPlayer buyPlayer(FootballPlayer newPlayer) {
        // -- Budget
        reduceBudget(newPlayer.getExp() * newPlayer.getRate() * newPlayer.getTalent());
        // ++ Players
        if(addPlayer(newPlayer)) return newPlayer;
        return null;
    }

    @Override
    public FootballPlayer sellPlayer(FootballPlayer delPlayer) {
        addBudget(delPlayer.getExp() * delPlayer.getRate() * delPlayer.getTalent());
        if(removePlayer(delPlayer)) return  delPlayer;
        return  null;
    }

    public Collection<FootballPlayer> getPlayers(){
        Set<FootballPlayer> fplayers = (HashSet<FootballPlayer>)super.getPlayers();
        if(fplayers != null)
            return  Collections.unmodifiableCollection(fplayers);
        return  null;
    }

}
