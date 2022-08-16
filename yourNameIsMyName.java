class yourNameIsMyName {
    public String solution(String M, String W) {
        int m = 0; int w = 0;
        while(m < M.length() && w < W.length()) {
            if(M.charAt(m) == W.charAt(w)) m++;

            w++;
        }

        return m == M.length() ? "YES" : "NO";
    }
}
