package com.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ShipperImplement implements ShipperDAO {

    private JdbcTemplate jdbcTemplate;

    public ShipperImplement() {
    }

    public ShipperImplement(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public List<Shipper> findAll() {
        String sql = "SELECT TOP 100 * FROM Shippers";

        List<Shipper> shipper = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            Shipper shipperObject = new Shipper();
            shipperObject.setShipperID(row.get("ShipperID").toString());
            shipperObject.setCompanyName(row.get("CompanyName").toString());
            shipperObject.setPhone(row.get("Phone").toString());

            shipper.add(shipperObject);
        }
        return shipper;
    }

    @Override
    public void add(Shipper shipper) {
        String sql = "INSERT INTO Shippers VALUES (?,?)";
        jdbcTemplate.update(sql, shipper.getCompanyName(), shipper.getPhone());
    }

    @Override
    public void update(Shipper shipper) {
        String sql = "UPDATE Shippers SET CompanyName = ?, Phone = ? WHERE ShipperID = ?";
        jdbcTemplate.update(sql, shipper.getCompanyName(), shipper.getPhone(), shipper.getShipperID());
    }

    @Override
    public Shipper get(int id) {
        String sql = "SELECT TOP 100 * FROM Shippers WHERE ShipperID = ?";
        return (Shipper) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(Shipper.class));
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM Shippers WHERE ShipperID = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Shipper> find(String keyword) {
        StringBuilder sql = new StringBuilder("SELECT TOP 100 * FROM Shippers ");

        // Check if keyword is empty or null
        if (keyword == null || keyword.isEmpty()) {
            return jdbcTemplate.query(sql.toString(), BeanPropertyRowMapper.newInstance(Shipper.class));
        }

        sql.append("WHERE (CompanyName LIKE ? OR Phone LIKE ?)");

        keyword = "%" + keyword + "%";

        return jdbcTemplate.query(sql.toString(), new Object[]{keyword, keyword},
                BeanPropertyRowMapper.newInstance(Shipper.class));
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
