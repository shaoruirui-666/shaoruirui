package org.example.usermassage;

import cn.hutool.core.io.IoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


@RestController
public class UserService {
    @RequestMapping("/list")
    public List<User> list() throws  Exception{
        //加载并读取user.txt文件，获取用户数据
        InputStream in=this.getClass().getClassLoader().getResourceAsStream("static/user massage.txt");
        ArrayList<String> lines= IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
//解析用户信息，封装为user对象->list集合
       List<User> userlist=lines.stream().map(line->{
            String[] split=line.split("，");
            Integer id=Integer.parseInt(split[0]);
            String name=split[1];
            Integer age=Integer.parseInt(split[2]);
            String password=split[3];
            LocalDate updatetime=LocalDate.parse(split[4],
                    DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return new User(name,password,id,age,updatetime);
        }).toList();

        return userlist;
    }

}
