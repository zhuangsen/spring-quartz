package com.aaron.clusterquartz.job;

import com.aaron.clusterquartz.utils.DateUtils;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * @description 一句话描述该文件的用途
 */
@Controller
public class ClusterQuartz {
    public void printUserInfo() {
        System.out.println("***      start " + DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss:SSS") + "    *************");

        System.out.println("*");
        System.out.println("*        current username is " + System.getProperty("user.name"));
        System.out.println("*        current os name is " + System.getProperty("os.name"));
        System.out.println("*");

        System.out.println("*********current user information end******************");
    }
}
