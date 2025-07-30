package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> stack = new ArrayDeque<String>();

    public void visitPage(String page) {
        System.out.println("방문: " + page);
        stack.push(page);
    }

    public String goBack(){
        System.out.println("뒤로 가기: " + stack.peek());
        return stack.pop();
    }
}
