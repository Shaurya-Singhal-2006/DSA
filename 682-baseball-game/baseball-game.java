class Solution {
    public int calPoints(String[] operations){
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                int sum = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(sum);
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek() *2);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        for(int val : stack){
            result += val;
        }
        
        return result;
    }
}