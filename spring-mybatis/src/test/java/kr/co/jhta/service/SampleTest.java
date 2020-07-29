package kr.co.jhta.service;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class SampleTest {

	@Test
	public void testPlus1() {
		Sample sample = new Sample();
		int value = sample.plus(10, 30);
		
		assertEquals(40, value);	// 단언문(단언, 확신), 두개가 다르면 예외가 발생한다.
									// Errors : 테스트 진행 도중 오류가 발생해 테스트가 완료되지 않은 상태
									// Failures : 예상한 결과가 나오지 않은 상태
	}
	
	@Ignore
	@Test
	public void testPlus2() {
		Sample sample = new Sample();
		int value = sample.minus(10, 30);
		
		assertEquals(-20, value);	
	}
}
