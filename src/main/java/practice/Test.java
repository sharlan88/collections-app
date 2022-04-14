package practice;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer("Leo", "Messi", 35, 13 , 89, 92);
        FootballPlayer fp2 = new FootballPlayer("C", "Ronaldo", 34, 12 , 87, 93);
        FootballPlayer fp3 = new FootballPlayer("S", "Ramos", 37, 13 , 67, 76);
        FootballPlayer fp4 = new FootballPlayer("G", "Bale", 29, 7 , 86, 88);

        FootballPlayer fp5 = new FootballPlayer("X", "Stranger", 29, 7 , 86, 88);

        Set<FootballPlayer> fplayers = new HashSet<>(Arrays.asList(fp1, fp2, fp3, fp4));

        FootballTeam fTeam = new FootballTeam(100000, "All Stars", "Zidane");
        fTeam.setPlayers(fplayers);

        fTeam.sellPlayer(fp3);
        fTeam.buyPlayer(fp5);

        for(FootballPlayer player: fTeam.getPlayers()){
            System.out.println(player);
            fTeam.getPlayers().remove(player);
        }

      //  fTeam.getPlayers().iterator();


    }
}


