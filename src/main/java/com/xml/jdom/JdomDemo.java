package com.xml.jdom;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 * Jdom解析xml文件
 * @author xialiguo
 */
public class JdomDemo {
	public static void main(String[] args) throws Exception {
		SAXBuilder sb = new SAXBuilder();// 创建一个SAXBuilder对象
		
		InputStream in = new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\xml\\jdom\\test.xml"));
		Document doc = sb.build(in); // 构造文档对象
		
//		Document doc = sb.build(JdomDemo.class.getClassLoader().getResourceAsStream("\\com\\xml\\jdom\\test.xml"));
		
//		Document doc = sb.build(JdomDemo.class.getClassLoader().getResource("\\com\\xml\\jdom\\test.xml").openStream());
		
		Element root = doc.getRootElement(); // 获取根元素
		List list = root.getChildren("disk");// 取名字为disk的所有元素
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element) list.get(i);
			String name = element.getAttributeValue("name");// 获取元素中属性为name的值
			String capacity = element.getChildText("capacity");// 取disk子元素capacity的内容
			String directories = element.getChildText("directories");
			String files = element.getChildText("files");
			System.out.println("磁盘信息:");
			System.out.println("分区盘符:" + name);
			System.out.println("分区容量:" + capacity);
			System.out.println("目录数:" + directories);
			System.out.println("文件数:" + files);
			System.out.println("-----------------------------------");
		}
	}
}
