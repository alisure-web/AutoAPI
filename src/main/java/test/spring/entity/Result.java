package test.spring.entity;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/17.
 */
@ApiModel
public class Result {

    @ApiModelProperty(value = "返回结果的状态，status=1代表OK",required = true)
    private String status = "";
    @ApiModelProperty(value = "全部的用户数据",required = true)
    private List<TestEntity> testEntities = null;

    public Result() {
    }

    public Result(String status, List<TestEntity> testEntities) {
        this.status = status;
        this.testEntities = testEntities;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TestEntity> getTestEntities() {
        return testEntities;
    }

    public void setTestEntities(List<TestEntity> testEntities) {
        this.testEntities = testEntities;
    }
}
