package com.struts.ex.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.struts.ex.dm.User;


@Repository
public class UserDaoImpl implements UserDao {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public List<User> getUsers() {
        return jdbcTemplate.query("SELECT id, first_name, last_name, age, gender FROM users",
                (rs, rowNum) -> new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("age"), rs.getString("gender")));
    }
 
    public void insertBatch() {
        jdbcTemplate.execute("DROP TABLE users IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE users(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255), age VARCHAR(3), gender VARCHAR(10))");
        jdbcTemplate.batchUpdate("INSERT INTO users(first_name, last_name, age, gender) VALUES (?,?,?,?)", userData());
    }
 
    private List<Object[]> userData() {
        List<Object[]> users = new ArrayList<>();
        users.add("John Doe 25 Male".split(" "));
        users.add("Jane Doe 23 Female".split(" "));
        users.add("Sarah Bosch 34 Female".split(" "));
        users.add("Michael Murray 20 Male".split(" "));
        users.add("Barry Coy 19 Male".split(" "));
        users.add("Daisy Chen 19 Female".split(" "));
        users.add("May Williams 15 Female".split(" "));
        users.add("Alex Johnson 40 Male".split(" "));
        users.add("Ceasar McCoy 39 Male".split(" "));
        users.add("Paula May 22 Female".split(" "));
        return users;
    }
     
}