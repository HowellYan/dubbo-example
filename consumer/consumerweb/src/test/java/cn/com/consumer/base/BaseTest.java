package cn.com.consumer.base;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
@RunWith(SpringRunner.class)
@ComponentScan({
        "cn.com.consumer"
})
@SpringBootTest
public abstract class BaseTest<T> {

    //String profiles = "dubbo";
    String profiles = "mock";

    public T request;

    @Before
    public void setUp() {
        //初始化起初请求实体
        initRequest();
        if (isMock()) {
            //初始化mock
            MockitoAnnotations.initMocks(this);
            //通用mock预期值
            fullMock();
        }
    }
    /**
     * 基础模拟
     */
    private void fullMock() {
        fullMockInner();
    }

    /**
     * 业务相关的Mock
     */
    public abstract void fullMockInner();

    public void initRequest() {
    }

    protected boolean isMock() {
        if (profiles.equals("mock")) {
            return true;
        }
        return false;
    }
}
