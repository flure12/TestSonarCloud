package com.floriankleewein.commonclasses.Network;

import com.esotericsoftware.kryonet.Client;
import com.floriankleewein.commonclasses.User.User;

public class AddPlayerSuccessMsg extends BaseMessage{

    private String playerName;
    private User user;
    private boolean playerAdded = false;
    private int feedbackUI;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String userName) {
        this.playerName = userName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isPlayerAdded() {
        return playerAdded;
    }

    public void setPlayerAdded(boolean playerAdded) {
        this.playerAdded = playerAdded;
    }
    public void setFeedbackUI(int i){
        this.feedbackUI = i;
    }
    public int getFeedbackUI(){
        return this.feedbackUI;
    }

}






