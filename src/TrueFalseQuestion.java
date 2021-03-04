import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: "+question;
        super.correctAnswer = answer;
    }

    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("F") || answer.equals("N") || answer.equals("NO")) {
                answer = "FALSE";
            }else if (answer.equals("T") || answer.equals("Y") || answer.equals("YES")) {
                answer= "TRUE";}

            System.out.println(answer);

            boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));

            if (valid) return answer;

            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE");
        }
    }

}
