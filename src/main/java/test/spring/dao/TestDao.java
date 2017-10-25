package test.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import test.spring.entity.TestEntity;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/15.
 */
@Repository("testDao")
public class TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<TestEntity> getEntity(){
        String sql = "select * from t_test";
        List<TestEntity> list = jdbcTemplate.query(sql,new TestEntity());
        return list;
    }
}
