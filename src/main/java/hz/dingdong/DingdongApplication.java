package hz.dingdong;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "hz.mapper", annotationClass = Mapper.class)
public class DingdongApplication {

    public static void main(String[] args) {
        SpringApplication.run(DingdongApplication.class, args);
    }

}
