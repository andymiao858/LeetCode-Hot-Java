package com.rabbit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Solution1 Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 27, 2019</pre> 
* @version 1.0 
*/ 
public class Solution1Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: twoSum(int[] nums, int target) 
* 
*/ 
@Test
public void testTwoSum() throws Exception {
    Solution1 solution1 = new Solution1();
    int[] nums = {2, 9, 4, 6, 3};
    int[] ret = solution1.twoSum(nums, 10);
    Assert.assertTrue(ret.length == 2);
    Assert.assertArrayEquals(new int[]{2, 3}, ret);
} 


} 
