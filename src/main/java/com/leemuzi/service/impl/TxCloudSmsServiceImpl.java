package com.leemuzi.service.impl;

import com.leemuzi.service.SmsService;
import org.springframework.stereotype.Service;

/**
 * 腾讯云SMS实现
 * @author lixiang
 * @date 2023/5/16 09:44
 */
@Service("TX_CLOUD")
public class TxCloudSmsServiceImpl implements SmsService {
    @Override
    public String send(String fromPhone, String toPhone, String content) {
        System.out.println("------------------当前SMS厂商为腾讯云------------------");
        System.out.println("----"+fromPhone+" 向 "+toPhone +" 发送了一条短信。"+"----");
        System.out.println("短信内容为："+content);
        System.out.println("----------------------------------------------------");
        return "success";
    }
}
