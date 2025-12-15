/*

# Answer close reading 1 questions here

1. 1st team always starts first 
2. you know how many points a team earns for that play through the parameter of the recordPlay method 
3. when the parameter is 0 

# Answer close reading 2 questions here
1. name of t1, name of t2, score of t1, score of t2, active/who turn is it 
2. 

*/

// Write the class below

public class Scoreboard 
{
    private String t1; 
    private String t2;

    private int score1 = 0; 
    private int score2 = 0; 

    private boolean isOneActive; 

    public Scoreboard(string it1, string it2)
    {
        t1 = it1;
        t2 = it2; 

    } 

    {
        public void recordPlay(score)
        {
            if(score >= 1)
            {
                if (isOneActive)
                {
                    score1 += + score; 
                }
                else
                {
                    score2 += play; 
                }
            }
            else
            {
                isOneActive = !isOneActive; 
            }
            


        }

        public String getScore()
        {
            String output = score1 + "-" + score2 + "-";
            if(isOneActive)
            {
                output += t1;
            }
            else
            {
                output += t2; 
            }
            return output; 
        }


    }

}