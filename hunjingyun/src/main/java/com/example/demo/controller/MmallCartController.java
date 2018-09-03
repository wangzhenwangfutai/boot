package com.example.demo.controller;

import java.util.Date;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.contant.MyResource;
import com.example.demo.disconf.JedisConfig;
import com.example.demo.entity.Login;
import com.example.demo.entity.MmallCart;
import com.example.demo.nsync.NsyncCompent;
import com.example.demo.service.IMmallCartService;
import com.example.demo.utils.RedisUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/cart")
public class MmallCartController {

    private Logger logger = LoggerFactory.getLogger(MmallCartController.class);

    @Autowired
    private IMmallCartService mmallCartService;

    @Autowired
    private RedisUtils redisUtils;

    @Resource
    private NsyncCompent nsyncCompent;

    @Autowired
    private MyResource myResource;

    @Autowired
    private JedisConfig jedisConfig;

    @RequestMapping("getmall")
    public MmallCart getCart() {
        return mmallCartService.getCart();
    }

    /**
     * 方法一获得分页
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("getallpage")
    public PageInfo<MmallCart> getAllPage(Integer pageNo, Integer pageSize) {
        return mmallCartService.getAllCart(pageNo, pageSize);
    }

    /**
     * 方式二获得分页
     *
     * @return
     */
    @RequestMapping("getpage")
    public Page<MmallCart> getPage(Integer pageNo, Integer pageSize) {
        return mmallCartService.getMmallPage(pageNo, pageSize);
    }

    /**
     * 添加
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("add")
    public int add() throws Exception {
        return mmallCartService.add(null);
    }

    @RequestMapping("usr")
    public Login getLogin() {
        Login login = new Login();
        login.setBirthDay(new Date());
        login.setName("ww");
        login.setPassWord("1313");
        login.setDesc("你好");

        return login;
    }

    @RequestMapping("redis")
    public void redis() {
        redisUtils.set("redis", "888");
    }

    @RequestMapping("getRedis")
    public void getRedis() {
        logger.info("infoinfo");
        logger.error("error");
        logger.warn("warn...");
        logger.debug("debug...");

        String ss = redisUtils.get("redis");
        System.out.println(ss);
    }

    @RequestMapping("deleteRedis")
    public void deleteRedis() {
        redisUtils.get("888");
    }


    @RequestMapping("async")
    public void async() {
        long t1 = System.currentTimeMillis();
        Future<String> task1 = nsyncCompent.task1();
        Future<String> task2 = nsyncCompent.task2();
        Future<String> task3 = nsyncCompent.task3();

        while (true) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                break;
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("共耗时" + (t2 - t1));
    }

    /**
     * 获取配置文件测试
     *
     * @return
     */
    @RequestMapping("getResource")
    public String getResource() {
        return myResource.getName();
    }

    @RequestMapping("disconfTest")
    public void disconfTest() {
        String host = jedisConfig.getHost();
        System.out.println("host" + host);
        int port = jedisConfig.getPort();
        System.out.println("port" + port);
        MmallCart mmallCart = mmallCartService.selectByPrimaryKey(1);
        System.out.println(mmallCart);
    }

}
