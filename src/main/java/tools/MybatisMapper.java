package tools;

import java.util.Map;

public class MybatisMapper {
	public static void main(String[] args) {
		String str = "APPRVOE_INFOAPPVID,INSTANCEID,APPVROLE,APPVTYPE,APPVOPERID,APPVDATE,APPVTIME,APPVMEMO,TRACESTEPID";
		String[] s = str.split(",");
		insertMapper(s);
	}
	public static void insertMapper(String[] str) {
		String sql = "INSERT INTO " + str[0]+"(\r";
		for (int i = 1; i < str.length; i++) {
			sql +="  <if test=\""+str[i]+" != null and " + str[i]+ " !=''\">," + str[i] + "</if>\r";
		}
		sql +=")\rVALUES(\r";
		for (int i = 1; i < str.length; i++) {
			sql +="  <if test=\""+str[i]+" != null and " + str[i]+ " !=''\">,#{" + str[i] + "}</if>\r" ;
		}
		sql += ")";
		System.out.println(sql);
	}
	
	public static void updateMapper(String[] str) {
		String sql = "UPDATE " + str[0] +" SET\r" ;
		for (int i = 1 ;i < str.length; i++) {
			sql +="<if test=\"" + str[i] + " != null and " + str[i] + " !=''\">," + str[i] + " = #{" + str[i] + "}</if>\r" ;
		}
		System.out.println(sql);
	}
}
