package com.sample.sample.service

import org.slf4j.LoggerFactory
import java.lang.Thread.sleep

class ThreadLocalService {

    private var nameStore:ThreadLocal<String> = ThreadLocal()
    private val log =LoggerFactory.getLogger(javaClass)

    fun logic(name:String):String{
        log.info("저장 name= {} --> nameStore= {}", name, nameStore)
        nameStore.set(name)
        sleep(1_000)
        log.info("조회 nameStore={}",nameStore.get())
        return nameStore.get()
    }

}