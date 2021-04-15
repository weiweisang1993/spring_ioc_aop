package com.service.proxy;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/15 14:17
 */
public class TeacherServiceImpl implements TeacherService {
    public String say() {
        System.out.println("你们是我教过最差的一届");
        return "谁说不是呢";
    }
}
