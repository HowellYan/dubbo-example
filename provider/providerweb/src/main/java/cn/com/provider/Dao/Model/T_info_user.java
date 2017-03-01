package cn.com.provider.Dao.Model;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Data
@ToString(callSuper = true)
public class T_info_user {
    private String id;
    private String name;
    private String tel;
    private String email;
    private String creat_at;
    private String update_at;
    private String pid;
    private String post;
    private long effect;
    private long type;
    private String password;
}
