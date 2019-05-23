package com.example.Handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class RecommendIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("RecommendIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Avengers";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Recommendation",speechText)
                .build();
    }
}
