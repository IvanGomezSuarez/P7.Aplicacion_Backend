package dao;
// forma centraliada de coger los DAO
public interface DAOManager {
	DAOGame getDAOGame();
	DAOLetters getDAOLetters();
	DAOUsers getDAOUsers();
	DAOWords getDAOWord();
}