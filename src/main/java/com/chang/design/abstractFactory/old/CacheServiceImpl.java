package com.chang.design.abstractFactory.old;

import com.chang.design.abstractFactory.EGM;
import com.chang.design.abstractFactory.IIR;

public class CacheServiceImpl implements CacheService{

    private final RedisUtils redisUtils = new RedisUtils();

    private final EGM egm = new EGM();
    private final IIR iir = new IIR();


    @Override
    public void set(String key, Object value, Integer redisType) {
        if (redisType == 1){
            egm.set(key, value);
            return;
        }
        if (redisType == 2){
            iir.put(key, value);
            return;
        }
        redisUtils.set(key, value);
    }

    @Override
    public Object get(String key, Integer redisType) {
        if (redisType == 1){
           return egm.gain(key);
        }
        if (redisType == 2){
            return iir.select(key);
        }
        return redisUtils.get(key);
    }

    @Override
    public void del(String key, Integer redisType) {
        if (redisType == 1){
            egm.delete(key);
            return;
        }
        if (redisType == 2){
            iir.remove(key);
            return;
        }
        redisUtils.del(key);
    }
}
