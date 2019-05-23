package com.example;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.example.Handler.*;

public class RecommendStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .withSkillId("amzn1.ask.skill.7faed922-1eca-4a4e-9069-9cb2b0a3435c")
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new RecommendIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                .build();
    }

    public RecommendStreamHandler() {
        super(getSkill());
    }
}
