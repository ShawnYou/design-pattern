package com.ysl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatternApplicationTests {
	private static int[] testData = new int[]{3,2,2,3};

	@Test
	public void test(){
		System.out.println("====test01");
		//Integer zero = removeElement(testData,0);
		//Assert.assertEquals(testData.length,(Object)zero);

		System.out.println("====test02");
		Integer two = removeElement(testData,3);
		Assert.assertEquals(2,(Object)two);

		System.out.println("====test03");
		//Integer three = removeElement(testData,3);
		//Assert.assertEquals(6,(Object)three);
	}

	private Integer removeElement(int[] arr,int val){
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		if(!integerList.contains(val)){ return integerList.size();}

		Iterator it = integerList.iterator();
		while (it.hasNext()){
			Integer ele = (Integer)it.next();
			if(ele == val){
				it.remove();
			}
		}

		return integerList.size();
	}

}

