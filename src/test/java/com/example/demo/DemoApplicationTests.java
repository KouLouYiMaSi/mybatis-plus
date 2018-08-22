package com.example.demo;

import com.example.demo.config.CodeGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        CodeGenerator gse = new CodeGenerator();
        //要给那些表生成
        gse.generateByTables(false,"tb_user", "tb_role","tb_permission","tb_user_role","tb_role_permission");
    }

}
