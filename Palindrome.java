public boolean isPalindromeRecursive(String text){
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    return recursivePalindrome(clean,0,clean.length()-1);
}

private boolean recursivePalindrome(String text, int forward, int backward) {
    if (forward == backward) {
        return true;
    }
    if ((text.charAt(forward)) != (text.charAt(backward))) {
        return false;
    }
    if (forward < backward + 1) {
        return recursivePalindrome(text, forward + 1, backward - 1);
    }

    return true;
}
