package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		ValidParentheses obj = new ValidParentheses();
	}

	public boolean isValid1(String s) {

		if (s == null || s.length() == 0) {
			return true;
		}
		Stack<Character> stack = new Stack<>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '{') {
				stack.push('}');
			} else if (c == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}

		}

		return stack.isEmpty();
	}

	public boolean isValid(String s) {
		if (s == null || s.length() < 1)
			return true;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == '(' || cur == '[' || cur == '{')
				st.push(cur);
			else {
				if (st.empty())
					return false;
				char pre = st.pop();
				if ((pre == '(' && cur != ')') || (pre == '[' && cur != ']') || (pre == '{' && cur != '}'))
					return false;
			}
		}
		return st.empty();
	}

	public boolean isValid2(String s) {

		Map<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');

		// Initialize a stack to be used in the algorithm.
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// If the current character is a closing bracket.
			if (mappings.containsKey(c)) {

				// Get the top element of the stack. If the stack is empty, set a dummy value of
				// '#'
				char topElement = stack.empty() ? '#' : stack.pop();

				// If the mapping for this bracket doesn't match the stack's top element, return
				// false.
				if (topElement != mappings.get(c)) {
					return false;
				}
			} else {
				// If it was an opening bracket, push to the stack.
				stack.push(c);
			}
		}

		// If the stack still contains elements, then it is an invalid expression.
		return stack.isEmpty();
	}
}
