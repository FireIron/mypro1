package cn.netease.domain;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatToDate implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if(source==null||source.trim().length()==0){
            throw new RuntimeException("数据异常");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date da =null;
        try {
            da =  sdf.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据异常");
        }
        return da;
    }
}
