package tools;

import java.util.Map;

public class MybatisMapper {
	public static void main(String[] args) {
		String str = "B_WF_VOUMNG,TRANNO,SERSEQNO,ORGID,BUSICODE,TRANDATE,VOUSOURCE";
		String[] s = str.split(",");
		insert(s);
	}
	//mybaties mapper插入映射sql
	public static void insert(String[] str) {
		String sql = "INSERT INTO " + str[0]+"(\r";
		for (int i = 1; i < str.length; i++) {
			if(i == 1) {
				sql +="<if test=\""+str[i]+" != null and " + str[i]+ " !=''\">" + str[i] + "</if>\r";
			}else {
				sql +="<if test=\""+str[i]+" != null and " + str[i]+ " !=''\">," + str[i] + "</if>\r";
			}
		}
		sql +=")\rVALUES(\r";
		for (int i = 1; i < str.length; i++) {
			if (i == 1) {
				sql +="<if test=\""+str[i]+" != null and " + str[i]+ " !=''\">#{" + str[i] + "}</if>\r" ;
			}else {
				sql +="<if test=\""+str[i]+" != null and " + str[i]+ " !=''\">,#{" + str[i] + "}</if>\r" ;
			}
		}
		sql += ")";
		System.out.println(sql);
	}
	
	//mybaties mapper更新映射sql
	public static void update(String[] str) {
		String sql = "UPDATE " + str[0] +" SET\r" ;
		for (int i = 1 ;i < str.length; i++) {
			if (i == 1) {
				sql +="<if test=\"" + str[i] + " != null and " + str[i] + " !=''\">" + str[i] + " = #{" + str[i] + "}</if>\r" ;
			}else {
				sql +="<if test=\"" + str[i] + " != null and " + str[i] + " !=''\">," + str[i] + " = #{" + str[i] + "}</if>\r" ;
			}
		}
		sql += "WHERE" ;
		System.out.println(sql);
	}
	
	//mybaties mapper选择映射sql
	public static void select(String[] str) {
		String sql = "SELECT";
		for (int i = 1 ;i < str.length; i++) {
			if (i==str.length-1) {
				sql +=str[i] ;
			}
			if (i % 10==0) {
				sql +="\r" ;
			}else {
				sql +=" "+str[i] + ",";
			}
		}
		sql += "WHERE" ;
		System.out.println(sql);
	}
	
	//实现类获取pool字符串
	public static void getPoolString(String[] str) {
		String s = "";
		for (int i = 0 ;i < str.length; i++) {
			s= "String "+str[i]+" = pool.getString(\""+str[i]+"\");";
			System.out.println(s);
		}
	}
	
	//实现类获取pool字符串写进map
	public static void mapPut(String[] str) {
		String s = "";
		for (int i = 0 ;i < str.length; i++) {
			s= "map.put(\"" + str[i] + "\", " + str[i].toLowerCase() + ");";
			System.out.println(s);
		}
	}
	
}
