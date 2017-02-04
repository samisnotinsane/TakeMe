package io.zenia.takeme;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import ai.api.android.AIConfiguration;
import ai.api.android.AIService;
import io.zenia.takeme.AIProcessor.TransportAIListener;

/**
 * Created by Tahnik Mustasin on 04/02/2017.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AIConfiguration config = new AIConfiguration("46a8afd03cb640ba9d0ca77438eeb6c6",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);
        AIService aiService = AIService.getService(this, config);
        aiService.setListener(new TransportAIListener());

        Button startListening = (Button) findViewById(R.id.listen_start);
        startListening.setOnClickListener((e) -> {
            aiService.startListening();
        });

        Button stopListening = (Button) findViewById(R.id.listen_stop);
        stopListening.setOnClickListener((e) -> {
            aiService.stopListening();
        });

    }
}
