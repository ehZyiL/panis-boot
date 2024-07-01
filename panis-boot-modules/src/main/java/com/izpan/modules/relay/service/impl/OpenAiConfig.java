package com.izpan.modules.relay.service.impl;

import com.ehzyil.relay.executor.model.chatgpt.config.ChatGPTConfig;
import com.ehzyil.relay.session.Configuration;
import com.ehzyil.relay.session.OpenAiSession;
import com.ehzyil.relay.session.OpenAiSessionFactory;
import com.ehzyil.relay.session.defaults.DefaultOpenAiSessionFactory;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@org.springframework.context.annotation.Configuration
public class OpenAiConfig {

    @Bean
    public OpenAiSession getOpenAiSession() throws IOException {
        ChatGPTConfig chatGPTConfig = new ChatGPTConfig();
        chatGPTConfig.setApiHost("http://ehzyil.xyz:3000/");
        chatGPTConfig.setApiKey("sk-K4aQCOAv5O3w882X7e275337A8A54c6bBaA584Db158629F4");

        Configuration configuration = new Configuration();
        configuration.setLevel(HttpLoggingInterceptor.Level.BODY);
//        configuration.setChatGPTConfig(chatGPTConfig);

        OpenAiSessionFactory factory = new DefaultOpenAiSessionFactory(configuration);
        return factory.openSession();
    }
}