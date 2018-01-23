package com.java1234.service;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java1234.mappers.StudentMapper;
import com.java1234.model.Student;
import com.java1234.util.SqlSessionFactoryUtil;

public class StudentTest2 {
	private static Logger log = Logger.getLogger(StudentTest2.class);
	private SqlSession sqlSession = null ;
	private StudentMapper studentMapper= null ;
	/**
	 * TODO 测试方法前调用
	 * @author liguo
	 * @throws Exception 
	 * @date 2018年1月23日上午8:51:03
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		studentMapper=sqlSession.getMapper(StudentMapper.class);
	}

	/**
	 * TODO 测试方法后调用
	 * @author liguo
	 * @throws Exception 
	 * @date 2018年1月23日上午8:51:46
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testAdd() {
		log.info("添加学生");
		Student student=new Student("夏利国",23);
		studentMapper.add(student);
		sqlSession.commit();
	}
	@Test
	public void testUpdate() {
		log.info("更需学生");
		Student student=new Student(3, "sss", 18);
		studentMapper.update(student);
		sqlSession.commit();
	}

}
