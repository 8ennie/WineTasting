package application.model.data;

import com.mysql.cj.conf.StringProperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class StandEvaluation {

	
	private IntegerProperty wineEvaluationId;
	private ObjectProperty<Stand> stand;
	private ObjectProperty<User> user;
	private SimpleStringProperty review;
	
	public StandEvaluation(int id, Stand stand, User user, String review) {
		this.wineEvaluationId = new SimpleIntegerProperty(id);
		this.stand = new SimpleObjectProperty<Stand>(stand);
		this.user = new SimpleObjectProperty<User>(user);
		this.review = new SimpleStringProperty(review);
	}

	public ObjectProperty<Stand> getStand() {
		return stand;
	}

	public void setStand(ObjectProperty<Stand> stand) {
		this.stand = stand;
	}

	public ObjectProperty<User> getUser() {
		return user;
	}

	public void setUser(ObjectProperty<User> user) {
		this.user = user;
	}

	public SimpleStringProperty getReview() {
		return review;
	}

	public void setReview(SimpleStringProperty review) {
		this.review = review;
	}

	public IntegerProperty getWineEvaluationId() {
		return wineEvaluationId;
	}
	
	
}
