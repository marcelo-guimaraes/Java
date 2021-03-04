public class Quiz {

    public static void main(String[] args) {

        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "What's a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a");

        question1.check();

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "When is a quiz?",
                "a long, long ago",
                "right now",
                "the best of times",
                "the worst of times",
                "nevermore.",
                "b");

        question2.check();

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
                "Where is a quiz?",
                "a galaxy far, far away",
                "under the sea",
                "right here",
                "there and back again",
                "the other side of the mountain.",
                "c");

        question3.check();

        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
                "What's the mass of sun",
                "1.8991 * 10^30 kg",
                "1.8991 * 10^28 kg",
                "336,000 times the mass of the Earth",
                "1.9891 * 10^30 kg",
                "a lot kilograms",
                "d");

        question4.check();

        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
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