 
import javax.swing.JOptionPane;

public class ProblemAndAnswer 
{
    private String problem, answer;

     public ProblemAndAnswer() {
        this.problem = "";
        this.answer = "";
    }

    public ProblemAndAnswer(String problem, String answer) {
        this.problem = problem;
        this.answer = answer;
    }
 
    public void setProblem(String problem) {
        this.problem = problem;
    }
 
    public void setAnswer(String answer) {
        this.answer = answer;
    }
 
    public String getProblem() {
        return problem;
    }
 
    public String getAnswer() {
        return answer;
    }

    public boolean checkAnswer(String response){
        response=response.trim();
        return answer.equals(response);
        
    }
    
    public void displayProblem(){
        String res;
        res=JOptionPane.showInputDialog(null,problem+" = ?","MyBinaryMathLab");
   }

}
