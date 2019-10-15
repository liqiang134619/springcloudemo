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


    @Test
    public  void test2() {

        String s = "{\"result\":\"[{\\\"checkinsn\\\":\\\"3205842611201909199033\\\",\\\"paperid\\\":\\\"320525197104145353\\\",\\\"name\\\":\\\"吴国强\\\",\\\"papertypeid\\\":\\\"11\\\",\\\"papertype\\\":\\\"身份证\\\",\\\"xcphoto\\\":\\\"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAMCAgMCAgMDAwMEAwMEBQgFBQQEBQoHBwYIDAoMDAsK\\\\\\\\nCwsNDhIQDQ4RDgsLEBYQERMUFRUVDA8XGBYUGBIUFRT/2wBDAQMEBAUEBQkFBQkUDQsNFBQUFBQU\\\\\\\\nFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBT/wAARCACdAJ0DASIA\\\\\\\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\\\\\\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\\\\\\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\\\\\\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\\\\\\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\\\\\\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\\\\\\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\\\\\\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD9JNS8\\\\\\\\nFaVqG9ngCMefl4Ar8/PFDxHUbtxzumdvTHzGvoB/iz4rsbRoxfmeHaQUuYlcYx68H9a+X9Tu/tTE\\\\\\\\nqcgtnOecV4tHEe1vzQ5WdlSh7OzjJNFTWtQaOwjjGQhlDj64xXMLeOLc47SEYz9K3NZmBgCHGN4C\\\\\\\\nmuYEJeORx/q0c5b8qtyQoo1bbdFZTliCEH8zWx4xuEV9Gt1wyx6dAoOOoAPNYQmUaTLg89P8/nVn\\\\\\\\nxHdfadQtsABFto4gB22jFYWNLamwkhe3G08qUUZ/65qf61Q06ctqVqgOA1ygPv8AMKctx9mtQ2/b\\\\\\\\n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\\\\\\\\n4xkZotYy3P/Z\\\",\\\"semblance\\\":\\\"0\\\",\\\"sjc\\\":1568880508000}]\",\"resultCode\":\"200\",\"resultDesc\":\"查询成功\",\"total\":1}";
        String s1 = s.replace("\\\\r\\\\n", "").replace("\\\\n", "").replace("\\r\\n", "")
            .replace("\"[", "[").replace("]\"", "]").replace("\\", "");
        System.out.println(s1);


    }










}
