package com.floriankleewein.commonclasses.Network;

import com.floriankleewein.commonclasses.Board.Board;
import com.floriankleewein.commonclasses.Cards.Card;
import com.floriankleewein.commonclasses.Game;
import com.floriankleewein.commonclasses.GameLogic.GameHandler;
import com.floriankleewein.commonclasses.User.User;

import java.util.HashMap;
import java.util.Map;


public class GameUpdateMsg extends BaseMessage {
    private Game game;
    private Board board;
    private User activeUser;
    private Card playedCard;
    private Card clickedCard;
    private GameHandler gameHandler;
    private Map<User, Integer> victoryPointsChange = new HashMap<>();

    public GameUpdateMsg() {
        for (User u : game.getPlayerList()) {
            victoryPointsChange.put(u, 0);
        }
    }

    public Card getClickedCard() {
        return clickedCard;
    }

    public void setClickedCard(Card clickedCard) {
        this.clickedCard = clickedCard;
    }

    public int getVictoryPointsChange(User user) {
        for (Map.Entry<User, Integer> entry : victoryPointsChange.entrySet()) {
            if (entry.getKey().getUserName().equals(user.getUserName())) {
                return entry.getValue();
            }
        }
        return 0;
    }

    public GameHandler getGameHandler() {
        return gameHandler;
    }

    public void setGameHandler(GameHandler gameHandler) {
        this.gameHandler = gameHandler;
    }

    public void addVictoryPointsChange(User user, int points) {
        int pts = victoryPointsChange.get(user);
        victoryPointsChange.replace(user, pts, pts + points);
    }

    public Card getPlayedCard() {
        return playedCard;
    }

    public void setPlayedCard(Card playedCard) {
        this.playedCard = playedCard;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
