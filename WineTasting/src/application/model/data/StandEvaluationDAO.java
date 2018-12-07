package application.model.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StandEvaluationDAO extends BaseDAO implements IStandEvaluationDAO {

	@Override
	public StandEvaluation getStandEvaluationByID(int id) throws SQLException {
		PreparedStatement prepareStatement = this.conn.prepareStatement(
				"Select ID, standID, userID, review   from wine_test_db.WINEEVALUATION WHERE ID = ?");
		prepareStatement.setInt(1, id);
		ResultSet rs = prepareStatement.executeQuery();
		rs.next();
		return new StandEvaluation(rs.getInt("ID"), new StandDAO().getStandByID(rs.getInt("standID")),
				new UserDAO().getUserByID(rs.getInt("userID")), rs.getString("review"));
	}

	@Override
	public List<StandEvaluation> getStandEvaluationByStand(Stand stand) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean persistStandEvaluation(StandEvaluation standEvaluation) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStandEvaluation(StandEvaluation standEvaluation) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeStandEvaluation(StandEvaluation standEvaluation) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	

}
