package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBasic(){
        log.info("hello Basic");
        return "ok";
    }

    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2(){
        log.info("hello Basic");
        return "ok";
    }

    @GetMapping(value = "/mapping/{userId}")
    public String mappingPath(@PathVariable String userId){
        log.info("hello Basic userId = {}", userId);
        return "ok";
    }

    @GetMapping(value = "/mapping/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable("userId") String userId, @PathVariable("orderId") Long orderId){
        log.info("hello Basic userId = {}, orderId ={}", userId, orderId);
        return "ok";
    }
}
