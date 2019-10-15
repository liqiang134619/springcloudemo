package com.example.clouds;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Liq
 * @date 2019/9/16
 */
public class Test2 {

    public static void main(String[] args) throws FileNotFoundException, DocumentException {


        InputStream inputStream = new FileInputStream(
            new File("C:\\Users\\Administrator.PC-20180329WRWB\\AppData\\Local\\Temp\\rzsj_log.xml"));


        SAXReader saxReader = new SAXReader();

        Document read = saxReader.read(inputStream);
//        Element rootElement = read.getRootElement();
//        System.out.println("根节点名称：" + rootElement.getName());//获取节点的名称
//
//        System.out.println("根节点有多少属性：" + rootElement.attributeCount());//获取节点属性数目
//
//
//        System.out.println("根节点内文本：" + rootElement.getText());//如果元素有子节点则返回空字符串，否则返回节点内的文本
//
//        //rootElement.getText() 之所以会换行是因为 标签与标签之间使用了tab键和换行符布局，这个也算是文本所以显示出来换行的效果。
//        System.out.println("根节点内文本(1)：" + rootElement.getTextTrim());//去掉的是标签与标签之间的tab键和换行符等等，不是内容前后的空格
//        System.out.println("根节点子节点文本内容：" + rootElement.getStringValue());

        String s = read.asXML();
        System.out.println(s);
        System.out.println(
            "=============================="
        );
        String ss = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<Aspt>\n"
            + "  <Version>1.0</Version>\n"
            + "  <RegID>340000100001</RegID>\n"
            + "  <Logs>\n"
            + "\t\t<Log>\n"
            + "\t\t<rzid>1111</rzid>\n"
            + "\t\t<xtid>35000019860</xtid>\n"
            + "\t\t<xtmc>系统名称</xtmc>\n"
            + "\t\t<mkid>101001</mkid>\n"
            + "\t\t<mkmc>暂住人口查询</mkmc>\n"
            + "\t\t<yhzh>040000</yhzh>\n"
            + "\t\t<yhxm>张三</yhxm>\n"
            + "\t\t<yhjh>040000</yhjh>\n"
            + "\t\t<yhsfzh>350000198609065541</yhsfzh>\n"
            + "\t\t<yhdwmc>工业园区分局刑警大队</yhdwmc>\n"
            + "\t\t<yhdwdm>320594210000</yhdwdm>\n"
            + "\t\t<zddz>10.35.XXX.XXX</zddz>\n"
            + "\t\t<czlx>1</czlx>\n"
            + "\t\t<cztj><![CDATA[and xm='张三']]></cztj>\n"
            + "\t\t<czsj>20170411214012</czsj>\n"
            + "\t\t<czjg>1</czjg>\n"
            + "\t\t<cznr><![CDATA[and xm='张三']]></cznr>\n"
            + "\t\t<sbyy/>\n"
            + "\t\t<ywxtrzid>111</ywxtrzid>\n"
            + "\t\t</Log>\n"
            + "\n"
            + "\t\t<Log>\n"
            + "\t\t<rzid>1112</rzid>\n"
            + "\t\t<xtid>350000198</xtid>\n"
            + "\t\t<xtmc>系统名称</xtmc>\n"
            + "\t\t<mkid>101001</mkid>\n"
            + "\t\t<mkmc>暂住人口查询</mkmc>\n"
            + "\t\t<yhzh>040000</yhzh>\n"
            + "\t\t<yhxm>张三</yhxm>\n"
            + "\t\t<yhjh>040000</yhjh>\n"
            + "\t\t<yhsfzh>350000198609065541</yhsfzh>\n"
            + "\t\t<yhdwmc>工业园区分局刑警大队</yhdwmc>\n"
            + "\t\t<yhdwdm>320594210000</yhdwdm>\n"
            + "\t\t<zddz>10.35.XXX.XXX</zddz>\n"
            + "\t\t<czlx>1</czlx>\n"
            + "\t\t<cztj><![CDATA[and xm='张三']]></cztj>\n"
            + "\t\t<czsj>20170411214012</czsj>\n"
            + "\t\t<czjg>1</czjg>\n"
            + "\t\t<cznr><![CDATA[and xm='张三']]></cznr>\n"
            + "\t\t<sbyy/>\n"
            + "\t\t<ywxtrzid>111</ywxtrzid>\n"
            + "\t\t</Log>\n"
            + "   </Logs>\n"
            + "\n"
            + "</Aspt>";

        System.out.println(ss);

    }

}
