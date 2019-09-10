package com.example.cloudserver;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.cloudserver.Entity.TGuestCheckinInfo;
import com.example.cloudserver.confis.HotelProperties;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashSet;
import javax.xml.bind.SchemaOutputResolver;
import org.apache.commons.lang.StringEscapeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudServerApplicationTests {

    @Autowired
    HotelProperties hotelProperties;


    @Test
    public void test1() {

    String s = "{\"columnNum\":\"41\",\"rowNum\":\"21\",\"owner\":\"HPMIS\",\"table_name\":\"GUEST\",\"opTs\":\"2019-09-10 09:42:55\",\"scn\":\"16675032112226\",\"seqid\":\"11\",\"tranid\":\"1\",\"loaderTime\":\"2019-09-10 09:43:01\",\"rowid\":\"AAAGY8ABoAAE105AAa\",\"operType\":\"U\",\"after\":{\"CHECKINSN\":\"3205032011201909100001\",\"GASTHAUSID\":\"\",\"CHECKINTIME\":\"\",\"NAME\":\"\",\"SEXID\":\"\",\"NATIONID\":\"\",\"BIRTHDATE\":\"\",\"PAPERTYPEID\":\"\",\"PAPERID\":\"\",\"CITYID\":\"\",\"ADDRESS\":\"\",\"ROOMID\":\"\",\"CHECKINMODEID\":\"\",\"CHECKINTYPEID\":\"\",\"DEPOSIT\":\"\",\"BALANCE\":\"\",\"TEAMID\":\"\",\"CANCELTIME\":\"2019-09-10 09:42:43\",\"CARRYTIME\":\"\",\"USERNAME\":\"\",\"UPLOADED\":\"0\",\"HADCAR\":\" \",\"CARNO\":\"\",\"DOWNLOADED\":\"0\",\"VALIDATE1\":\"\",\"VALIDATE2\":\"\",\"IS2NDCARD\":\"\",\"AUTHORITY\":\"\",\"GUESTTYPE\":\"\",\"SEMBLANCE\":\"\",\"FACERESULT\":\"\",\"TXZHM\":\"\",\"QFCS\":\"\",\"SJC\":\"2019-09-10 09:42:55\"},\"before\":{\"CHECKINSN\":\"3205032011201909100001\"}}";

      String  msg = StringEscapeUtils.unescapeJava(s);
        JSONObject object = JSON.parseObject(msg);
        JSONObject data = null;
        if(object.getJSONObject("after") != null){
            data = object.getJSONObject("after");
        }else if(object.getJSONObject("columns") != null){
            data = object.getJSONObject("columns");
        }
        Type type = new TypeReference<TGuestCheckinInfo>() {
        }.getType();
        TGuestCheckinInfo info = JSON.parseObject(data.toJSONString(), type);
        Field[] fields = info.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                Object o = field.get(info);
                if(field.get(info) !=null &&field.get(info).equals("")){
                    field.set(info,null);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        info.setAddress("1");
        System.out.println(info);

    }
}
