package Data;

import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
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

    public Player(String fullName, String username, String password){
        this.fullName = fullName;
        this.username = username;
        this.password = password;
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
        FileOutputStream fos = context.openFileOutput("player.dat", Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(player);
        os.close();
        fos.close();
    }

   /* public Player getPlayerData(Context context, Player player) throws IOException {
        FileInputStream fis = new FileInputStream();
        ObjectInputStream ois = new ObjectInputStream(fis);
        Player playerData = null;
        try {
            playerData = (Player) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ois.close();
        fis.close();
        return playerData;
    } */

}
