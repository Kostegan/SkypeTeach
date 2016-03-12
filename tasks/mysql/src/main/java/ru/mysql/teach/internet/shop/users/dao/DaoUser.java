package ru.mysql.teach.internet.shop.users.dao;

import ru.mysql.teach.internet.shop.dao.AbstractDaoEntity;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.User;
import ru.mysql.teach.internet.shop.users.user.sex.SexEnum;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 */
public class DaoUser extends AbstractDaoEntity implements IDaoUser {

    public DaoUser(IDaoDataBase daoDataBase) {
        super(daoDataBase);
    }

    @Override
    public void addUser(IUser user) throws SQLException {
        String userName = user.getName();
        String userPassword = user.getPassword();
        String userEmail = user.getEmail();
        int indexSex = (user.getSex().getValue());
        String sql = "INSERT INTO users(name,password,email,sex) VALUE('" + userName + "','" + userPassword + "','" + userEmail + "','" + indexSex + "');";
        getDaoDataBase().executeToInsert(sql);
    }


    @Override
    public IUser getUserByNameAndEmail(String name, String email) throws SQLException {
        ResultSet rs;
        String sql = "SELECT * FROM users WHERE  name='" + name + "' AND email='" + email + "';";
        rs = getDaoDataBase().executeToSelect(sql);
        return createUserOf(rs);
    }

    private IUser createUserOf(ResultSet rs) throws SQLException {
        IUser user = new User();
        while (rs.next()) {
            String name = rs.getString("name");
            user.setName(name);
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setSex(SexEnum.valueOf(rs.getInt("sex")));
        }
        return user;
    }

    /**
     * Creates a query to database and returns found user.
     *
     * @param id the user in base.
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public IUser getUserById(int id) throws IllegalArgumentException, Exception {
        IUser user = (IUser) super.getEntityById(IUser.class, id);
//        IUser user = super.getEntityById(IUser.class,id);
//        Object[] temp = {TABLE_NAME,index};
//        IUser user = convertStringToUser(daoDataBase.generateQueryToSelect(temp));
//        return user;
        return null;
    }

    @Override
    public void updateUser(IUser user) {

    }

    /**
     * Separates specified user to String[].
     *
     * @param user which will be separate.
     * @return user as String[]
     */
    private String[] parseUserToString(IUser user) {
        return null;
    }

    private IUser convertStringToUser(String[] temp) {
        return null;
    }

    //    private IDaoDataBase daoDataBase;
//    private Statement statement;
//
//    /**
//     * Constructor creates connection to database, creates statement to database and writings to fields(connections and statements).
//     * The data of this fields you can get through methods getConnection and getStatement.
//     */
//    public DaoUser() {
//        daoDataBase = new DaoDataBase();
//        statement = daoDataBase.getStatement();
//    }
//
//    /**
//     * Constructor with parameters. If a connection and statement to database already created, then should adds as argument.
//     *
//     * @param daoDataBase - created connection
//     * @param statement - created statement
//     */
//    public DaoUser(IDaoDataBase daoDataBase, Statement statement) {
//        this.daoDataBase = daoDataBase;
//        this.statement = statement;
//    }
//
//
//    @Override
//    public IDaoDataBase getConnection() {
//        return daoDataBase;
//    }
//
//    @Override
//    public Statement getStatement() {
//        return statement;
//    }
//
//    @Override
//    public void addUser(IUser user) throws SQLException {
//        String userName = user.getName();
//        String userPassword = user.getPassword();
//        String userEmail = user.getEmail();
//        int indexSex = (user.getSex().getValue());
//        statement.execute("INSERT INTO users(name,password,email,sex) VALUE('" + userName + "','" + userPassword + "','" + userEmail + "','" + indexSex + "');");
//    }
//
//    @Override
//    public IUser getUserById(int index) throws SQLException, InvalidSexNameException, UserNotExistException {
//        IUser user;
//        ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE id = '" + index + "'");
//        while (rs.next()) {
//            String name = rs.getString("name");
//            String password = rs.getString("password");
//            String email = rs.getString("email");
//            SexEnum sexEnum = SexEnum.valueOf(rs.getInt("sex"));
//            user = new User(name, password, email, sexEnum);
//            return user;
//        }
//        throw new UserNotExistException("User with - " + index + " not exists.");
//    }
//
//    @Override
//    public List<String> getSortNamesByMen() throws SQLException {
//        List<String> sortNames = new ArrayList<>();
//        ;
//        ResultSet rs = statement.executeQuery("SELECT name FROM users WHERE sex = 1 ORDER BY name");
//        while (rs.next()) {
//            sortNames.add(rs.getString("name"));
//        }
//        return sortNames;
//    }
//
//    @Override
//    public String countPeopleForEachSex() throws SQLException {
//        String result;
//        ResultSet rs = statement.executeQuery("SELECT sex, COUNT(*) users_count FROM users GROUP BY sex ");
//        StringBuilder temp = new StringBuilder();
//        while (rs.next()) {
//            temp.append("The sex: " + rs.getInt("sex") + " has: " + rs.getInt("users_count") + " people ");
//        }
//        result = temp.toString();
//        return result;
//    }
//
//    @Override
//    public void execute(String string) {
//
//    }
}

