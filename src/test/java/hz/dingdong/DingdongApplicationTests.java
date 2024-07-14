package hz.dingdong;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import hz.mapper.TimeMapper;

@SpringBootTest
class DingdongApplicationTests {

    static final Logger logger = LoggerFactory.getLogger(DingdongApplicationTests.class);
    @Autowired
    TimeMapper sqlMapper;

    @Test
    void contextLoads() {
        LocalDateTime now = sqlMapper.now();
        System.out.println("aaa");
        logger.info("NOW={}", now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }
}
