package com.glsx.demo.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 打包时， 注释掉这个类
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/*.xml" })
public class ConfigTest {

	@Test
	public void testAddOpinion1() {
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
