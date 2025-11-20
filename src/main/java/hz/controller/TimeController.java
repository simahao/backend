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
    #https://auth.whhxykjyxgsaab.cc/auth/index?zbid=1575445761&actname=channelpage&refurl=F58A8B2C6288C52FFCAC0E435DB5DEFBFEF65B0073FA9E4036A2D7B187FEA5E37B611FAA4B30C063205C0207DFB6CE39C0165C673E584F9676D42B554E5B579B67DD32D627B7D58B5C43F97730881276C24053CFAE9D706ABAE5B2E70A9F00E6131BC476D4174BF88DA08CE25C7F3C3F99728B10556217071C836AF915B7866868016F41D3B9D3FA63245C9011A65AF1&ver=757e1f210abc4ec9b248f62ce98e07ff&code=041L6oll2HOkGg4K6Rkl28BEKq1L6olE&state=authuser25112020&appid=wxe63d8a00c52fadec
}
