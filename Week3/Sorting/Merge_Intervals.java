class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Stack<Interval> holder = new Stack<>();
        Collections.sort(intervals,(a,b) -> a.start - b.start);
        
        for(Interval select : intervals){
            if(holder.isEmpty() || select.start > holder.peek().end )
                holder.push(select);
            else
                holder.peek().end = Math.max(select.end,holder.peek().end);
        }
        return new ArrayList<Interval>(holder);
    }
}