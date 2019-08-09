package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class VoteMachine implements Iterable<Integer>{
  private Integer[] voteCounter;
  
  public VoteMachine(int numberOfCandidates) {
    voteCounter = new Integer[numberOfCandidates];
  }
  
  public void addNumberOfVoteForIndex(int index, int numberOfVotes) {
    voteCounter[index] = numberOfVotes;
  }

  @Override
  public Iterator<Integer> iterator() {
    // TODO Auto-generated method stub
    return new VoteIterator();
  }
  
  public class VoteIterator implements Iterator<Integer>{
    private Queue<Integer> q;
    
    public VoteIterator() {
      q = new LinkedList<Integer>();
      int i = 0;
      for (i = 0; i < voteCounter.length; i++ ) {
        int j = voteCounter[i];
        while (j > 0) {
          q.add(i);
          j--;
        }
      }
    }
    
    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return !q.isEmpty();
    }

    @Override
    public Integer next() {
      // TODO Auto-generated method stub
      if (hasNext()) {
        return q.poll();
      }
      return null;
    }
    
  }
  
  public static void main(String[] args) {
    VoteMachine vm = new VoteMachine(6);
    vm.addNumberOfVoteForIndex(0, 0);
    vm.addNumberOfVoteForIndex(1, 2);
    vm.addNumberOfVoteForIndex(2, 1);
    vm.addNumberOfVoteForIndex(3, 0);
    vm.addNumberOfVoteForIndex(4, 1);
    vm.addNumberOfVoteForIndex(5, 0);
    
    for (Integer x: vm) {
      System.out.println(x);
    }
  }
}
