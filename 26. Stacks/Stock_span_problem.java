import java.util.Stack;

public class Stock_span_problem {
    public static void stocksSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] =1;
        s.push(0);
        for(int i =1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop(); 
            }
            if(s.isEmpty()){
                span[i] =i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] ={100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stocksSpan(stocks,span);
        for(int i =0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
