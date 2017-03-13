package cn.com.provider.Dao.Bean;

import cn.com.provider.Dao.Mapper.UserMapper;
import cn.com.provider.Dao.Model.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Howell on 10/3/17.
 * e-mail:th15817161961@gmail.com
 */
@Service
@Slf4j
public class UserDao {

    @Resource
    private UserMapper userMapper;


    public UserModel findByID(String id){
        return userMapper.findByID(id);
    }


    public List<UserModel> findAll(){
        List<UserModel> list = userMapper.findAll();
        log.info("List size:"+list.size());

        //  getReport((long) 1,"w","w","e");

        return list;
    }


    @Cacheable(value = "reportcache", keyGenerator = "keyGenerator")
    public String getReport(String name) {
        System.out.println("无缓存的时候调用这里---数据库查询");
        System.out.println("Executing DemoService" +
                ".getHelloMessage(\"" + name + "\")");

        return "Hello " + name + "!";
    }
}
