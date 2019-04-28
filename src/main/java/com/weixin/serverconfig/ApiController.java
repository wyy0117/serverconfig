package com.weixin.serverconfig;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Date: 2019-04-24
 * @Author: wyy
 */
@RestController()
public class ApiController {

    private final Log log = LogFactory.getLog(ApiController.class);

    @Autowired
    private ServerProperty serverProperty;

    @GetMapping()
    @ResponseBody
    public String checkToken(@RequestParam String signature, @RequestParam String timestamp, @RequestParam String nonce, @RequestParam String echostr) throws AesException {
        log.debug("signature = " + signature);
        log.debug("timestamp = " + timestamp);
        log.debug("nonce = " + nonce);
        log.debug("echostr = " + echostr);
        String sha1 = SHA1.getSHA1(serverProperty.getToken(), timestamp, nonce, "");
        log.debug("sha1 = " + sha1);
        if (sha1.equals(signature)) {
            return echostr;
        }
        return serverProperty.getToken();
    }
}
