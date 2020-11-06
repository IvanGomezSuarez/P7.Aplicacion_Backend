package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the game database table.
 * 
 */
@Entity
@NamedQuery(name="Game.findAll", query="SELECT g FROM Game g")
public class Game implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GamePK id;

	private int score;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_username1")
	private User user;

	public Game() {
	}

	public GamePK getId() {
		return this.id;
	}

	public void setId(GamePK id) {
		this.id = id;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}