class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
    for (char in s) {
        if (char == '(' || char == '{' || char == '[') {
            stack.addLast(char)
        } else {
            if (stack.isEmpty()) return false
            val top = stack.removeLast() // pop here
            if (char == ')' && top != '(') return false
            if (char == '}' && top != '{') return false
            if (char == ']' && top != '[') return false
        }
    }
    return stack.isEmpty()
}
}
