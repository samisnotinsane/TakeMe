package io.zenia.takeme.AIProcessor;

import ai.api.AIListener;
import ai.api.model.AIError;
import ai.api.model.AIResponse;

/**
 * Created by Tahnik Mustasin on 04/02/2017.
 * This is the listener class which can take action
 * when the AI has started processing something
 */

public class TransportAIListener implements AIListener {
    @Override
    public void onResult(AIResponse result) {
        System.out.println(result.getResult());
    }

    @Override
    public void onError(AIError error) {
        System.err.println(error.getMessage());
    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {
        System.out.println("Starting listening");
    }

    @Override
    public void onListeningCanceled() {
        System.out.println("Listening has been canceled");
    }

    @Override
    public void onListeningFinished() {
        System.out.println("Listening finished");
    }
}
