package com.sample.sample.service

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import java.lang.Thread.sleep


internal class ThreadLocalServiceTest{

    private val threadLocalService = ThreadLocalService()
    private val log = LoggerFactory.getLogger(javaClass)


    @Test
    fun field(){
        log.info("main start")

        val userA = Runnable {threadLocalService.logic("userA")}
        val userB = Runnable {threadLocalService.logic("userB")}

        val threadA = Thread(userA)
        threadA.name = "thread-A"
        val threadB = Thread(userB)
        threadB.name = "thread-B"


        threadA.start()
        //sleep(2000)
        sleep(1000)
        threadB.start()

        sleep(3000)
        log.info("main exit")
    }
}