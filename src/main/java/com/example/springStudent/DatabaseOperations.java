/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.springStudent;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Uglybear
 */
public interface DatabaseOperations {

    public void setDataSource(DataSource dataSource);
    public List selectAll(String tableName);
    public Object selectSingle(Integer entityId);
    public void deleteSingle(Integer entityId);
    public void insert(Object object);
    public void update(Object object);

}
