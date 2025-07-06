package com.yupi.springbootinit.manager;

import cn.hutool.json.JSONUtil;
import com.yupi.springbootinit.MainApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes=MainApplication.class)
public class AiManagerTest {
    @Resource
    private AiManager aiManager;


    // import org.junit.jupiter.api.Test;
    @Test
    public void test() {
        String c = "分析需求：\n" +
                "分析网站用户的增长情况 \n" +
                "请使用 柱状图 \n" +
                "原始数据：\n" +
                "日期,用户数\n" +
                "1号,10\n" +
                " 2号,20\n" +
                " 3号,30";
        String s = aiManager.sendMsgToXingHuo(true, c);
        String[] sai = s.split("'【【【【'");
        String bg=sai[1];
        String jl=sai[2];
        System.out.println(JSONUtil.toJsonStr(bg));
        System.out.println(jl);
    }
}
