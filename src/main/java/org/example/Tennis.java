package org.example;

import java.util.HashMap;
import java.util.Map;

public class Tennis {
    String person1;

    String person2;

    int score1;

    int score2;

    boolean isStart;

    Map<String, String> scoreMap  = new HashMap<String, String>() {{
        put("key1", "value1");
        put("key2", "value2");
    }};

    public Tennis(String person1, String person2) {
        this.person1 = person1;
        this.person2 = person2;
        this.score1 = 0;
        this.score2 = 0;
        this.isStart = true;

    }

    public String score(String name) {
        if (isStart) {
            isStart = false;
            return "love all";
        }

        if (name.equals(person1)) {
            score1 += 1;
        } else {
            score2 += 1;
        }

        return "";
    }

    public String scoreText(){
        if(score1 >= 3 && score2>=3){

        }else{
            if(score1 == 1 && score2==3){

            }
        }
    }
}
