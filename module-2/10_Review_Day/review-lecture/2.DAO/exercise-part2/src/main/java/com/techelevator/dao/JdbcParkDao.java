package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Park> getAllParks() {
        List<Park> parkList = new ArrayList<>();
        String sql = "SELECT park_id, name, location, establish_date, area, visitors, description " +
                "FROM park " +
                "ORDER BY location;";
        
        return parkList;
    }

    //Hint: you will need to follow a similar pattern -(lines 13 and 15) for your other DAO implementations.


    //Hint: method to get sql data here

    //Hint: method to work with the sql row data in Java
    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();
        park.setId(rowSet.getInt("park_id"));
        park.setName(rowSet.getString("name"));
        park.setLocation(rowSet.getString("location"));
        park.setEstablished_date(rowSet.getDate("establish_date").toLocalDate());
        park.setArea(rowSet.getInt("area"));
        park.setVisitors(rowSet.getInt("visitors"));
        park.setDescription(rowSet.getString("description"));
        return park;
    }

    }
}
