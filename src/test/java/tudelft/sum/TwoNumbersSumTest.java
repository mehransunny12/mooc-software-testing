package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
     public void addTwoNumbersTest()
    {
        TwoNumbersSum twoNumbersSum=new TwoNumbersSum();
        ArrayList<Integer> first=new ArrayList<>(); first.add(3); first.add(4); first.add(2);
        ArrayList<Integer> second=new ArrayList<>(); second.add(4); second.add(6); second.add(5);
        ArrayList<Integer> answer=new ArrayList<>(); answer.add(8); answer.add(0); answer.add(7);
        Assertions.assertEquals(answer,twoNumbersSum.addTwoNumbers(first,second));
    }

    @Test
    public void addTwoNumbersWithZeroEndTest()
    {
        TwoNumbersSum twoNumbersSum=new TwoNumbersSum();
        ArrayList<Integer> first=new ArrayList<>(); first.add(2); first.add(0); first.add(0);
        ArrayList<Integer> second=new ArrayList<>(); second.add(3); second.add(0); second.add(0);
        ArrayList<Integer> answer=new ArrayList<>(); answer.add(5); answer.add(0); answer.add(0);
        Assertions.assertEquals(answer,twoNumbersSum.addTwoNumbers(first,second));
    }

    @Test
    public void addTwoNumbersWithComplimentEndTest()
    {
        TwoNumbersSum twoNumbersSum=new TwoNumbersSum();
        ArrayList<Integer> first=new ArrayList<>(); first.add(9); first.add(4); first.add(6);
        ArrayList<Integer> second=new ArrayList<>(); second.add(7); second.add(2); second.add(3);
        ArrayList<Integer> answer=new ArrayList<>(); answer.add(1); answer.add(6); answer.add(6); answer.add(9);
        Assertions.assertEquals(answer,twoNumbersSum.addTwoNumbers(first,second));
    }

    @Test
    public void addTwoNumbersWithZeroMidTest()
    {
        TwoNumbersSum twoNumbersSum=new TwoNumbersSum();
        ArrayList<Integer> first=new ArrayList<>(); first.add(2); first.add(0); first.add(2);
        ArrayList<Integer> second=new ArrayList<>(); second.add(3); second.add(0); second.add(0);
        ArrayList<Integer> answer=new ArrayList<>(); answer.add(5); answer.add(0); answer.add(2);
        Assertions.assertEquals(answer,twoNumbersSum.addTwoNumbers(first,second));
    }


}
