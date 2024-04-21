package com.henry.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
public class AiManagerTest {
    @Resource
    private AiManager aiManager;

    @Test
    public void testDoChat() {
//        String result = aiManager.doChat(1773680331355226114L,
//                "分析需求：\n" +
//                "分析网站用户的增长情况\n" +
//                "原始数据：\n" +
//                "日期, 用户数\n" +
//                "2021-01-01, 100\n" +
//                "2021-01-02, 120\n" +
//                "2021-01-03, 130\n" +
//                "2021-01-04, 150\n");
        String testText ="以下是前端代码（Echarts V5的option配置对象）：\n" +
                "```javascript\n" +
                "option = {\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        data: ['2021-01-01', '2021-01-02', '2021-01-03', '2021-01-04']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [{\n" +
                "        data: [100, 120, 130, 150],\n" +
                "        type: 'line'\n" +
                "    }]\n" +
                "};\n" +
                "```\n";
        String regex = "\\{.*?\\}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(testText);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
