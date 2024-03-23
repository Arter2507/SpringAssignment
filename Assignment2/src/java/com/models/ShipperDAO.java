package com.models;

import java.util.List;

public interface ShipperDAO {

    public List<Shipper> findAll();

    public void add(Shipper shipper);

    public void update(Shipper shipper);

    public Shipper get(int id);

    public void delete(int id);

    public List<Shipper> find(String keyword);
}
