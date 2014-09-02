public class Solution {
    public boolean isValid(String str) {
                Stack<Character> parenStack = new Stack<Character>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            switch(ch) {
            case '(':parenStack.push(ch);
                     break;

            case ')':if(!parenStack.isEmpty()) {
                            if(parenStack.peek() == '(') 
                                parenStack.pop();
                      } else {
                            return false;
                      }          
                     break;

            case '[':parenStack.push(ch);
                     break;
            case ']': if(!parenStack.isEmpty()) {
                        if(parenStack.peek() == '[') {
                            parenStack.pop();
                        } 
                      } else {
                            return false;
                      } 
                     break; 
            case '{': parenStack.push(ch);
                      break;
            case '}':  if(!parenStack.isEmpty()) { 
                         if(parenStack.peek() == '{') {
                             parenStack.pop();
                         } 
                        } else {
                            return false;
                        }
                      break;    
            }

        }

        return parenStack.isEmpty();
    }
}