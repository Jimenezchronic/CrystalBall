package android.jimenezb.crystalball;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions(){
        answers = new String[]{
          "your milk is spoiled!"
        };
    }

    public static Predictions get(){
        if(predictions == null){
            predictions = new Predictions();
        }
        return  predictions;
    }

    public String getprediction(){
        return answers[0];
    }
}
