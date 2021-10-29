package Data;

import android.content.Context;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {
    private Integer playerID;
    private String username;
    private String password;
    private String fullName;
    private Integer bestScore = 0;
    public static Integer playerCount = 1;

    public void setBestScore(Integer bestScore) { this.bestScore = bestScore; }

    public Integer getPlayerID() {
        return playerID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getBestScore() {
        return bestScore;
    }

    public static Integer getPlayerCount() {
        return playerCount;
    }

    public Player(String fullName, String username){
        this.fullName = fullName;
        this.username = username;
        password = "a";
        this.playerID = playerCount;
        playerCount++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerID, player.playerID) && Objects.equals(username, player.username)
                && Objects.equals(password, player.password) && Objects.equals(fullName, player.fullName)
                && Objects.equals(bestScore, player.bestScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerID);
    }

    public void savePlayer(Context context, Player player) throws IOException {
        FileOutputStream fos = context.openFileOutput("plater.dat", Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(player);
        os.close();
        fos.close();
    }


}
