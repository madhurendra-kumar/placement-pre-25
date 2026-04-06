class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set = new HashSet<>();
        for (int i=0; i<obstacles.length; i++) {
            int obstacle [] = obstacles[i];
            String str = obstacle[0] + " " + obstacle[1];
            set.add(str);
        }
        char direction = 'N';
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i=0; i<commands.length; i++) {
            if (commands[i] == -1) {
                if (direction == 'N') {
                    direction = 'E';
                }
                else if (direction == 'E') {
                    direction = 'S';
                }
                else if (direction == 'S') {
                    direction = 'W';
                } 
                else if (direction == 'W') {
                    direction = 'N';
                }
            }
            else if (commands[i] == -2) {
                if (direction == 'N') {
                    direction = 'W';
                }
                else if (direction == 'W') {
                    direction = 'S';
                }
                else if (direction == 'S') {
                    direction = 'E';
                }
                else if (direction == 'E') {
                    direction = 'N';
                }
            }
            else {
                if (direction == 'N') {
                    int j = 1;
                    while (j <= commands[i]) {
                        String s = x + " " + (y + j);
                        if (set.contains(s)) {
                            break;
                        }
                        j++;
                    }
                    y = y + (j - 1);
                    max = Math.max(max, (x * x) + (y * y));
                }
                else if (direction == 'E') {
                    int j = 0;
                    while (j <= commands[i]) {
                        String s = (x + j) + " " + y;
                        if (set.contains(s)) {
                            break;
                        }
                        j++;
                    }
                    x = x + (j - 1);
                    max = Math.max(max, (x * x) + (y * y));
                }
                else if (direction == 'S') {
                    int j = 1;
                    while (j <= commands[i]) {
                        String s = x + " " + (y - j);
                        if (set.contains(s)) {
                            break;
                        }
                        j++;
                    }
                    y = y - (j - 1);
                    max = Math.max(max, (x * x) + (y * y));
                }
                else if (direction == 'W') {
                    int j = 1;
                    while (j <= commands[i]) {
                        String s = (x - j) + " " + y;
                        if (set.contains(s)) {
                            break;
                        }
                        j++;
                    }
                    x = x - (j - 1);
                    max = Math.max(max, (x * x) + (y * y));
                }
            }
        }
        return max;
    }
}