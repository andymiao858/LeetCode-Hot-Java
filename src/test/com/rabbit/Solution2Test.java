package test.com.rabbit; 

import com.rabbit.Solution2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Solution2 Tester. 
* 
* @author <Authors name> 
* @since <pre>Sep 19, 2019</pre> 
* @version 1.0 
*/ 
public class Solution2Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addTwoNumbers(ListNode l1, ListNode l2) 
* 
*/ 
@Test
public void testAddTwoNumbers() throws Exception {
    Solution2.ListNode l1 = new Solution2.ListNode(2);
    Solution2.ListNode l1n = new Solution2.ListNode(4);
    Solution2.ListNode l1nn = new Solution2.ListNode(3);
    l1.next = l1n;
    l1n.next = l1nn;


    Solution2.ListNode l2 = new Solution2.ListNode(5);
    Solution2.ListNode l2n = new Solution2.ListNode(6);
    Solution2.ListNode l2nn = new Solution2.ListNode(4);
    l2.next = l2n;
    l2n.next = l2nn;


    Solution2 solution2 = new Solution2();
    Solution2.ListNode ret = solution2.addTwoNumbers2(l1, l2);

    Assert.assertEquals(7, ret.val);
    Assert.assertEquals(0, ret.next.val);
    Assert.assertEquals(8, ret.next.next.val);
    Assert.assertNull(ret.next.next.next);

    ret = solution2.addTwoNumbers1(l1, l2);

    Assert.assertEquals(7, ret.val);
    Assert.assertEquals(0, ret.next.val);
    Assert.assertEquals(8, ret.next.next.val);
    Assert.assertNull(ret.next.next.next);
}



}
