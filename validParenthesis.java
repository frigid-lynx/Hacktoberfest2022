/*
Given a string s, containing just the characters '(',')','[',']','{','}', determine if
the input string is valid.
An input string is valid if:
* Open brackets must be closed by the same type of brackets.
*open brackets must be closed in correct order.

Example:
Input: str = "{()}"
Output: true;

Input: str = "{]"
Output: false;

Input: "{()"
Output: false;
 */
package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {

    public boolean isValid(String str){

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if(c == '}' && top == '{' ||
                            c == ')' && top =='(' ||
                            c == ']' && top == '['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validParenthesis stack = new validParenthesis();
        String str = sc.nextLine();
        System.out.println(stack.isValid(str));

    }
}
