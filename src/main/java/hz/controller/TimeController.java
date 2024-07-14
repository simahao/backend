package hz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import hz.mapper.TimeMapper;

@RestController
public class TimeController {
    @Autowired
    private TimeMapper timeMapper;

    @GetMapping("api/curtime")
    public LocalDateTime now() {
        return timeMapper.now();
    }
}
