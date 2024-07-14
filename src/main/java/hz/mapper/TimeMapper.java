package hz.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;

@Mapper
public interface TimeMapper {
    public LocalDateTime now();
}
