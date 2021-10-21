package Data;

import android.content.Context;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Player implements Serializable {
    private Integer playerID;
    private String username;

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

    private String password;
    private String fullName;
    private Integer bestScore = 0;
    public static Integer playerCount = 1;


    public Player(String fullName, String username){
        this.fullName = fullName;
        this.username = username;
        password = "saint123";
        this.playerID = playerCount;
        playerCount++;
    }

    public static void savePlayer(Context context, Player player) throws IOException {
        FileOutputStream fos = context.openFileOutput("plater.dat", Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(player);
        os.close();
        fos.close();
    }


}
