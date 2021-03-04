public class Quiz {

    public static void main(String[] args) {

        Question questiontf1 = new TrueFalseQuestion(
                "The unicorn is the national animal of Scotland",
                "FALSE"
        );

        questiontf1.check();

        Question questiontf2 = new TrueFalseQuestion(
                "There are two parts of the body that can't heal themselves",
                "TRUE"
        );

        questiontf2.check();

        Question questiontf3 = new TrueFalseQuestion(
                "'A' is the most common letter used in the English language ",
                "FALSE"
        );

        questiontf3.check();

        Question questiontf4 = new TrueFalseQuestion(
                "In Harry Potter, Draco Malfoy has no siblings",
                "FALSE"
        );

        questiontf4.check();

        Question questiontf5 = new TrueFalseQuestion(
                "Bananas are curved because they grow upwards towards the sun",
                "TRUE"
        );

        questiontf5.check();

        Question question1 = new MultipleChoiceQuestion(
                "What's a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a");

        question1.check();

        Question question2 = new MultipleChoiceQuestion(
                "When is a quiz?",
                "a long, long ago",
                "right now",
                "the best of times",
                "the worst of times",
                "nevermore.",
                "b");

        question2.check();

        Question question3 = new MultipleChoiceQuestion(
                "Where is a quiz?",
                "a galaxy far, far away",
                "under the sea",
                "right here",
                "there and back again",
                "the other side of the mountain.",
                "c");

        question3.check();

        Question question4 = new MultipleChoiceQuestion(
                "What's the mass of sun",
                "1.8991 * 10^30 kg",
                "1.8991 * 10^28 kg",
                "336,000 times the mass of the Earth",
                "1.9891 * 10^30 kg",
                "a lot kilograms",
                "d");

        question4.check();

        Question question5 = new MultipleChoiceQuestion(
                "What year the human traveled into space for the first time?",
                "1951",
                "1961",
                "1969",
                "1963",
                "1968",
                "b");

        question5.check();

        question4.showResults();
    }
}