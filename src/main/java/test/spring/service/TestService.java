package test.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.spring.dao.TestDao;
import test.spring.entity.TestEntity;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/15.
 */
@Service("testService")
public class TestService {

    @Autowired
    private TestDao testDao;

    public List<TestEntity> getAllTestEntity(){
        return  testDao.getEntity();
    }

}
